package com.stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DNAPride {

	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String inputString = br.readLine();
		 int testcases = Integer.parseInt (inputString);
	        
		 while(testcases>0) {
			 
			 String length = br.readLine();
			 int len = Integer.parseInt(length);
			 String a = br.readLine();
			finddnapride(a, len);
			testcases--;
	}
}

	 static void finddnapride(String a, int len) {
		
		 
		 char charArray[] = a.toCharArray();
		 int i=0;
		while(i<len) {
			char c=a.charAt(i);
			if(c=='A') {
				charArray[i]='T';
			}
			else if(c=='T') {
				charArray[i]='A';
			}
			else if(c=='G') {
				charArray[i]='C';
			}
			else if(c=='C') {
				charArray[i]='G';
			}
			else {
				
				break;
			}
			i++;
		}
		
		if(i==len) {
			System.out.println(charArray);
		}
		else {
			System.out.println("Error RNA nucleobases found!");
		}
		
		
	}

	 
}