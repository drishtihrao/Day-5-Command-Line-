package com.cg.commandline;

//Calculating the sum of the three numbers given by user using the command line
public class CommandLine {
	public static void main(String[] args) {
		System.out.println("Sum of 3 numbers is "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2])) );
	}
}
