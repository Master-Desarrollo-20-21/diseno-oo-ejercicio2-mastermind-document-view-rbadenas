package rbadenas.mastermind.models;

public class Result {
	
	private int blacks;
	private int whites;
	private boolean isWinner;
	
	Result(int whites, int blacks, boolean isWinner) {
		this.blacks = blacks;
		this.whites = whites;
		this.isWinner = isWinner;
	}

	public boolean isWinner() {
		return this.isWinner;
	}

	@Override
	public String toString(){
		return this.blacks + " blacks and "  + this.whites + " whites";
	}

}
