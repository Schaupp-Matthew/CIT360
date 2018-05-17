/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.controller;

import cit360.sandbox.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mattn
 */
public class RunnableController implements Runnable {
    
    //Create instance variable for view
    View display = new View();

    public RunnableController() {
    }
    
    //override run method
    @Override
    public void run() {
        //Create message variable for output
        String message = "\n\n================================"
                + "\nThis is a Runnable!"
                + "\n================================";
        display.display(message);
        //Create and initialize array
        List numbers = new ArrayList();
        //Populate the array with numbers 0 - 99
        for(int i = 0; i < 101; i += 10) {
            numbers.add(i);
        }
        //Display counting as output
        for(int i = 0; i < numbers.size(); i++) {
            try {
                message = "Runnable: Number " + numbers.get(i);
                Thread.sleep(1000);
                display.display(message);
            } catch (InterruptedException ex) {
                Logger.getLogger(RunnableController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
