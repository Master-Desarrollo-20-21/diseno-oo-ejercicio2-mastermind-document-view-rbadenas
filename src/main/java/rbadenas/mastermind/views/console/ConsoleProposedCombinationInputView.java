package rbadenas.mastermind.views.console;

import java.util.HashSet;
import java.util.Set;

import rbadenas.mastermind.models.Combination;
import rbadenas.mastermind.models.Color;
import rbadenas.mastermind.views.Message;
import rbadenas.utils.Console;

public class ConsoleProposedCombinationInputView {

    public ConsoleProposedCombinationInputView() {

    }
    
    public String interact()
    {
        String proposedString;
		do {
			proposedString = Console.getInstance().read(Message.COMBINATION_ENTER.getMessage());
        }while(!this.isValid(proposedString));
        
        return proposedString;
    }

    private boolean isValid(String proposedString){

        if(proposedString.length() != Combination.LENGTH) {
            Console.getInstance().write(Message.COMBINATION_WRONG_LENGTH.getMessage());
            return false;
        }

        if (!this.isValidColor(proposedString)) {
            Console.getInstance().write(Message.COMBINATION_WRONG_COLOR.getMessage() + Color.getAvailableColors() + "\n");
            return false;
        }

        if (this.isRepeatedColor(proposedString)) {
            Console.getInstance().write(Message.COMBINATION_WRONG_DUPLICATE_COLOR.getMessage());
            return false;
        }
        return true;
    }

    private boolean isValidColor(String proposedString) {

        String[] proposedArray = proposedString.split("");
        for (String item : proposedArray) {
            if(!Color.getAvailableColors().contains(item)){
                return false;
            }
        }
		return true;
    }

    private boolean isRepeatedColor(String proposedString) {

        Set<Character> chars = new HashSet<Character>();
        for (char c : proposedString.toCharArray()) {
            if (!chars.add(c)) return true;
        }
        return false;
    }

}
