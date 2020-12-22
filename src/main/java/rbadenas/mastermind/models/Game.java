package rbadenas.mastermind.models;

import java.util.ArrayList;


public class Game {

    private ArrayList<Attempt> attempts = new ArrayList<Attempt>();
	private SecretCombination secretCombination;
    private final int NUM_ATTEMPS = 10;
    
    public Game() {
        secretCombination = new SecretCombination();
	}

    public void addAttempt(String proposedString){
        var attempt =  new Attempt(new ProposedCombination(proposedString), this.secretCombination);
        attempts.add(attempt);
    }

	public boolean isGameLost() {
		return attempts.size() >= NUM_ATTEMPS;
	}

    public int getAttemptsCount(){
        return attempts.size();
    }

    public Attempt getAttempt(int index){
        return attempts.get(index);
    }

    public boolean isLastAttemptWinner(){
        return getAttempt(this.getAttemptsCount() - 1).isWinner();
    }

    public String getHiddenSecret(){
        return secretCombination.toString();
    }
}