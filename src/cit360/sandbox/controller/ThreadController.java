/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.controller;

import cit360.sandbox.model.CollectionsModel;
import cit360.sandbox.view.View;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mattn
 */

//Extend Thread when you want to override one or more of Thread's methods
//other than run().  Otherwise just use the Runnable interface.
public class ThreadController extends Thread {
    
    //Instantiate View and Model for use in class
    View display = new View();
    CollectionsModel data = new CollectionsModel();

    public ThreadController() {
    }
    
    @Override
    public synchronized void run() {
        String message = "\n\n================================"
                + "\nThis is a thread1!"
                + "\nThere are " + Thread.activeCount() + " thread(s) running."
                + "\nThread1 name: " + this.getName()
                + "\n================================";
        display.display(message);
        int priority = this.getPriority();
        long id = this.getId();
        State state = this.getState();
        message = "\nThread1 Priority = " + priority;
        message = message + "\nThread1 Id = " + id;
        message = message + "\nThread1 State = " + state;
        message = message + "\n*************Increasing Thread1 priority to 10**************";
        //Increase priority level for threadController to the max of 10
        this.setPriority(Thread.NORM_PRIORITY+5);
        priority = this.getPriority();
        message = message + "\nNow Thread1 Priority = " + priority;
        message = message + "\n*************Thread1 sleeping for 5 seconds*****************";
        display.display(message);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadController.class.getName()).log(Level.SEVERE, null, ex);
        }
//        try {
//            this.wait(5000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(ThreadController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        this.runCollections();
        message = "                                 .''.\n" +
"       .''.             *''*    :_\\/_:     . \n" +
"      :_\\/_:   .    .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
"  .''.: /\\ : _\\(/_  ':'* /\\ *  : '..'.  -=:o:=-\n" +
" :_\\/_:'.:::. /)\\*''*  .|.* '.\\'/.'_\\(/_'.':'.'\n" +
" : /\\ : :::::  '*_\\/_* | |  -= o =- /)\\    '  *\n" +
"  '..'  ':::'   * /\\ * |'|  .'/.\\'.  '._____\n" +
"      *        __*..* |  |     :      |.   |' .---\"|\n" +
"       _*   .-'   '-. |  |     .--'|  ||   | _|    |\n" +
"    .-'|  _.|  |    ||   '-__  |   |  |    ||      |\n" +
"    |' | |.    |    ||       | |   |  |    ||      |\n" +
" ___|  '-'     '    \"\"       '-'   '-.'    '`      |____\n" +
"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        display.display(message);
    }
    
    //Create first thread method
    public void runCollections() {
        CollectionsController collectionsController = new CollectionsController();
        //call method to display the collections model data
        collectionsController.modelToString();
        //call method to display the List collection
        collectionsController.collectionsList();
        //call method to display the Set collection
        collectionsController.collectionsSet();
        //call method to display the Mat collection
        collectionsController.collectionsMap();
        //call method to display the Queue collection
        collectionsController.collectionsQueue();
        //call method to display the Tree collection
        collectionsController.collectionsTree();
        //call method to display the TreeMap collection
        collectionsController.collectionsTreeMap();
    }
}
