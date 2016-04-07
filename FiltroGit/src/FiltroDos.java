import processing.core.PApplet;
import processing.core.PImage;

public class FiltroDos {

	private PApplet app;
	private int x,y;
	private float r, g, b;
	private PImage kid;
	
	public FiltroDos(PApplet app, int x, int y) {
		this.app=app;
		this.x=x;
		this.y=y;
		
		kid = app.loadImage("../data/kid.jpg");
	}
	
	public void pintar(int z, int k){
		
		for (int j = 0; j < kid.height; j++) {
			for (int i = 0; i < kid.width; i++) {
				int l = i + j * kid.width;
				
				r = app.red(kid.pixels[l]);
				g = app.green(kid.pixels[l]);
				b = app.blue(kid.pixels[l]);
				
				
				kid.pixels[l] = app.color(r, g, b);
			}
		}
		
		kid.updatePixels();
		app.image(kid, app.width/2, app.height/2);
	}
	
}
