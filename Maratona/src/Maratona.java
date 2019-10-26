import java.util.Scanner;

public class Maratona {
	static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		init();
		scanner.close();
	}
	public static void init() {
		while(true){
			int casos = scanner.nextInt();
			if(casos==0) break;
			Player[] players = new Player[casos];
			for(int i=0; i<casos; i++) {
				players[i] = new Player();
				players[i].id = scanner.nextInt();
				for(int t=0; t<10; t++) {
					String[] tempo = scanner.next().split(":");
					int h = Integer.parseInt(tempo[0]);
					int m = Integer.parseInt(tempo[1]);
					int s = Integer.parseInt(tempo[2]);
					players[i].tempos+= h*60*60+m*60+s;
				}
			}
			for(int a=0; a<players.length; a++) {
				for(int b=0; b<players.length; b++) {
					if(players[a].tempos<players[b].tempos) {
						Player aux = players[a];
						players[a] = players[b];
						players[b] = aux;
					} else if(players[a].tempos==players[b].tempos) {
						if(players[a].id<players[b].id) {
							Player aux = players[a];
							players[a] = players[b];
							players[b] = aux;
						}
					}
				}
			}
			for(int i=0; i<players.length; i++) {
				System.out.println(players[i].id);
			}
		}
	}
}

class Player {
	int id = 0;
	int tempos = 0;
}