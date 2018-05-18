/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.controller;

import cit360.sandbox.model.CollectionsModel;
import cit360.sandbox.view.View;

/**
 *
 * @author Mattn
 */
public class Runnable2 implements Runnable {

    public Runnable2(String name, CollectionsModel model) {
        this.name = name;
        this.model = model;
    }
    
    //Atomic variable access
    public CollectionsModel model;
    public String name;
    View display = new View();
    
    @Override
    public void run() {
        //Display start of thread in view
        String message = "Starting " + name + "!";
        display.display(message);
        //Output count and thread name 10 times
        for(int count = 1; count < 11; count++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                message = name + " interupted!";
                display.display(message);
            }
            model.atomic = count;
            message = name + "count = " + count + " and atomic = " + model.atomic;
            display.display(message);
        }
        //Output when thread is complete
        message = name + "complete!";
        display.display(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
