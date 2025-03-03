package trabajo2048;

import java.util.Random;

public class Control {

	public tablero tablero;

	// tablero tablero= new tablero();

	public Control(tablero tablero) {
		this.tablero = tablero;
	}

	public boolean perder() {

		int n = 0;
		for (int i = 0; i < tablero.filas; i++) {
			for (int j = 0; j < tablero.columnas; j++) {
				if (tablero.tablero[i][j] != 0) {
					n++;
				}
			}
		}
		if (n == tablero.filas * tablero.columnas) {
			return true;

		} else {
			return false;
		}

	}

	public boolean ganar() { // metodo para comprobar si se encuentra un 2048

		for (int i = 0; i < tablero.filas; i++) {
			for (int j = 0; j < tablero.columnas; j++) {
				if (tablero.tablero[i][j] == 2048) {

					return true;

				}
			}
		}
		return false;
	}

	public boolean fin() { // metodo que controla si la partida ha terminado
		if (ganar()) {

			return true;
		}
		if (perder()) {
			
			return true;
		} else {
			return false;
		}
	}

	public int FilasVacias(int f) { // metodo para comprobar cuantas filas estan vacias

		int n = 0;
		for (int i = 0; i < tablero.columnas; i++) {

			if (tablero.tablero[f][i] == 0) {

				n++;
			}

		}
		return n;
	}

	public int ColumnasVacias(int c) { // metodo para comprobar cuantas columnas estan vacias

		int n = 0;
		for (int i = 0; i < tablero.filas; i++) {

			if (tablero.tablero[i][c] == 0) {

				n++;
			}

		}
		return n;
	}

	public void Dos() { // metodo que pone 2 en el tablero

		Random random = new Random();

		int f;
		int c;

		do { // se busca una fila con celdas vacias

			f = random.nextInt(0, tablero.filas);

		} while (FilasVacias(f) == 0);

		do { // se busca una columna con celdas vacias

			c = random.nextInt(0, tablero.columnas);

		} while (tablero.tablero[f][c] != 0); // anteriormente era while (ColumnasVacias(c) == 0); pero podia generar un
												// dos en la celda donde se acabab de sumar un numero

		tablero.tablero[f][c] = 2;

	}

}
