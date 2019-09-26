package com.cg.labten;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MyMain {
	public static void main(String[] args) throws FileNotFoundException {
		
		File fileout = new File("D:\\sampleoutput.txt");
		FileInputStream fip = new FileInputStream(fileout);
		FileOutputStream fout= new FileOutputStream(fileout);
		ExerciseOne exerciseOne = new ExerciseOne(fip, fout);
		exerciseOne.run();
		
		ExerciseTwo exerciseTwo = new ExerciseTwo();
		exerciseTwo.run();
	}
}
