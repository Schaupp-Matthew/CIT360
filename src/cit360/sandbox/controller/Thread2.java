/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.controller;

import cit360.sandbox.view.View;

/**
 *
 * @author Mattn
 */
public class Thread2 extends Thread {

    public Thread2(String name) {
        threadName = name;
    }
    
    //Atomic variable
    public int number = 0;
    //Thread name
    public String threadName;
    //View instantiation
    View display = new View();
    
    @Override
    public void run() {
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
            message = threadName + "count = " + count;
            display.display(message);
            this.number = count;
        }
        //Output when thread is complete
        message = threadName + " complete and count = " + number;
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