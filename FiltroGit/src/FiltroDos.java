import processing.core.PApplet;
import processing.core.PImage;

public class FiltroDos {

	private PApplet app;
	private int x,y;
	private PImage kid;
	
	public FiltroDos(PApplet app, int x, int y) {
		this.app=app;
		this.x=x;
		this.y=y;
		
		kid = app.loadImage("../data/kid.jpg");
	}
	
	public void pintar(){
		
		
	}
	
}
