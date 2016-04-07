import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private FiltroUno fUno = new FiltroUno(app, app.width/2, app.height/2);
	private FiltroDos fDos = new FiltroDos(app, app.width/2, app.height/2);
	private FiltroTres fTres = new FiltroTres(app, app.width/2, app.height/2);
	private FiltroCuatro fCuatro = new FiltroCuatro(app, app.width/2, app.height/2);
	
	public Logica(PApplet app) {
		this.app=app;
	}
	
	public void pintar(){
		
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
