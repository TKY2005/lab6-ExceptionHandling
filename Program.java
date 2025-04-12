/*
 * Name: Youssef Mohamed Torki Ahmed
 * ID: 445820246
 * Lab6 Exception handling and file reading
 *
*/

import java.io.*;

public class Program{
	public static void main(String[]args) throws FileNotFoundException, IOException{
		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");

		try (
				BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
		    ){
			try{

				String content;
				while ( (content = reader.readLine()) != null){
					writer.append(content + "\n");
				}
				reader.close();
				writer.close();
			}catch (IOException IOError){
				System.out.println("Couldn't write to output file. Either There's an error preventing the system from creating the file or you don't have required permessions to write to the file.");
			}
		    } catch(FileNotFoundException fileError) {
			    System.out.println("Couldn't find input file. Either the path is wrong or the file doesn't exist.");
		    }
	}
}
