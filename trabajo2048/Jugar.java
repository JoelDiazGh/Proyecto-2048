package trabajo2048;
import java.io.IOException;
import java.util.Scanner;


public class Jugar {
	

	public Control Control;
	public Scanner scanner;
	public Movimientos Movimientos;
	public tablero tablero;
	
	public Jugar(Movimientos movimientos, tablero tablero, Control Control){
		
		
		this.Control = Control;
		this.tablero = tablero;
		this.Movimientos = movimientos;
		scanner = new Scanner(System.in);
		
	}
	
	public void jugar() {
		
		
		
		String opcion = "";
		Control.Dos();
		Control.Dos();
		tablero.mostrar();
		do {
			
		
		opcion=scanner.next();
		
		String opcionV= opcion.toLowerCase();
		
			
		 switch(opcionV) {
		 
		 case "w":	Movimientos.MoverArribaTotal();
		 			tablero.mostrar();
		 						
		 			break;
		 case "a":	Movimientos.MoverIzquierdaTotal();
		 			tablero.mostrar();
		 			
		 			break;
		 case "s": Movimientos.MoverAbajoTotal();
		 			tablero.mostrar();
		 			
		 			break;			
		 case "d":	Movimientos.MoverDerechaTotal();
		 			tablero.mostrar();
		 			
					break;
		
			default: 
					System.out.println("Porfavor presiona W A S D ");
		 	}
		 			
			
		}while(!Control.fin());
			System.out.println("La partida ha terminado");
		if(Control.ganar()) {
			
			System.out.println("Has ganado");
		}
		if(Control.perder()) {
			
			System.out.println("Has perdido");
		}				
	}
	
	
	
	
}
