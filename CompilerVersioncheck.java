package com.stringproblem;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CompilerVersioncheck {

	public static void main(String[] args) throws IOException {

		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        while (stdin.hasNext()) {
            String inputString=stdin.nextLine();
            convert(inputString);
        }
	}

	 static void convert(String input) {
		 StringBuilder inputString=new StringBuilder(input);
		for(int i=0;i<inputString.length()-1;i++) {
			char c=inputString.charAt(i);
			
			if(inputString.charAt(i)=='-' && inputString.charAt(i+1)=='>') {
				inputString.setCharAt(i, '.');
				inputString.deleteCharAt(i+1);
				
				
			}
			
			if(inputString.charAt(i)=='/' && inputString.charAt(i+1)=='/') {
				break;
			}
		}
		System.out.println(inputString);
	}

}