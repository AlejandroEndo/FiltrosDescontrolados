import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private FiltroUno fUno;
	private FiltroDos fDos;
	private FiltroTres fTres;
	private FiltroCuatro fCuatro;

	private int color;

	public Logica(PApplet app) {
		this.app = app;

		fUno = new FiltroUno(app, app.width / 2, app.height / 2);
		fDos = new FiltroDos(app, app.width / 2, app.height / 2);
		fTres = new FiltroTres(app, app.width / 2, app.height / 2);
		fCuatro = new FiltroCuatro(app, app.width / 2, app.height / 2);

	}

	public void pintar() {

		color += 2;
		app.fill(color, 100, 100);
		app.ellipse(app.width / 2, app.height / 2, 50, 50);

		if (color >= 350) {
			color = 0;
		}
		switch (app.key) {
		case '1':
			fUno.pintar();
			break;

		case '2':
			fDos.pintar();
			break;

		case '3':
			fTres.pintar();
			break;

		case '4':
			fCuatro.pintar();
			break;
		}
	}
}
