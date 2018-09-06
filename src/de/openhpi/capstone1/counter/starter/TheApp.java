package de.openhpi.capstone1.counter.starter;


import de.openhpi.capstone1.counter.controller.CounterController;
import de.openhpi.capstone1.counter.model.Counter;
import de.openhpi.capstone1.counter.view.CounterView;
import de.openhpi.capstone1.counter.view.Observer;
import processing.core.PApplet;

public class TheApp extends PApplet {

	private Observer counterView;
	private CounterController counterController;
	private Counter counter;

	@Override
	public void settings() {
		size(200, 200);
	}

	@Override
	public void setup() {  // setup() runs once
		frameRate(30);
		counter = new Counter();
		counterController = new CounterController(counter);
		counterView = new CounterView(this, counter);
	}

	@Override
	public void draw() {
	}  // draw() loops forever, until stopped
	
	@Override
	public void mouseClicked() {
		counterController.handleEvent();
	}
}
