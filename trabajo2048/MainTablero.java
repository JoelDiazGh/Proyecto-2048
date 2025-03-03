package trabajo2048;

public class MainTablero {

	public static tablero tablero;
	public static Movimientos Movimientos;
	public static Control Control;
	public static Jugar Jugar;

	public static void main(String[] args) {

		tablero = new tablero(4, 4);
		Control = new Control(tablero);
		Movimientos = new Movimientos(tablero, Control);
		Jugar = new Jugar(Movimientos, tablero, Control);

		

		System.out.println("Presiona W A S D para jugar");

	
		Jugar.jugar();

	}
}
