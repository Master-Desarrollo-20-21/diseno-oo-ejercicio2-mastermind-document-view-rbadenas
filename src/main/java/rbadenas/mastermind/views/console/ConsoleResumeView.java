package rbadenas.mastermind.views.console;

import rbadenas.utils.Console;
import rbadenas.mastermind.views.Message;

public class ConsoleResumeView {

    public ConsoleResumeView(){
        
    }
	public boolean isResumed() {
        return Console.getInstance().read(Message.RESUME.getMessage()).equals("y");
	}

}
