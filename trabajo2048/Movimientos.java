package trabajo2048;

public class Movimientos {
	
	
	public Control Control;
	public tablero tablero;
	

	
	
	public Movimientos(tablero tablero, Control Control) {			//constructor de movimientos		
		this.tablero=tablero;
		this.Control=Control;
	}
	
	
	
	public  void MoverArribaIndv(int c) { // metodo para mover hacia arriba los valores de una sola columna

		if (Control.ColumnasVacias(c) < tablero.columnas) { // se comprueba si hay fichas en la columna

			for (int i = 0; i < (tablero.columnas - 1); i++) { // se repite el numero de veces como celdas hay en la columna - 1
				for (int j = 0; j < (tablero.filas - 1); j++) {
					if (tablero.tablero[j][c] == 0) { // comprueba que la celda esta vacia y copia la celda de abajo
						tablero.tablero[j][c] = tablero.tablero[j + 1][c];
						tablero.tablero[j + 1][c] = 0; // borra la celda de abajo

					}
				}
			}
		}
	}
	
	public  void SumarArriba(int c) { // metodo que suma las celdas de las columnas hacia arriba

		if (Control.ColumnasVacias(c) < tablero.filas - 1) {

			for (int i = 0; i < tablero.filas - 1; i++) {

				if (tablero.tablero[i][c] == tablero.tablero[i + 1][c]) {
					tablero.tablero[i][c] *= 2;
					tablero.tablero[i + 1][c] = 0;

				}
			}
		}

	}
	
	public  void MoverArribaTotal() { // metodo que usa el metodo MoverArribaIndv y lo usa en todas las columnas

		for (int i = 0; i < this.tablero.columnas; i++) {
			MoverArribaIndv(i);
			SumarArriba(i);
			MoverArribaIndv(i); // repito el metodo porque en la suma de una columna pueden quedar huecos al
								// sumar 4 celdas
		}
		if (!Control.fin()) {
			Control.Dos();
			} // una vez hecho el movimiento se pone un dos aleatorio
	}
	
	public  void MoverAbajoIndv(int c) {

		if (Control.ColumnasVacias(c) < tablero.columnas) {
			for (int i = 0; i < (tablero.columnas - 1); i++) {
				for (int j = tablero.filas - 1; j > 0; j--) { // el movimiento hacia abajo es como el de arriba pero cambio de
														// lugar el orden del bucle for
					if (tablero.tablero[j][c] == 0) { // comprueba que la celda esta vacia y copia la celda de abajo
						tablero.tablero[j][c] = tablero.tablero[j - 1][c];
						tablero.tablero[j - 1][c] = 0; // borra la celda

					}
				}
			}
		}
	}
	
	public  void SumarAbajo(int c) {

		if (Control.ColumnasVacias(c) < tablero.filas - 1) {

			for (int i = tablero.filas - 1; i > 0; i--) {

				if (tablero.tablero[i][c] == tablero.tablero[i - 1][c]) {
					tablero.tablero[i][c] *= 2;
					tablero.	tablero[i - 1][c] = 0;

				}
			}
		}

	}
	
	public  void MoverAbajoTotal() {

		for (int i = 0; i < tablero.columnas; i++) {

			MoverAbajoIndv(i);
			SumarAbajo(i);
			MoverAbajoIndv(i);
		}
		if (!Control.fin()) {
			Control.Dos();
		}
	}

	public  void MoverIzquierdaIndv(int c) {
		
		if (Control.FilasVacias(c) < tablero.filas ) {
			
			for (int i=0; i< (tablero.columnas-1); i++) {
				for(int j=0; j<(tablero.filas-1); j++) {
					if(tablero.tablero[c][j]==0) {					
						tablero.tablero[c][j]= tablero.tablero[c][j +1];
						tablero.tablero[c][j +1]= 0;						
					}					
				}								
			}									
		}						
	}
	
	public  void SumarIzquierda(int c) { 

		if (Control.FilasVacias(c) < tablero.filas - 1) {

			for (int i = 0; i < tablero.filas - 1; i++) {

				if (tablero.tablero[c][i] == tablero.tablero[c][i+1]) {
					tablero.tablero[c][i] *= 2;
					tablero.tablero[c][i+1] = 0;

				}
			}
		}
	}
	
	public  void MoverIzquierdaTotal() {
		
		for(int i=0; i < tablero.filas; i++) {
			
			MoverIzquierdaIndv(i);
			SumarIzquierda(i);
			MoverIzquierdaIndv(i);			
		}
		if (!Control.fin()) {
			Control.Dos();
		}
	}
	
	public  void MoverDerechaIndv(int c) {

		
		if (Control.FilasVacias(c) < tablero.filas ) {
			
			for (int i=tablero.filas-1; i > 0; i--) {
				for(int j=tablero.filas-1; j>0; j--) {
					if(tablero.tablero[c][j]==0) {					
						tablero.tablero[c][j]= tablero.tablero[c][j -1];
						tablero.tablero[c][j -1]= 0;						
					}					
				}								
			}									
		}						
	}
	
	public  void SumarDerecha(int c) {
		
		if (Control.FilasVacias(c) < tablero.filas - 1) {

			for (int i = tablero.filas-1; i >0 ; i--) {

				if ( tablero.tablero[c][i] ==  tablero.tablero[c][i-1]) {
					 tablero.tablero[c][i] *= 2;
					 tablero.tablero[c][i-1] = 0;

				}
			}
		}
		
	}
	
	public  void MoverDerechaTotal () {
		
		for(int i=0; i < this.tablero.filas; i++) {
			
			MoverDerechaIndv(i);
			SumarDerecha(i);
			MoverDerechaIndv(i);
		}
		if (!Control.fin()) {
			Control.Dos();
		}
	}
	
}

