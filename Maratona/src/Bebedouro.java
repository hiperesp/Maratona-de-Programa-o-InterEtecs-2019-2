import java.util.Scanner;

public class Bebedouro {
	static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		init();
		scanner.close();
	}
	public static void init() {
		//não foi, era pra ir
		while(true){
			int casos = 3;
			for(int k=0; k<casos; k++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c = scanner.nextInt();
				int[] an = new int[3];
				an[0] = a*0+b*2+c*4;
				an[1] = a*2+b*0+c*2;
				an[2] = a*4+b*2+c*0;
				for(int i=0; i<an.length; i++) {
					for(int j=0; j<an.length; j++) {
						if(an[i]<an[j]) {
							int aux = an[i];
							an[i] = an[j];
							an[j] = aux;
						}
					}
				}
				System.out.println(an[0]);
			}
			break;
		}
	}
}
