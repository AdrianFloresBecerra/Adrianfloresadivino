
	import java.util.Scanner;

	public class Aciertos {
		//El proyecto plantea un juego: adivinar el n�mero que genera de manera aleatoria el programa. Primero se 
		//genera el n�mero aleatorio, a continuaci�n se pide al usuario que introduzca un n�mero entero. Si el valor es menor o 
		//mayor del n�mero generado, se proporciona un texto orientativo y continua
		//esperando un nuevo n�mero. En caso de acierto se anuncia el �xito, y la aplicaci�n finaliza.
	    public static void main(String[] args) {
	        int n = 0,cont = 0;
	        int x = (int) (500 *Math.random());
	        //System.out.print(x);
	        Scanner sc = new Scanner(System.in);
	        do {
	            System.out.print("\nIntroduce el valor de X: ");
	            n = sc.nextInt();
	            if (n > x) {
	                System.out.print("Te pasaste Amigo");
	            } else if (n < x){
	                System.out.print("Casi cerca ...");
	            }
	            cont++;
	        } while (n != x);
	        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
	        sc.close();
	    }
	}

