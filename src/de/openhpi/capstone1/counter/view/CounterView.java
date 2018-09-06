package de.openhpi.capstone1.counter.view;

import de.openhpi.capstone1.counter.model.Counter;
import processing.core.PApplet;

public class CounterView extends Observer {


	public CounterView(PApplet display, Counter subject) {
		super(display, subject);
		update(0);
	}

	public void update(Object value) {
		try {
			int x = (int) value;
			
			display.background(204);
			display.fill(0);
			display.rect(x, 10, 10, 10);
			display.redraw();
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}

}
