import java.util.Scanner;		//IMPORTAR M�TODO SCANNER PARA TECLADO.
public class TestRect�ngulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER.
		Rect�ngulo Napole�n = new Rect�ngulo ();		//CREAR OBJETO Napole�n DE TIPO RECT�NGULO.
		
		System.out.print("Introduzca lado del rect�ngulo: ");		//SOLICITA LADO.
		Napole�n.setX(teclado.nextDouble());		//LLAMADA M�TODO setX() DE OBJETO Napole�n.
		System.out.print("Introduzca lado del rect�ngulo: ");		//SOLICITA LADO.
		Napole�n.setY(teclado.nextDouble());		//LLAMADA M�TODO setY() DE OBJETO Napole�n.

		System.out.printf("El �rea del rect�ngulo descrito por los lados %.2f y %.2f es %.3f. Y su per�metro es %.2f", Napole�n.getX(),Napole�n.getY(),Napole�n.calcularArea(),Napole�n.calcularPer�metro());		//SALIDA DE VALORES.
	}

}
