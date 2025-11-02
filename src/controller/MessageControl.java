package controller;

import java.util.ArrayList;
import view.Display;

/**
 *
 * @author pramuditha-lakshan
 */
public class MessageControl{
    private ArrayList<Display> UsersArray = new ArrayList<>();
    private String message;

    public void addsender(Display sender) {
        UsersArray.add(sender);
    }

    public void sendMessage(String message, Display senders) {
        for (Display d : UsersArray) {
            d.update(senders.getName()+" : "+message);
        }
    }
    
   
   
}
