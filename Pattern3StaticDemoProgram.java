package cellular_automata;

import processing.core.PApplet;

public class Pattern3StaticDemoProgram extends PApplet{
	public static void main(String[] args) {
		PApplet.main(Pattern3StaticDemoProgram.class);
	}
	
	Controller a;
	
	public void settings() {
		this.size(800, 600);
	}
	
	public void draw() {
		this.a = new Controller();
		a.pattern3();						//number of generations should be set in Controller
		for(int i = 0; i < a.getX(); i++) {
			for(int j = 0; j < a.getY(); j++) {
				if(a.get(i, j) == 1) {
					this.fill(255, 0, 255);
					stroke(0);
					this.square(j*14, i*14, 14);
				}else {
					this.fill(0, 100, 100);
					stroke(0);
					this.square(j*14, i*14, 14);
				}
				
			}
		}
	}
	
}
