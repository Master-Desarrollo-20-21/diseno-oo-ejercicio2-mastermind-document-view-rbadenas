package rbadenas.mastermind.views.console;

import rbadenas.mastermind.models.Game;
import rbadenas.utils.Console;
import rbadenas.mastermind.views.View;
import rbadenas.mastermind.views.Message;

public class ConsoleView extends View {
	
	private ConsoleProposedCombinationInputView proposedCombinationInputView;
	private ConsoleResumeView resumeView;

	public ConsoleView(Game game) {
		super(game);
		this.proposedCombinationInputView = new ConsoleProposedCombinationInputView();
		this.resumeView = new ConsoleResumeView();
	}

	@Override
	protected void start(){
		Console.getInstance().write(Message.START_TITLE.getMessage());
	}

	@Override
	protected void play(){
		do {
			Console.getInstance().write(super.game.getAttemptsCount() + Message.ATTEMPT_CAPTION.getMessage());
			Console.getInstance().write(game.getHiddenSecret());

			var proposed = this.proposedCombinationInputView.interact();
			game.addAttempt(proposed);
			displayAllAttempts();
		} while (!game.isGameLost() && !game.isLastAttemptWinner());

		Console.getInstance().write(getGameResult());
	}
	
	@Override
	protected boolean isResumed(){
		return this.resumeView.isResumed();
	}

	private void displayAllAttempts() {
		for (int i = 0; i < game.getAttemptsCount(); i++) {
			Console.getInstance().write(game.getAttempt(i).toString());
		}
	}

	private String getGameResult() {
		if (game.isLastAttemptWinner()) {
			return Message.WINNER.getMessage();
		} else {
			return Message.LOOSER.getMessage();
		}
	}

}