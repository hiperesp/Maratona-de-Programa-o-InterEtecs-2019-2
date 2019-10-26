import java.util.Scanner;

public class Cesar {
	static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		init();
		scanner.close();
	}
	public static void init() {
		while(true){
			String leitura = scanner.next();
			if(leitura.equals("0")) {
				break;
			}
			for(int i=0; i<leitura.length(); i++) {
				char newChar = (char) (leitura.charAt(i)-3);
				if(newChar<65) newChar+=26;
				System.out.print(newChar);
			}
			System.out.println();
		}
	}
}
