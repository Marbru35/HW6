package BetMore_Game;

public class BetMore_Game {

	Player computer;
	Player player_2;
	Player winner;
	
	public BetMore_Game(Player computer, Player player) {
		this.computer = computer;
		this.player_2 = player;
	}
	
	public void play(Player player) {
		System.out.println(player.name + " spielt gerade...");
	}
	
	public Player findWinner(Player computer, Player player) {
		if (computer.x < player.x) {
			System.out.println("Gewinner: " + player.name);
			winner = player;
		} else if (computer.x > player.x) {
			System.out.println("Gewinner: " + computer.name);
			winner = computer;
		} else {
			System.out.println("Unentschieden!");
		}
		return winner;
	}
}
