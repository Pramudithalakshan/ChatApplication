/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.MessageControl;
import view.AddNewSender;

/**
 *
 * @author pramuditha-lakshan
 */
public class Main {
    public static void main(String[] args) {
        new AddNewSender(new MessageControl()).setVisible(true);
    }
 
}
