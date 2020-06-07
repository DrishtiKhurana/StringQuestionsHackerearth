package com.stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintFirstOccurance {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		int testcases = Integer.parseInt(inputString);

		while (testcases > 0) {
			String a = br.readLine();
			removeduplic(a);
			testcases--;
		}
}

	 static void removeduplic(String a) {
		
		 a.chars().mapToObj(e -> Character.toString((char) e))
         .distinct()
         .forEach(System.out::print);
		 System.out.println();
		
	}
}