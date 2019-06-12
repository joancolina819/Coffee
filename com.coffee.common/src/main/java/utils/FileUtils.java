package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class FileUtils {
	/**
	 * Lee la lista de archivos de un directorio
	 * 
	 * @param directoryPath
	 * @return
	 */
	public static List<File> readFileFromDirectory(String directoryPath) {
		File Dir = new File(directoryPath);
		List<File> fileList = new ArrayList<File>();
		File[] lista_Archivos = Dir.listFiles();
		if (lista_Archivos != null) {
			for (int i = 0; i < lista_Archivos.length; i++) {
				if (lista_Archivos[i].isFile()) {
					fileList.add(lista_Archivos[i]);
				}

			}
		}
		return fileList;

	}

	/**
	 * Recibe una cadena y la escribe en un archivo de extension hlvl
	 * 
	 * @param program
	 */
	public static void writeHLVLProgram(String path, String program)  {
		try {
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			salida.println(program);
			salida.close();
		} catch (java.io.IOException ioex) {
			System.out.println("An error occured when writing the hlvl file " + ioex.toString());
		}
	}
	
	public static void writeJSON(String path, JsonMng json) {
		try {
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			salida.println(json.toString());
			salida.close();
		} catch (java.io.IOException ioex) {
			System.out.println("An error occured when generating the JSON file " + ioex.toString());
		}
		
	}

}
