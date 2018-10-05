//Java imports
import java.util.HashMap;
import java.util.List;
//imports for hlcl 
import com.variamos.hlcl.core.HlclProgram; 
import com.variamos.hlcl.model.expressions.HlclFactory; 
import com.variamos.hlcl.model.domains.BinaryDomain;
import com.variamos.hlcl.model.domains.IntervalDomain;
import com.variamos.hlcl.model.domains.RangeDomain;
import com.variamos.hlcl.model.domains.StringDomain;
import com.variamos.hlcl.model.expressions.Identifier;
import com.variamos.hlcl.model.expressions.IntBooleanExpression;
import com.variamos.hlcl.model.expressions.NumericIdentifier;
import com.variamos.hlcl.model.expressions.SymbolicExpression;
import com.variamos.hlcl.model.expressions.IntNumericExpression;

//imports for solver
import com.variamos.solver.core.SWIPrologSolver;
import com.variamos.solver.core.compiler.Hlcl2SWIProlog;
import com.variamos.solver.model.SolverSolution;

/**
* This class is automatically generated from a product line model described in 
* constraint programming HLCL
* @author Angela Villota 
* @version CP-HLCL Version1
*
*/
public class Cardinality_HLCL { 			
	
	private String modelName;
	private HlclFactory factory;
	private HlclProgram hlclProgram;
	private SWIPrologSolver swiSolver;
	private String prologProgram;
	private HashMap<String,IntBooleanExpression> constraints;
	private HashMap<String,Identifier> variables;
	private HashMap<String,NumericIdentifier> numbers;
	/**
	* This is an autogenerated method* Constructor method
	* @param modelName is the name of the model in the  CP-HLCL specification
	*/
	public Cardinality_HLCL(String modelName){ 				
		
		this.modelName= modelName;
		hlclProgram= new HlclProgram();
		factory = new HlclFactory();
		variables= new HashMap<String,Identifier>();
		constraints= new HashMap<String,IntBooleanExpression>();
		numbers= new HashMap<String,NumericIdentifier>();
		NumericIdentifier one = factory.number(1);
		NumericIdentifier zero= factory.number(0);
		numbers.put("1", one);
		numbers.put("0", zero);
	} 			
	public static void main(String[] args) {
		Cardinality_HLCL obj = new Cardinality_HLCL("Cardinality_HLCL");
		obj.run();
	}
	public void run(){
		// first obtain a HlclProgram from the specification
		transformVars();
		transformConstraints(); 
		// use the solver to solve the constraint program
		evaluateSatisfiability();
		//show the output
		System.out.println(prologProgram);
	}
	public void transformVars() {
//declaring variable MCS
Identifier MCS = factory.newIdentifier("MCS");
  			BinaryDomain MCSDom= new BinaryDomain();
MCS.setDomain(MCSDom);	
variables.put("MCS", MCS); //including the variable in the map
//declaring variable Processor
Identifier Processor = factory.newIdentifier("Processor");
  			BinaryDomain ProcessorDom= new BinaryDomain();
Processor.setDomain(ProcessorDom);	
variables.put("Processor", Processor); //including the variable in the map
//declaring variable Memory
Identifier Memory = factory.newIdentifier("Memory");
  			BinaryDomain MemoryDom= new BinaryDomain();
Memory.setDomain(MemoryDom);	
variables.put("Memory", Memory); //including the variable in the map
//declaring variable Processor1
Identifier Processor1 = factory.newIdentifier("Processor1");
  			BinaryDomain Processor1Dom= new BinaryDomain();
Processor1.setDomain(Processor1Dom);	
variables.put("Processor1", Processor1); //including the variable in the map
//declaring variable Processor2
Identifier Processor2 = factory.newIdentifier("Processor2");
  			BinaryDomain Processor2Dom= new BinaryDomain();
Processor2.setDomain(Processor2Dom);	
variables.put("Processor2", Processor2); //including the variable in the map
//declaring variable Memory1
Identifier Memory1 = factory.newIdentifier("Memory1");
  			BinaryDomain Memory1Dom= new BinaryDomain();
Memory1.setDomain(Memory1Dom);	
variables.put("Memory1", Memory1); //including the variable in the map
//declaring variable Memory2
Identifier Memory2 = factory.newIdentifier("Memory2");
  			BinaryDomain Memory2Dom= new BinaryDomain();
Memory2.setDomain(Memory2Dom);	
variables.put("Memory2", Memory2); //including the variable in the map
//declaring variable Processor1_Mem1
Identifier Processor1_Mem1 = factory.newIdentifier("Processor1_Mem1");
  			BinaryDomain Processor1_Mem1Dom= new BinaryDomain();
Processor1_Mem1.setDomain(Processor1_Mem1Dom);	
variables.put("Processor1_Mem1", Processor1_Mem1); //including the variable in the map
//declaring variable Processor1_Mem2
Identifier Processor1_Mem2 = factory.newIdentifier("Processor1_Mem2");
  			BinaryDomain Processor1_Mem2Dom= new BinaryDomain();
Processor1_Mem2.setDomain(Processor1_Mem2Dom);	
variables.put("Processor1_Mem2", Processor1_Mem2); //including the variable in the map
//declaring variable Processor2_Mem1
Identifier Processor2_Mem1 = factory.newIdentifier("Processor2_Mem1");
  			BinaryDomain Processor2_Mem1Dom= new BinaryDomain();
Processor2_Mem1.setDomain(Processor2_Mem1Dom);	
variables.put("Processor2_Mem1", Processor2_Mem1); //including the variable in the map
//declaring variable Processor2_Mem2
Identifier Processor2_Mem2 = factory.newIdentifier("Processor2_Mem2");
  			BinaryDomain Processor2_Mem2Dom= new BinaryDomain();
Processor2_Mem2.setDomain(Processor2_Mem2Dom);	
variables.put("Processor2_Mem2", Processor2_Mem2); //including the variable in the map
	}
	public void transformConstraints() {
//
//declaring constraint c0


Identifier c0_left = variables.get("MCS");

NumericIdentifier c0_right = getValue("1");
IntBooleanExpression c0=
factory.equals(c0_left, c0_right);
constraints.put("c0", c0);
hlclProgram.add(c0);
//
//declaring constraint c1


Identifier c1_left = variables.get("Processor");


Identifier c1_right_left = variables.get("Processor1");

NumericIdentifier c1_right_right = getValue("0");
IntBooleanExpression c1_right=
factory.greaterOrEqualsThan(c1_right_left, c1_right_right);
IntBooleanExpression c1=factory.implies(c1_left, c1_right);		
constraints.put("c1", c1);
hlclProgram.add(c1);
//
//declaring constraint c2


Identifier c2_left = variables.get("Processor1");

Identifier c2_right = variables.get("Processor");
IntBooleanExpression c2=factory.implies(c2_left, c2_right);		
constraints.put("c2", c2);
hlclProgram.add(c2);
//
//declaring constraint c3


Identifier c3_left = variables.get("Processor");


Identifier c3_right_left = variables.get("Processor2");

NumericIdentifier c3_right_right = getValue("0");
IntBooleanExpression c3_right=
factory.greaterOrEqualsThan(c3_right_left, c3_right_right);
IntBooleanExpression c3=factory.implies(c3_left, c3_right);		
constraints.put("c3", c3);
hlclProgram.add(c3);
//
//declaring constraint c4


Identifier c4_left = variables.get("Processor2");

Identifier c4_right = variables.get("Processor");
IntBooleanExpression c4=factory.implies(c4_left, c4_right);		
constraints.put("c4", c4);
hlclProgram.add(c4);
//
//declaring constraint c5


NumericIdentifier c5_left = getValue("1");


Identifier c5_right_left = variables.get("Processor1");

Identifier c5_right_right = variables.get("Processor2");
IntNumericExpression c5_right=factory.sum(c5_right_left, c5_right_right);	
IntBooleanExpression c5=
factory.lessOrEqualsThan(c5_left, c5_right);
constraints.put("c5", c5);
hlclProgram.add(c5);
//
//declaring constraint c6



Identifier c6_left_left = variables.get("Processor1");

Identifier c6_left_right = variables.get("Processor2");
IntNumericExpression c6_left=factory.sum(c6_left_left, c6_left_right);	

NumericIdentifier c6_right = getValue("2");
IntBooleanExpression c6=
factory.lessOrEqualsThan(c6_left, c6_right);
constraints.put("c6", c6);
hlclProgram.add(c6);
//
//declaring constraint c7


Identifier c7_left = variables.get("Memory");


Identifier c7_right_left = variables.get("Memory1");

NumericIdentifier c7_right_right = getValue("0");
IntBooleanExpression c7_right=
factory.greaterOrEqualsThan(c7_right_left, c7_right_right);
IntBooleanExpression c7=factory.implies(c7_left, c7_right);		
constraints.put("c7", c7);
hlclProgram.add(c7);
//
//declaring constraint c8


Identifier c8_left = variables.get("Memory1");

Identifier c8_right = variables.get("Memory");
IntBooleanExpression c8=factory.implies(c8_left, c8_right);		
constraints.put("c8", c8);
hlclProgram.add(c8);
//
//declaring constraint c9


Identifier c9_left = variables.get("Memory");


Identifier c9_right_left = variables.get("Memory2");

NumericIdentifier c9_right_right = getValue("0");
IntBooleanExpression c9_right=
factory.greaterOrEqualsThan(c9_right_left, c9_right_right);
IntBooleanExpression c9=factory.implies(c9_left, c9_right);		
constraints.put("c9", c9);
hlclProgram.add(c9);
//
//declaring constraint c10


Identifier c10_left = variables.get("Memory2");

Identifier c10_right = variables.get("Memory");
IntBooleanExpression c10=factory.implies(c10_left, c10_right);		
constraints.put("c10", c10);
hlclProgram.add(c10);
//
//declaring constraint c11


NumericIdentifier c11_left = getValue("1");


Identifier c11_right_left = variables.get("Memory1");

Identifier c11_right_right = variables.get("Memory2");
IntNumericExpression c11_right=factory.sum(c11_right_left, c11_right_right);	
IntBooleanExpression c11=
factory.lessOrEqualsThan(c11_left, c11_right);
constraints.put("c11", c11);
hlclProgram.add(c11);
//
//declaring constraint c12



Identifier c12_left_left = variables.get("Memory1");

Identifier c12_left_right = variables.get("Memory2");
IntNumericExpression c12_left=factory.sum(c12_left_left, c12_left_right);	

NumericIdentifier c12_right = getValue("2");
IntBooleanExpression c12=
factory.lessOrEqualsThan(c12_left, c12_right);
constraints.put("c12", c12);
hlclProgram.add(c12);
//
//declaring constraint c14


Identifier c14_left = variables.get("MCS");

Identifier c14_right = variables.get("Processor");
IntBooleanExpression c14=
factory.equals(c14_left, c14_right);
constraints.put("c14", c14);
hlclProgram.add(c14);
//
//declaring constraint C16


Identifier C16_left = variables.get("Processor");

Identifier C16_right = variables.get("Memory");
IntBooleanExpression C16=
factory.equals(C16_left, C16_right);
constraints.put("C16", C16);
hlclProgram.add(C16);
//
//declaring constraint C17


Identifier C17_left = variables.get("Processor1");



NumericIdentifier C17_right_left_left = getValue("1");


Identifier C17_right_left_right_left = variables.get("Processor1_Mem1");

Identifier C17_right_left_right_right = variables.get("Processor1_Mem2");
IntNumericExpression C17_right_left_right=factory.sum(C17_right_left_right_left, C17_right_left_right_right);	
IntBooleanExpression C17_right_left=
factory.lessOrEqualsThan(C17_right_left_left, C17_right_left_right);



Identifier C17_right_right_left_left = variables.get("Processor1_Mem1");

Identifier C17_right_right_left_right = variables.get("Processor1_Mem2");
IntNumericExpression C17_right_right_left=factory.sum(C17_right_right_left_left, C17_right_right_left_right);	

NumericIdentifier C17_right_right_right = getValue("2");
IntBooleanExpression C17_right_right=
factory.lessOrEqualsThan(C17_right_right_left, C17_right_right_right);
IntBooleanExpression C17_right=factory.and(C17_right_left, C17_right_right);		
IntBooleanExpression C17=factory.implies(C17_left, C17_right);		
constraints.put("C17", C17);
hlclProgram.add(C17);
//
//declaring constraint C18



Identifier C18_left_left = variables.get("Memory1");

Identifier C18_left_right = variables.get("Processor1");
IntBooleanExpression C18_left=factory.and(C18_left_left, C18_left_right);		

Identifier C18_right = variables.get("Processor1_Mem1");
IntBooleanExpression C18=factory.doubleImplies(C18_left, C18_right);		
constraints.put("C18", C18);
hlclProgram.add(C18);
//
//declaring constraint C19



Identifier C19_left_left = variables.get("Memory2");

Identifier C19_left_right = variables.get("Processor1");
IntBooleanExpression C19_left=factory.and(C19_left_left, C19_left_right);		

Identifier C19_right = variables.get("Processor1_Mem2");
IntBooleanExpression C19=factory.doubleImplies(C19_left, C19_right);		
constraints.put("C19", C19);
hlclProgram.add(C19);
//
//declaring constraint C20


Identifier C20_left = variables.get("Processor2");



NumericIdentifier C20_right_left_left = getValue("1");


Identifier C20_right_left_right_left = variables.get("Processor2_Mem1");

Identifier C20_right_left_right_right = variables.get("Processor2_Mem2");
IntNumericExpression C20_right_left_right=factory.sum(C20_right_left_right_left, C20_right_left_right_right);	
IntBooleanExpression C20_right_left=
factory.lessOrEqualsThan(C20_right_left_left, C20_right_left_right);



Identifier C20_right_right_left_left = variables.get("Processor2_Mem1");

Identifier C20_right_right_left_right = variables.get("Processor2_Mem2");
IntNumericExpression C20_right_right_left=factory.sum(C20_right_right_left_left, C20_right_right_left_right);	

NumericIdentifier C20_right_right_right = getValue("2");
IntBooleanExpression C20_right_right=
factory.lessOrEqualsThan(C20_right_right_left, C20_right_right_right);
IntBooleanExpression C20_right=factory.and(C20_right_left, C20_right_right);		
IntBooleanExpression C20=factory.implies(C20_left, C20_right);		
constraints.put("C20", C20);
hlclProgram.add(C20);
//
//declaring constraint C21


Identifier C21_left = variables.get("Processor2_Mem1");


Identifier C21_right_left = variables.get("Memory1");

Identifier C21_right_right = variables.get("Processor2");
IntBooleanExpression C21_right=factory.and(C21_right_left, C21_right_right);		
IntBooleanExpression C21=factory.doubleImplies(C21_left, C21_right);		
constraints.put("C21", C21);
hlclProgram.add(C21);
//
//declaring constraint C22


Identifier C22_left = variables.get("Processor2_Mem2");


Identifier C22_right_left = variables.get("Memory2");

Identifier C22_right_right = variables.get("Processor2");
IntBooleanExpression C22_right=factory.and(C22_right_left, C22_right_right);		
IntBooleanExpression C22=factory.doubleImplies(C22_left, C22_right);		
constraints.put("C22", C22);
hlclProgram.add(C22);
	}
	public boolean evaluateSatisfiability(){
		// the output
		boolean evaluation= false;
		// //to transform the hllcl program into a prolog  file, 
		// //these lines are commented because they are useful for debugging 
		Hlcl2SWIProlog swiPrologTransformer = new Hlcl2SWIProlog(); 
		prologProgram = swiPrologTransformer.transform(hlclProgram);
				
		// an instance of the solver for Swiprolog 
		swiSolver= new SWIPrologSolver();
		swiSolver.setHLCLProgram(hlclProgram); //passing the hlcl program to the solver
		swiSolver.solve(); // This methhod prepares the solver 
		List<SolverSolution> solutions = swiSolver.getAllSolutions(); // Consulting if the solver has one solution
			evaluation= solutions.size()>0;
			for (SolverSolution solverSolution : solutions) {
				System.out.println(solverSolution.toString());
			}	return evaluation;
	}
	/** 
	* To obtain the NumericIdentifier representation of a value 
	* @param id the string with the value 
	* @return the NumericIdentifier 
	*/
	public NumericIdentifier getValue(String id) {	NumericIdentifier value= numbers.get(id); 
	 	if (value==null) { 
	 		if (id.equals("selected")) { 
	 			value= numbers.get("1"); 
	 		} 
	 		else if(id.equals("unselected")) {
				value= numbers.get("0"); 
			} 
			else { 
				value= factory.number(Integer.parseInt(id)); 
				numbers.put(id, value);
			}
	 	} 
	 	return value; 
	 } 
		public String getModelName() {
			return modelName;
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public HlclFactory getFactory() {
			return factory;
		}
		public void setFactory(HlclFactory factory) {
			this.factory = factory;
		}
		public HlclProgram getHlclProgram() {
			return hlclProgram;
		}
		public void setHlclProgram(HlclProgram hlclProgram) {
			this.hlclProgram = hlclProgram;
		}
} 	