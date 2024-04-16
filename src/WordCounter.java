import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//TODO: convert to another collection and sort and output

public class WordCounter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a text file name: ");

		String fileName = input.nextLine();
		
		input.close();

		Map<String, Integer> map = readFromFile(fileName);
		
		
		

	}

	//some code in this method came from dr johnson
	public static Map<String, Integer> readFromFile(String fileName) {

		Scanner in;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		try {
			
			in = new Scanner(new File(fileName));
			
			in.useDelimiter("[^a-zA-Z]+");
			
			while (in.hasNext()) {
				
				String theWord = in.next().toLowerCase();
				
				if(map.containsKey(theWord)) {
					
					map.put(theWord, map.get(theWord) + 1);
				
				} else {
				
					map.put(theWord, 1);
					
				}
				
			}
		
		} catch (FileNotFoundException e) {

			System.out.println("\nFile not found. Please provide a valid file name.");
			System.exit(0);
			
		}
		
		return map;

	}

}
