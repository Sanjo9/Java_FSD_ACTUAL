package com.dell.filereader;


	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	 
	// Main class
	public class fileWriter {
	 
	    // Main driver method
	    public static void main(String[] args)
	    {
	 
	        // Assigning the file content
	        // Note: Custom contents taken as input to
	        // illustrate
	        String text
	            = "Writing in to text file";
	 
	        // Try block to check for exceptions
	        try {
	 
	            // Step 1: Create an object of BufferedWriter
	            BufferedWriter f_writer= new BufferedWriter(new FileWriter("C:\\Users\\joshis15\\Desktop\\log_2.txt"));
	 
	            // Step 2: Write text(content) to file
	            f_writer.write(text);
	 
	            // Step 3: Printing the content inside the file
	            // on the terminal/CMD
	            System.out.print(text);
	 
	            // Step 4: Display message showcasing
	            // successful execution of the program
	            System.out.print("is created successfully with the content.");
	 
	            // Step 5: Close the BufferedWriter object
	            f_writer.close();
	        }
	 
	        // Catch block to handle if exceptions occurs
	        catch (IOException e) {
	 
	            // Print the exception on console
	            // using getMessage() method
	            System.out.print(e.getMessage());
	        }
	    }
	}
	
