import java.util.Scanner;

public class Luzes {
	static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		init();
		scanner.close();
	}
	public static void init() {
		//noia salvou
		while(true){
			int salas = scanner.nextInt();
			if(salas==0) {
				break;
			}
			int ns = scanner.nextInt();
			int[] numeros = new int[ns];
			for(int i=0; i<numeros.length; i++) {
				numeros[i] = scanner.nextInt();
			}
			for(int i=1; i<salas+1; i++) {
				boolean l = false;
				for(int j=0; j<numeros.length; j++) {
					if(i%numeros[j]==0) {
						l = !l;
					}
				}
				if(l) System.out.print("L");
				else System.out.print("D");
			}
			System.out.println();
		}
	}
}
