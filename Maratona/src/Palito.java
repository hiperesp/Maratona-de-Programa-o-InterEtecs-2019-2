import java.util.Scanner;

public class Palito {
	static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		init();
		scanner.close();
	}
	public static void init() {
		while(true){
			int jogadas = scanner.nextInt();
			if(jogadas==0) {
				break;
			}
			int jilo = 0;
			int ferrugem = 0;
			for(int i=0; i<jogadas; i++) {
				String palitos1 = scanner.next();
				String palitos2 = scanner.next();
				String palJilo = scanner.next();
				String palFerrugem = scanner.next();
				int palJiloInt = 0;
				int palFerrugemInt = 0;
				
				int palitos = 0;
				for(int j=0; j<palitos1.length(); j++) {
					if(palitos1.charAt(j)=="I".charAt(0)) palitos+= 1;
				}
				for(int j=0; j<palitos2.length(); j++) {
					if(palitos2.charAt(j)=="I".charAt(0)) palitos+= 1;
				}
				if(palJilo.equals("lona")) palJiloInt = 0;
				else palJiloInt = Integer.parseInt(palJilo);
				if(palFerrugem.equals("lona")) palFerrugemInt = 0;
				else palFerrugemInt = Integer.parseInt(palFerrugem);
				if(palJiloInt==palitos) jilo++;
				if(palFerrugemInt==palitos) ferrugem++;
			}
			if(jilo>ferrugem) {
				System.out.println("Jilo");
			} else if(ferrugem>jilo) {
				System.out.println("Ferrugem");
			} else {
				System.out.println("Empate");
			}
		}
	}
}
