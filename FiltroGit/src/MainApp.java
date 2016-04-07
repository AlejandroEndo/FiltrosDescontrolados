import processing.core.PApplet;

public class MainApp extends PApplet {

	private Logica logica = new Logica(this);

	@Override
	public void setup() {
		size(634, 686);
		noStroke();
		 colorMode(HSB, 360, 100, 100);
	}

	@Override
	public void draw() {
		background(0);
		logica.pintar();
	}
}
