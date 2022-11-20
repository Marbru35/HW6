package BetMore_Game;

public class Player {

	String name;
	int x;
	boolean user_selected = false;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void start() {
		System.out.println(this.name + " hat das Spiel gestartet...");
	}
}
