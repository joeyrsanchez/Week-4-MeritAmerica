package week4;

import acm.program.ConsoleProgram;
import acm.util.*;
import acm.io.*;

import java.io.BufferedReader;
import java.util.*;

public class WordCount extends ConsoleProgram {
		
	public void run() {
		int numOfLines = 0;
		int numOfChars = 0;
		
		BufferedReader reader = textReader ("File: test.txt");
		
		try {
			while (true) {
				String line = reader.readLine();
				if (line != null) {
					numOfLines++;
					numOfChars += line.length();
				}
				reader.close();
			}
		}catch (IOException ex) {
			System.out.println("error");
		}
		println("Lines: " + numOfLines);
		println ("Chars: "+ numOfChars);
	}
	
	private BufferedReader textReader(String txt) {
		return null;
	}
		BufferedReader reader = null
				
				while (reader == null)
					try {
						String text = readLine(txt);
						
						reader = new BufferedReader
					}
	}
	

