import java.io.*;

public class Question2{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = null;

    int charCount = 0;
    int wordCount = 0;
    int lineCount = 0;

    reader = new BufferedReader(new FileReader("C:\\Users\\HilayMehtaLocal\\Desktop\\Java(3rd Semester)\\Lab Manual\\Week 10\\Input.txt"));
    String currentLine = reader.readLine();

    while(currentLine != null){
      lineCount++;
      String[]  words = currentLine.split(" ");
      wordCount = wordCount + words.length;
      for(String word : words){
        charCount = charCount + word.length();
      }
      currentLine = reader.readLine();

    }
    System.out.println("Number of chars in a file " + charCount);
    System.out.println("Number of words in a file " + wordCount);
  }
}


/// From GitHub

/*import java.io.*;
import java.util.*;

public class Question2 {

	public static void main (String [] args) throws IOException {
  ///*  BufferedReader reader = null;

		FileInputStream fin = null;
		Scanner fileScanner = null;

		int linesCount = 0, wordsCount = 0;
		long charactersCount = 0, digitsCount = 0, specialCharacters = 0;

		try {

			fin = new FileInputStream(new File(args[0]));
      //fin = new FileInputStream(new File("C:\\Users\\HilayMehtaLocal\\Desktop\\Java(3rd Semester)\\Lab Manual\\Week 10\\Input.txt"));
			fileScanner = new Scanner(fin);

			while (fileScanner.hasNextLine()) {

				linesCount++;

				String str = fileScanner.nextLine();
				StringTokenizer st = new StringTokenizer(str);

				wordsCount += st.countTokens();

				for (char ch : str.toCharArray()) {
					if (isCharacter(ch))
						charactersCount++;
					else if (isDigit(ch))
						digitsCount++;
					else if (ch != ' ')
						specialCharacters++;
				}
			}

		}
		finally {
			fin.close();
			fileScanner.close();
		}

		PrintWriter pw = new PrintWriter(System.out, true);

		pw.println(	"\n\t File name | " + args[0] +
					"\n\t     Lines | " + linesCount +
					"\n\t     Words | " + wordsCount +
					"\n\tCharacters | " + charactersCount +
					"\n\t    Digits | " + digitsCount +
					"\n\t   Special | " + specialCharacters + "\n\n");

	}

	private static boolean isCharacter (char ch) {
		return ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'));
	}

	private static boolean isDigit (char ch) {
		return (ch >= '0' && ch <= '9');
	}

}*/
