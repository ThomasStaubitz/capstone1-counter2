package de.openhpi.capstone1.counter.starter;

import processing.core.PApplet;

public class Main {

	public static void main(String[] args) {
		PApplet.main(new String[]{TheApp.class.getName()});
		
		//To start the program in Fullscreen Mode, use this instead.
//		PApplet.main(new String[]{"--present",TheApp.class.getName()});
	}

}
