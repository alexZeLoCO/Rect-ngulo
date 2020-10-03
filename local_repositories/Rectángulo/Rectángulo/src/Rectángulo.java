
public class Rectángulo {

//-------------------------INICIALIZACIÓN DE VARIABLES PRIVADAS----------------------------
	private static double X;
	private static double Y;
	private static double Area;
	private static double Perímetro;

	
//-------------------------MÉTODOS GET-----------------------------
	public double getX () {
		return X;
	}
	public double getY () {
		return Y;
	}
	
//-------------------------MÉTODOS SET----------------------------
	public void setX (double x) {		//VARIABLE x ES PROVISIONAL. COMPROBAR SI ES VÁLIDA.
		if (x<0) {		//CONDICIÓN: SI x < 0.
			System.out.print("La longitud del lado indicado es negativa, longitud invalidada.");
			System.exit(0);		//CERRAR PROGRAMA
		} else {		//x > 0
			System.out.println("La longitud introducida ha sido validada.");
			X = x;		//ALMACENAR VALOR x EN VARIABLE PRIVADA X.
		}
	}
	public void setY (double y) {		//VARIABLE y ES PROVISIONAL. COMPROBAR SI ES VÁLIDA.
		if (y<0) {		//CONDICIÓN: SI y < 0.
			System.out.print("La longitud del lado indicado es negativa, longitud invalidada.");
			System.exit(0);		//CERRAR PROGRAMA.
		} else {		// y > 0
			System.out.println("La longitud introducida ha sido validada.");
			Y = y;		//ALMACENAR VALOR y EN VARIABLE PRIVADA Y.
		}
	}
	public double calcularArea () {		//CALCULAR ÁREA.
		Area = X*Y;
		return Area;
	}
	public double calcularPerímetro () {		//CALCULAR PERÍMETRO.
		Perímetro = 2*X+2*Y;
		return Perímetro;
	}
}
