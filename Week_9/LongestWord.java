// Java program to find the number of charters
// in the longest word in the sentence.
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class LongestWord
{
	static int LongestWordLength(String str)
	{
	int n = str.length();
	int res = 0, curr_len = 0;
	for (int i = 0; i < n; i++)
	{
		// If current character is not
		// end of current word.
		if (str.charAt(i) != ' ')
			curr_len++;

		// If end of word is found
		else
		{
			res = Math.max(res, curr_len);
			curr_len = 0;
		}
	}

	// We do max one more time to consider
	// last word as there won't be any space
	// after last word.
	return Math.max(res, curr_len);
	}

	public static void main(String[] args)
	{
		try {
 
            // Creating a FileReader object and
            // file to be read is passed as in parameters
            // from the local directory of computer
            FileReader fr = new FileReader("src/gInput.txt");
 
            // FileReader will open that file from that
            // directory, if there is no file found it will
            // through an IOException
 
            // Creating a FileWriter object
            FileWriter fw = new FileWriter("gOutput.txt");
 
            // It will create a new file with name
            // "gfgOutput.text", if it is already available,
            // then it will open that instead
 
            // Declaring a blank string in which
            // whole content of file is to be stored
            String str = "";
 
            int i;
 
            // read() method will read the file character by
            // character and print it until it end the end
            // of the file
 
            // Condition check
            // Reading the file using read() method which
            // returns -1 at EOF while reading
            while ((i = fr.read()) != -1) {
 
                // Storing every character in the string
                str += (char)i;
            }
 
            // Print and display the string that
            // contains file data
            System.out.println(str);
			System.out.println(LongestWordLength(str));
            // Writing above string data to
            // FileWriter object
            fw.write(str);
 
            // Closing the file using close() method
            // of Reader class which closes the stream &
            // release resources that were busy in stream
            fr.close();
            fw.close();
 
            // Display message
            System.out.println(
                "File reading and writing both done");
        }
 
        // Catch block to handle the exception
        catch (IOException e) {
 
            // If there is no file in specified path or
            // any other error occurred during runtime
            // then it will print IOException
 
            // Display message
            System.out.println(
                "There are some IOException");
        }
	}
}
