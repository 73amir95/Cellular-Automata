package cellular_automata;

import processing.core.PApplet;

public class Visualization {
	
	private Controller cell = new Controller();
	
	public void draw1(PApplet app) {
		Controller a = this.cell;
		a.pattern1();
		for(int i = 0; i < a.getX(); i++) {
			for(int j = 0; j < a.getY(); j++) {
				if(a.get(i, j) == 1) {
					app.fill(255, 0, 255);
					app.square(j*14, i*14, 14);
				} else {
					app.fill(0, 100, 100);
					app.square(j*14, i*14, 14);
				}
				
			}
		}
	}
	
	public void draw2(PApplet app) {
		Controller a = this.cell;
		a.pattern2();
		for(int i = 0; i < a.getX(); i++) {
			for(int j = 0; j < a.getY(); j++) {
				if(a.get(i, j) == 1) {
					app.fill(255, 0, 255);
					app.square(j*14, i*14, 14);
				} else {
					app.fill(0, 100, 100);
					app.square(j*14, i*14, 14);
				}
				
			}
		}
	}
	
	public void draw3(PApplet app) {
		Controller a = this.cell;
		a.pattern3();
		for(int i = 0; i < a.getX(); i++) {
			for(int j = 0; j < a.getY(); j++) {
				if(a.get(i, j) == 1) {
					app.fill(255, 0, 255);
					app.square(j*14, i*14, 14);
				} else {
					app.fill(0, 100, 100);
					app.square(j*14, i*14, 14);
				}
				
			}
		}
	}
}
