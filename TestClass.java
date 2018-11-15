
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		
		String fileName;
		File inputFile;									
		Scanner input;
		int count;
		int[] cell;
		
		fileName = "validPuzzle2.txt"; 	//must be a plain text file with 81 integers separated by spaces; use 0 for empty spaces in puzzle
		inputFile = null;
		input = null;
		count = 0;
		cell = new int[81];
		
		try {
			inputFile = new File(fileName);
			input = new Scanner(inputFile);				
		}
		catch(FileNotFoundException e) {
			System.out.println("Error accessing file");
			System.exit(0);
		}
		
		while(input.hasNextInt()) {						
			
			cell[count] = (input.nextInt());
			count++;
		}				
		
		input.close();
		
		Board puzzle = new Board(cell);
		if (puzzle.isSolved()) {
			System.out.println("Puzzle Solved! Here is the solution:");
			System.out.println(puzzle.getSolution());
			}
		
		else System.out.println("Error solving puzzle.");
		
		
	}
}
