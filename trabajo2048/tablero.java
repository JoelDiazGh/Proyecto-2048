package trabajo2048;

import java.util.Random;

public class tablero {

	

	public static final String VERDE = "\u001B[32m";
	public static final String RESET = "\u001B[0m";
	

	int[][] tablero; // creo la clase tablero

	public int filas = 0; // constantes que indican el tamaño del tablero para hacerlo escalable
	public int columnas = 0;

	public tablero(int argfilas, int argcolumnas) {

		this.filas = argfilas;
		this.columnas = argcolumnas;

		tablero = new int[filas][columnas]; // contructor de tablero

		for (int i = 0; i < filas; i++) { // recorro el tablero y lo lleno de 0 para indicar que estan vacios
			for (int j = 0; j < columnas; j++) {
				tablero[i][j] = 0;
			}
		}
		

	}

	public void mostrar() { // metodo para mostrar el tablero en consola

		for (int i = 0; i < filas; i++) {
			System.out.print("|");
			for (int j = 0; j < columnas; j++) {

				if (tablero[i][j] == 0) {

					System.out.print(" " + "|"); // mejora que he añadido para que las celdas vacias salgan vacias
				} else {
					System.out.print(VERDE + tablero[i][j] + RESET + "|");
				}
			}
			System.out.println();
		}

	}

}
