import processing.core.PApplet;
import processing.core.PImage;

public class FiltroTres {

	private PApplet app;
	private int x, y;
	private PImage san, copia;

	public FiltroTres(PApplet app, int x, int y) {
		this.app = app;
		this.x = x;
		this.y = y;
		san = app.loadImage("../data/san.jpg");
		copia = app.loadImage("../data/san.jpg");
	}

	public void pintar(int a, int c) {
		app.colorMode(app.HSB, 360, 100, 100);
		san.loadPixels();
		copia.loadPixels();

		for (int i = 0; i < san.width; i++) {
			for (int j = 0; j < san.height; j++) {

				int pos = i + j * san.width;

				float h = app.hue(san.pixels[pos]);
				float s = app.saturation(san.pixels[pos]);
				float b = app.brightness(san.pixels[pos]);
				int suma = (int) app.random(10,100);

				if (PApplet.dist(a, c, i, j) < 50) {
					

					san.pixels[pos] = app.color(s, b, s);

				} else {
					san.pixels[pos] = san.pixels[pos];
				}

			}

		}

		san.updatePixels();
		copia.updatePixels();
		app.image(san, app.width / 2, app.height / 2);

		app.colorMode(app.RGB, 255, 255, 255);
	}
}
