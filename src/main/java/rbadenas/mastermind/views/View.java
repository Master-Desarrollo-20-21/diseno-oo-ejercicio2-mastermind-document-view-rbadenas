package rbadenas.mastermind.views;

import rbadenas.mastermind.models.Game;

public abstract class View {
	
	protected Game game;

	protected View(Game game) {
		this.game = game;
	}
	
	public void interact() {
		this.start();

		do {
			this.play();
		} while (this.isResumed());
	}
	
	protected abstract void start();
	protected abstract void play();
	protected abstract boolean isResumed();

}