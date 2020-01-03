package runnables;

public class FastBowler extends Bowler {

	public FastBowler() {
	super();	
	}
	public FastBowler(boolean isBatsman) {
		super(isBatsman);
	}
	public void bowl() {
		System.out.println("Fast Bowler is bowling, Bats too: " + isBatsman);
	}
}
