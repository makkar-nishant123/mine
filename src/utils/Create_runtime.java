package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Create_runtime {

	public static boolean create_Method(String class_path, String Method_name, String method_code) {
		String sourceCode = "";
		File sourceFile = new File(class_path);

		try {
			if (sourceFile.exists() && Files.size(sourceFile.toPath()) <= 0) {

				sourceCode = write_to_String(sourceCode, sourceFile, Method_name, method_code);
				return write_to_file(sourceFile, sourceCode);

			} else if (!sourceFile.exists()) {

				new File(sourceFile.getAbsolutePath().substring(0, sourceFile.getAbsolutePath().lastIndexOf("\\")))
				.mkdir();
				sourceFile.createNewFile();

				sourceCode = write_to_String(sourceCode, sourceFile, Method_name, method_code);
				return write_to_file(sourceFile, sourceCode);
			}

			else if (sourceFile.exists() && Files.size(sourceFile.toPath()) > 0) {
				sourceCode = read_class(class_path) + "@Test \n private  void " + Method_name + "(){\n " + method_code
						+ " \n} \n}";
				return write_to_file(sourceFile, sourceCode);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sourceFile.exists();
	}

	/*
	 * private static String read_import_class(LinkedList import_Classes) { //
	 * TODO Auto-generated method stub String final_statement; for (String
	 * cl_name : import_Classes) final_statement return null; }
	 */

	private static String write_to_String(String sourceCode, File sourceFile, String method_name, String method_code) {
		// TODO Auto-generated method stub
		String classname = sourceFile.getName().split("\\.")[0];
		String package_name = sourceFile.getParent().substring(sourceFile.getParent().lastIndexOf("\\") + 1,
				sourceFile.getParent().length());
		return ("package  " + package_name + "; \n import selenium_utils.*;\n " + " import org.testng.annotations.Test;"
				+ "\n public class " + classname + "{ \n " + "@Test \n private  void " + method_name + "(){ \n"
				+ method_code + " \n} \n}");

	}

	private static String read_class(String class_path) {
		/*
		 * FileInputStream fis;
		 * 
		 * try { fis = new FileInputStream(class_path); byte[] data = new
		 * byte[(int) class_path.length()]; fis.read(data); fis.close();
		 * 
		 * temp_source_code = new String(data, "UTF-8").trim(); temp_source_code
		 * = temp_source_code.substring(0, temp_source_code.length() - 1);
		 * System.out.println(temp_source_code); } catch (FileNotFoundException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); } catch
		 * (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		String temp_source_code = "";
		try (BufferedReader br = new BufferedReader(new FileReader(class_path))) {
			String line;
			while ((line = br.readLine()) != null) {
				// process the line.
				temp_source_code += line + "\n";
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		temp_source_code = temp_source_code.substring(0, temp_source_code.lastIndexOf("}"));

		return temp_source_code;

	}

	private static boolean write_to_file(File sourceFile, String sourceCode) {

		FileWriter writer;

		try {
			writer = new FileWriter(sourceFile);
			writer.write(sourceCode);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sourceFile.exists();

	}
}