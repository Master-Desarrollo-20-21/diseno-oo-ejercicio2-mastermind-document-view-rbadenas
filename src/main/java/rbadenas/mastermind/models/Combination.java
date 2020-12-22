package rbadenas.mastermind.models;

public abstract class Combination {
	public static final int LENGTH = 4;
	protected Color[] colors;

	protected Combination(String combinationString){
		assert(combinationString.length() == LENGTH);

		this.colors = new Color[LENGTH];
		for (int i=0; i<LENGTH; i++) {
			this.colors[i] = Color.getColorByChar(combinationString.charAt(i));
        }
	}

	@Override
	public String toString() {
		String textColors = "";
		for (Color color : this.colors) {
			textColors = textColors.concat(color.toString());
		}
		return textColors;
	}
}