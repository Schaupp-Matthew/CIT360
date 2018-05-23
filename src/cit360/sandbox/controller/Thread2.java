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
public class Thread2 extends Thread {

    public Thread2(String name, CollectionsModel model) {
        threadName = name;
        this.model = model;
    }
    
    //Atomic variable
    public int number = 0;
    //Thread name
    public String threadName;
    //View instantiation
    View display = new View();
    //Atomic variable access
    public CollectionsModel model;
    
    @Override
    public synchronized void run() {
        //Display start of thread in view
        String message = "Starting " + threadName + "!";
        display.display(message);
        //Output count and thread name 10 times
        for(int count = 1; count < 11; count++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                message = threadName + " interupted!";
                display.display(message);
            }
//            model.atomic = count;
            model.setAtomic(count);
            message = threadName + " count = " + count + " and atomic = " + model.getAtomic();
            display.display(message);
            this.number = count;
        }
        //Output when thread is complete
        message = "\nThere are " + Thread.activeCount() + " thread(s)." 
                + threadName + " complete and count = " + number;
        display.display(message);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
    
    

}
