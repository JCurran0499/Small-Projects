/*
 * John Curran
 * 
 * This project calculates the various musical scales of each note. Using my
 * knowledge of music, I implemented functions that take in numbers, convert
 * them to their respective notes, and converts them to the scale of the 
 * user's choice
 */

package Scales;

public class Note {
	final String note;
	final int level;
	
	public Note(int noteValue) {
		while(noteValue > 12)
			noteValue -= 12;
		
		while(noteValue < 1)
			noteValue += 12;

		level = noteValue;
		
		switch(noteValue) {
			case 1:
				note = "Ab";
				break;
			case 2:
				note = "A";
				break;
			case 3:
				note = "Bb";
				break;
			case 4:
				note = "B";
				break;
			case 5:
				note = "C";
				break;
			case 6:
				note = "Db";
				break;
			case 7:
				note = "D";
				break;
			case 8:
				note = "Eb";
				break;
			case 9:
				note = "E";
				break;
			case 10:
				note = "F";
				break;
			case 11:
				note = "Gb";
				break;
			case 12:
				note = "G";
				break;
			default:
				throw new RuntimeException("Invalid Note Type");				
		}
	}
	
	public String toString() {
		return note;
	}
	
	public Note upSteps(double steps) { //if its's not 0.5 or 1.0, it will be rounded down
		int newLevel = level + (int)(steps * 2);
		
		return new Note(newLevel);
	}
	
	public Note downSteps(double steps) { //if its's not 0.5 or 1.0, it will be rounded down
		int newLevel = level - (int)(steps * 2);
		
		return new Note(newLevel);
	}
	
	
	
	public Note[] majorScale() {
		Note[] scale = new Note[8];
		int[] noteOrder = {0, 2, 4, 5, 7, 9, 11, 12};
		
		for(int i = 0; i < scale.length; i++)
			scale[i] = new Note(level + noteOrder[i]);
		
		return scale;
	}
	
	public Note[] minorScale() {
		Note[] scale = majorScale();
		
		scale[2] = scale[2].downSteps(0.5);
		scale[5] = scale[5].downSteps(0.5);
		scale[6] = scale[6].downSteps(0.5);
		
		return scale;
	}
	
	public Note[] dorianScale() {
		Note[] scale = majorScale();
		
		scale[2] = scale[2].downSteps(0.5);
		scale[6] = scale[6].downSteps(0.5);
		
		return scale;
	}
	
	public Note[] mixolydianScale() {
		Note[] scale = majorScale();
		
		scale[6] = scale[6].downSteps(0.5);
		
		return scale;
	}
	
	public Note[] lydianScale() {
		Note[] scale = majorScale();
		
		scale[3] = scale[3].upSteps(0.5);
		
		return scale;
	}
	
	
	public Note[] bluesScale() {
		Note[] scale = new Note[6];
		int[] noteOrder = {0, 3, 5, 6, 7, 10};
		
		for(int i = 0; i < scale.length; i++)
			scale[i] = new Note(level + noteOrder[i]);
		
		return scale;
	}
	
	public Note[] chromaticScale() {
		Note[] scale = new Note[13];
		int[] noteOrder = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		for(int i = 0; i < scale.length; i++)
			scale[i] = new Note(level + noteOrder[i]);
		
		return scale;
	}
}
