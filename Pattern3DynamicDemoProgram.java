package cellular_automata;

import processing.core.PApplet;

public class Pattern3DynamicDemoProgram extends PApplet{ 
	public static void main(String[] args) {
		PApplet.main(Pattern3DynamicDemoProgram.class);
	}

	Visualization v;
	
	public void settings() {
		this.size(800, 600);
	}
	
	public void setup() {
		this.v = new Visualization();
	}
	
	public void draw() {
		v.draw3(this);					//number of generations should be set in Controller
	}
		
}
