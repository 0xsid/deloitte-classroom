package runnables;

public class Bowler extends Player {

public Bowler() {
	super();
}
	
	public Bowler(boolean isBatsman) {
		super(isBatsman);
	}
	
	public void bowl() {
		
		System.out.println("Bowler is bowling, Bats too: " + isBatsman);
		
	}
}
