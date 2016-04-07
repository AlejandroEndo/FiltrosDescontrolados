import processing.core.PApplet;
import processing.core.PImage;

public class FiltroUno {

	private PApplet app;
	private int x, y;
	private PImage torres, bush, respaldo;

	public FiltroUno(PApplet app, int x, int y) {
		this.app = app;
		this.x = x;
		this.y = y;

		torres = app.loadImage("../data/NueveOnce.jpg");
		bush = app.loadImage("../data/bush.jpg");
		respaldo = app.loadImage("../data/NueveOnce.jpg");
		
		torres.loadPixels();
		bush.loadPixels();
		respaldo.loadPixels();
	}

	public void pintar(int a, int b) {
		for (int j = 0; j < bush.height; j++) {
			for (int i = 0; i < bush.width; i++) {
				int l = i + j * torres.width;
				
				if(PApplet.dist(a, b, i, j)< 200){
					torres.pixels[l] = bush.pixels[l];
				} else {
					torres.pixels[l] = respaldo.pixels[l];
				}
			}
		}
		torres.updatePixels();
		app.image(torres, app.width / 2, app.height / 2);
	}
}
