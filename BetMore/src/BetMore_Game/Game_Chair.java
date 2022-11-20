package BetMore_Game;

public class Game_Chair {

	public static void main(String[] args) {
		Player computer = new Player("Computer");
		Player player_2 = new Player("Player 2");
		
		BetMore_Game bet = new BetMore_Game(computer, player_2);
		Shuffle s = new Shuffle();
		
		computer.start();
		bet.play(computer);
		computer.x = s.pick_card(computer);
		
		player_2.start();
		bet.play(player_2);
		player_2.x = s.pick_card(player_2);
		
		bet.findWinner(computer, player_2);
	}
}
