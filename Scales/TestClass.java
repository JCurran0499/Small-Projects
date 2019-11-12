/*
 * John Curran
 * 
 * This class will use the methods in Note.java
 * Here, we will prompt the user what note they want, and then 
 * give them several options, ranging from changing their note, 
 * printing a given scale for the note, and exiting the program
 */

package Scales;

import java.util.Scanner;

public class TestClass {	
	
	public static void main(String args[]) {		
		Scanner myScanner = new Scanner(System.in);
		Note note = new Note(0);
		System.out.print("Enter a note: ");
		String noteString = myScanner.next();
		noteString = noteString.toUpperCase();		
		
		if (noteString.equals("AB") || noteString.equals("G#")) {
			note = new Note(1);
			System.out.println("You have chosen " + note.toString());	
		} else if (noteString.equals("A")) {
			note = new Note(2);
			System.out.println("You have chosen " + note.toString());	
		} else if (noteString.equals("BB") || noteString.equals("A#")) {
			note = new Note(3);
			System.out.println("You have chosen " + note.toString());	
		} else if (noteString.equals("B") || noteString.equals("CB")) {
			note = new Note(4);
			System.out.println("You have chosen " + note.toString());	
		} else if (noteString.equals("C") || noteString.equals("B#")) {
			note = new Note(5);
			System.out.println("You have chosen " + note.toString());	
		} else if (noteString.equals("DB") || noteString.equals("C#")) {
			note = new Note(6);
			System.out.println("You have chosen " + note.toString());	
		} else if (noteString.equals("D")) {
			note = new Note(7);
			System.out.println("You have chosen " + note.toString());	
		} else if (noteString.equals("EB") || noteString.equals("D#")) {
			note = new Note(8);
			System.out.println("You have chosen " + note.toString());	
		} else if (noteString.equals("E") || noteString.equals("FB")) {
			note = new Note(9);
			System.out.println("You have chosen " + note.toString());	
		} else if (noteString.equals("F") || noteString.equals("E#")) {
			note = new Note(10);
			System.out.println("You have chosen " + note.toString());	
		} else if (noteString.equals("GB") || noteString.equals("F#")) {
			note = new Note(11);
			System.out.println("You have chosen " + note.toString());	
		} else if (noteString.equals("G")) {
			note = new Note(12);
			System.out.println("You have chosen " + note.toString());	
		} else {
			System.out.println("Not valid");
			System.out.println();
			main(null);
		}
		
		System.out.println();		
		choices(myScanner, note);		
		myScanner.close();		
	}
		
	public static void choices(Scanner myScanner, Note note) {
		System.out.println("1. Change your note");
		System.out.println("2. Major Scale");
		System.out.println("3. Minor Scale");
		System.out.println("4. Dorian Mode");
		System.out.println("5. Mixolydian Mode");
		System.out.println("6. Lydian Mode");
		System.out.println("7. Blues Scale");
		System.out.println("8. Exit");
		System.out.print("Choose one: ");
		int choice = myScanner.nextInt();
			
		String s;
		Note[] scale;
		switch(choice) {
			case 1:
				System.out.print("Bring the note up (0) or down? (1): ");
				int x = myScanner.nextInt();
				
				if (x == 0) {
					System.out.print("How many steps?: ");
					double y = myScanner.nextDouble();
					note = note.upSteps(y);
					System.out.println("You have moved your note up " + y + " steps! Your new note is " + note.toString());
					System.out.println();
					choices(myScanner, note);
				} else if (x == 1) {
					System.out.print("How many steps?: ");
					double y = myScanner.nextDouble();
					note = note.downSteps(y);
					System.out.println("You have moved your note down " + y + " steps! Your new note is " + note.toString());
					System.out.println();
					choices(myScanner, note);
				} else {
					System.out.println();
					choices(myScanner, note);
				}
				break;
			case 2:
				s = "";
				scale = note.majorScale();
				for(int i = 0; i < scale.length - 1; i++)
					s += scale[i].toString() + ", ";

				s += scale[scale.length - 1];
				System.out.println(s);
				System.out.println();
				choices(myScanner, note);
				break;
			case 3:
				s = "";
				scale = note.minorScale();
				for(int i = 0; i < scale.length - 1; i++)
					s += scale[i].toString() + ", ";

				s += scale[scale.length - 1];
				System.out.println(s);
				System.out.println();
				choices(myScanner, note);
				break;
			case 4:
				s = "";
				scale = note.dorianScale();
				for(int i = 0; i < scale.length - 1; i++)
					s += scale[i].toString() + ", ";

				s += scale[scale.length - 1];
				System.out.println(s);
				System.out.println();
				choices(myScanner, note);
				break;
			case 5:
				s = "";
				scale = note.mixolydianScale();
				for(int i = 0; i < scale.length - 1; i++)
					s += scale[i].toString() + ", ";

				s += scale[scale.length - 1];
				System.out.println(s);
				System.out.println();
				choices(myScanner, note);
				break;
			case 6:
				s = "";
				scale = note.lydianScale();
				for(int i = 0; i < scale.length - 1; i++)
					s += scale[i].toString() + ", ";

				s += scale[scale.length - 1];
				System.out.println(s);
				System.out.println();
				choices(myScanner, note);
				break;
			case 7:
				s = "";
				scale = note.bluesScale();
				for(int i = 0; i < scale.length - 1; i++)
					s += scale[i].toString() + ", ";
				
				s += scale[scale.length - 1];
				System.out.println(s);
				System.out.println();
				choices(myScanner, note);
				break;
			default:	
				System.out.println("See you later!");			
		}
	}	
}
