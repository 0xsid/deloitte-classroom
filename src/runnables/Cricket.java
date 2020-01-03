package runnables;

public class Cricket {
public static void main(String[] args) {
	Bowler b1 = new Bowler(true);
	b1.bowl();
	b1 = new FastBowler(false);
	b1.bowl();
	
}
}
