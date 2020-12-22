package rbadenas.mastermind.views;

public enum Message {
    
    START_TITLE("----- MASTERMIND -----"),
    ATTEMPT_CAPTION(" attemp(s)"),
	COMBINATION_ENTER("Propose a combination: "),
	COMBINATION_WRONG_COLOR("Wrong colors they must be: "),
    COMBINATION_WRONG_LENGTH("Wrong proposed combination length\n"),
    COMBINATION_WRONG_DUPLICATE_COLOR("Wrong proposed, can not repeat color.\n"),
    WINNER("You've won!!!"),
    LOOSER("You've lost"),
	RESUME("Resume? (y/n)");
	

	private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
	}

}

