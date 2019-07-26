package com.coffee.coffeeParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;


import at.siemens.ct.jmz.executor.IExecutor;
import at.siemens.ct.jmz.parser.MiniZincOutputParser;
import utils.JsonMng;

public class CoffeeMiniZincParser extends MiniZincOutputParser{
	private static final String SEPARATOR="----------\n";
	//private JsonObjectBuilder builder ;
	private IExecutor executor;
	private int numSolutions;

	public CoffeeMiniZincParser(IExecutor executor) {
		super(executor);
		this.executor= executor;
	}
	

	
	public int getExitCode() {
		return executor.getLastExitCode();
	}
	

	/**
	 * Method to produce a Collection of solver solutions
	 * @return
	 */
	public List<Solution> getListSolutions(){
		List<Solution> out =new ArrayList<Solution>();
		String solutionsFromExecutor= executor.getLastSolverOutput();
		if (solutionsFromExecutor.startsWith("% solving")) {
			solutionsFromExecutor = solutionsFromExecutor.substring(solutionsFromExecutor.indexOf(System.getProperty("line.separator"))+1);
			solutionsFromExecutor = solutionsFromExecutor.substring(solutionsFromExecutor.indexOf(System.getProperty("line.separator"))+1);
		}
		String[] solutions= solutionsFromExecutor.split(SEPARATOR);
		//obtaining the number of solutions
		
		
		for (int s = 0; s < solutions.length; s++) {
			out.add(createSolution(solutions[s]));
		}
		numSolutions= out.size();
		return out;
	}
	
	private Solution createSolution(String solution) {
		Solution sol = new Solution();
		Map<String,String> valuations = new HashMap<String,String>();
		
		String[] parts= solution.split("\n% time elapsed: ");
		String ln = System.getProperty("line.separator");
		
		StringTokenizer st = new StringTokenizer(parts[0]);
		
		while (st.hasMoreTokens()) {
			String key, value;
			key = st.nextToken();
			st.nextToken();
			value = st.nextToken().replace(";", "");
			valuations.put(key, value);
	         //System.out.println(key + ", "+ value);
	     }
		
		//FIXME change this to a number
		sol.setSolverTime(parts[1].split(" ")[0]);
		sol.setValuations(valuations);
		
		
		
		return sol;
	}
	public JsonArray getSolutions() {
		
		JsonArrayBuilder array = Json.createArrayBuilder();
		String solutionsFromExecutor= executor.getLastSolverOutput();
		if (solutionsFromExecutor.startsWith("% solving")) {
			solutionsFromExecutor = solutionsFromExecutor.substring(solutionsFromExecutor.indexOf(System.getProperty("line.separator"))+1);
			solutionsFromExecutor = solutionsFromExecutor.substring(solutionsFromExecutor.indexOf(System.getProperty("line.separator"))+1);
		}
						
		String[] solutions= solutionsFromExecutor.split(SEPARATOR);
		
		
		//obtaining the number of solutions
		numSolutions= solutions.length;
		
		for (int s = 0; s < solutions.length; s++) {
			array.add(processSolution(solutions[s]));
		}
		return array.build();
	}
	
	public JsonObject processSolution(String solution) {
		
		String[] parts= solution.split("\n% time elapsed: ");
		String ln = System.getProperty("line.separator");		
		//solution
		String solutionString= parts[0].replaceAll(";"+ln, ","+ln+"\"").replaceAll(" = ", "\" : ");		
		solutionString= "{\""+ solutionString.replace(";", "") + "}";
		
		//time
		//System.out.println(solutionString);
		JsonObject object= JsonMng.getfromString(solutionString);
		JsonObjectBuilder builder= Json.createObjectBuilder(object);
		//builder.add(solutionString);
		builder.add("solverTime", parts[1].split(" ")[0]);
		//builder.add(object);
		
		return builder.build();
	}
	
	public int getNumSolutions() {
		return numSolutions;
	}
	
	
}
