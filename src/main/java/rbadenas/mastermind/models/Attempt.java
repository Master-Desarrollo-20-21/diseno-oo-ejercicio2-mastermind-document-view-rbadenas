package rbadenas.mastermind.models;

public class Attempt {
	private ProposedCombination proposedCombination;
	private Result result;

	public Attempt(ProposedCombination proposedCombination, SecretCombination secretCombination){
		this.proposedCombination = proposedCombination;
		this.result = secretCombination.evalueCombination(this.proposedCombination);

	}

	public boolean isWinner() {
		return result.isWinner();
	}

	@Override
	public String toString() {
		return this.proposedCombination.toString()  + " --> " + result.toString();
	}
}