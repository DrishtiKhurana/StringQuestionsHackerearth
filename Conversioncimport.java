package com.stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversioncimport {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		int testcases = Integer.parseInt(inputString);

		while (testcases > 0) {
			String a = br.readLine();
			covertintointform(a);
			testcases--;
		}
}

	 static void covertintointform(String a) {
		 String result="";
		 

		 for(int i=0;i<a.length();i++) {
			 char c=a.charAt(i);
			 if(Character.isLetter(c)) {
			
			char p=Character.toLowerCase(c);
			int pos = p - 'a' + 1; 
				result+=pos;
			 }
			 else {
				result+='$';
			 }
		}
		System.out.println(result);
	}
	
	
}
