package com.stringproblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		int testcases = Integer.parseInt(inputString);

			String a = br.readLine();
			joinchar(a);
	
	}

	private static void joinchar(String a) {
		String p = a.replaceAll("\\s+","");
		System.out.println(p);
	}
}
