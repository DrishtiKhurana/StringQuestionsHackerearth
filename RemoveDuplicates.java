package com.stringproblem.easy;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) throws IOException {

		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        while (stdin.hasNext()) {
            String inputString=stdin.nextLine();
            removeduplic(inputString);
        }
	}

	static void removeduplic(String inputString) {
		inputString.chars().mapToObj(e->Character.toString((char)e))
		.distinct()
		.forEach(System.out::print);
		System.out.println();
		
	}
	
}
