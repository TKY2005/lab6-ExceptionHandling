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
				System.out.println("Couldn't write to output file");
				IOError.printStackTrace();
			}
		    } catch(FileNotFoundException fileError) {
			    System.out.println("Couldn't find the file requested");
			    fileError.printStackTrace();
		    }
	}
}
