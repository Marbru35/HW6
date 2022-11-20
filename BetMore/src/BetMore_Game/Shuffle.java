package BetMore_Game;

import java.util.Random;
import java.util.Scanner;

public class Shuffle {

	int counter = 0;
	
	public Shuffle () {
		
	}
	
	public int pick_card(Player player) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		if (player.name == "Computer") {
			player.x = r.nextInt(100) + 1;
			player.user_selected = true;
			System.out.println("Computer hat seine Nummer gewählt!");
			return player.x;
		} else if (player.name == "Player 2") {
			while (player.user_selected == false && counter < 4) {
				player.x = r.nextInt(100) + 1;
				counter++;
				System.out.println("Deine Nummer: " + player.x + "\n Behalten: 'j', Neu: 'beliebiges Zeichen'");
				if (s.next().equals("j")) {
					player.user_selected = true;
				}
			}
		}
		System.out.println("Du hast deine Nummer gewählt: " + player.x);
		s.close();
		return player.x;
	}
}
