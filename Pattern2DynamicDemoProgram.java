package cellular_automata;

import processing.core.PApplet;

public class Pattern2DynamicDemoProgram extends PApplet{ 
	public static void main(String[] args) {
		PApplet.main(Pattern2DynamicDemoProgram.class);
	}

	Visualization v;
	
	public void settings() {
		this.size(800, 600);
	}
	
	public void setup() {
		this.v = new Visualization();
	}
	
	public void draw() {
		v.draw2(this);				//number of generations should be set in Controller
	}
		
}
