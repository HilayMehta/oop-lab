import java.io.*;
import java.util.*;

public class Question3 {

	public static void main (String [] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		FileInputStream fin = null;
		Scanner fileScanner = null;

		int linesCount = 0, wordsCount = 0;
		long charactersCount = 0, digitsCount = 0, specialCharacters = 0;

		try {

			fin = new FileInputStream(new File(args[0]));
      //fin = new FileInputStream(new File("C:\\Users\\HilayMehtaLocal\\Desktop\\Java(3rd Semester)\\Lab Manual\\Week 10\\Input.txt"));
			fileScanner = new Scanner(fin);
			String searchItem = "";
		System.out.print("\n\tEnter search string: ");
		searchItem = sc.nextLine();

			while (fileScanner.hasNextLine()) {

				linesCount++;

				String str = fileScanner.nextLine();
				if (str.contains(searchItem)){
					System.out.println("Line " + linesCount + " " + str);
				}
			}
		}



		finally {
			fin.close();
			fileScanner.close();
		}



	}


}
