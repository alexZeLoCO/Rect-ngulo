import java.util.Scanner;		//IMPORTAR MÉTODO SCANNER PARA TECLADO.
public class TestRectángulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER.
		Rectángulo Napoleón = new Rectángulo ();		//CREAR OBJETO Napoleón DE TIPO RECTÁNGULO.
		
		System.out.print("Introduzca lado del rectángulo: ");		//SOLICITA LADO.
		Napoleón.setX(teclado.nextDouble());		//LLAMADA MÉTODO setX() DE OBJETO Napoleón.
		System.out.print("Introduzca lado del rectángulo: ");		//SOLICITA LADO.
		Napoleón.setY(teclado.nextDouble());		//LLAMADA MÉTODO setY() DE OBJETO Napoleón.

		System.out.printf("El área del rectángulo descrito por los lados %.2f y %.2f es %.3f. Y su perímetro es %.2f", Napoleón.getX(),Napoleón.getY(),Napoleón.calcularArea(),Napoleón.calcularPerímetro());		//SALIDA DE VALORES.
	}

}
