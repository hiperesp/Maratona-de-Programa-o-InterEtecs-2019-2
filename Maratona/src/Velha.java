import java.util.Scanner;

public class Velha {
	static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		init();
		scanner.close();
	}
	public static void init() {
		while(true){
			int[][] matriz = new int[3][3];
			for(int y=0; y<3; y++) {
				String[] linha = scanner.nextLine().split(" ");
				if(linha.length==1) {
					return;
				}
				matriz[y][0] = Integer.parseInt(linha[0]);
				matriz[y][1] = Integer.parseInt(linha[1]);
				matriz[y][2] = Integer.parseInt(linha[2]);
			}
			boolean achou = false;
			int old = 0;
			//horizontal
			for(int y=0; y<3; y++) {
				if(matriz[y][0]!=0&&matriz[y][0]==matriz[y][1]&&matriz[y][1]==matriz[y][2]) {
					System.out.println(matriz[y][1]==-1?"O":"X");
					achou = true;
					break;
				}
			}
			if(achou) {
				continue;
			}
			//vertical
			for(int x=0; x<3; x++) {
				if(matriz[0][x]!=0&&matriz[0][x]==matriz[1][x]&&matriz[1][x]==matriz[2][x]) {
					System.out.println(matriz[1][x]==-1?"O":"X");
					achou = true;
					break;
				}
			}
			if(achou) {
				continue;
			}
			//diagonal1
			old = 0;
			for(int d1=0; d1<3; d1++) {
				if(old==0) {
					old = matriz[d1][d1];
					continue;
				}
				if(matriz[d1][d1]!=old||matriz[d1][d1]==0) {
					break;
				} else {
					if(d1==2) {
						System.out.println(old==-1?"O":"X");
						achou = true;
					}
				}
			}
			if(achou) {
				continue;
			}
			//diagonal2
			old = 0;
			for(int d2=0; d2<3; d2++) {
				if(old==0) {
					old = matriz[d2][2-d2];
					continue;
				}
				if(matriz[d2][2-d2]!=old||matriz[d2][2-d2]==0) {
					break;
				} else {
					if(d2==2) {
						System.out.println(old==-1?"O":"X");
						achou = true;
					}
				}
			}
			if(achou) {
				continue;
			}
			System.out.println("Empate");
		}
	}
}
