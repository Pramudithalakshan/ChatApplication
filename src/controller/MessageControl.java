package controller;

import java.util.ArrayList;
import view.Display;

/**
 *
 * @author pramuditha-lakshan
 */
public class MessageControl{
    private ArrayList<Display> UsersArray = new ArrayList<>();


    public void addsender(Display sender) {
        UsersArray.add(sender);
    }

    public void sendMessage(String message, Display senders,String senderName) {
        for (Display d : UsersArray) {
           String name = d.senderName;
           if(senderName.equals(name)){
              d.update("Me"+" : "+message);
           }else{
              d.update(senderName+"  :  "+message);
           }
        }
    }
    
   
   
}
