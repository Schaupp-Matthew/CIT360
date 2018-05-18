/*
 * Main class
 */
package Sandbox;

import cit360.sandbox.controller.CollectionsController;
import cit360.sandbox.controller.Runnable2;
import cit360.sandbox.controller.RunnableController;
import cit360.sandbox.controller.Thread2;
import cit360.sandbox.controller.ThreadController;
import cit360.sandbox.model.CollectionsModel;
import java.io.BufferedReader;
import java.io.PrintWriter;
//import cit360.sandbox.model.CollectionsModel;
//import cit360.sandbox.view.CollectionsView;

/**
 *
 * @author Mattn
 */
public class Main {
    //Create variables for input and output
    public static PrintWriter outPut = null;
    public static BufferedReader inPut = null;
    

    public static PrintWriter getOutPut() {
        return outPut;
    }

    public static void setOutPut(PrintWriter outPut) {
        Main.outPut = outPut;
    }

    public static BufferedReader getInPut() {
        return inPut;
    }

    public static void setInPut(BufferedReader inPut) {
        Main.inPut = inPut;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        //Uncomment this section in order to run Java Collections
//        //Create an instance variable of the CollectionsController class which will
//        //hold all of the logic for this part of the program
//        CollectionsController collectionsController = new CollectionsController();
//        //call method to display the collections model data
//        collectionsController.modelToString();
//        //call method to display the List collection
//        collectionsController.collectionsList();
//        //call method to display the Set collection
//        collectionsController.collectionsSet();
//        //call method to display the Mat collection
//        collectionsController.collectionsMap();
//        //call method to display the Queue collection
//        collectionsController.collectionsQueue();
//        //call method to display the Tree collection
//        collectionsController.collectionsTree();
//        //call method to display the TreeMap collection
//        collectionsController.collectionsTreeMap();


        

        //Create instance of model
        CollectionsModel model = new CollectionsModel();
        //Create an instance variable of the Thread and Runnable classes
        ThreadController threadController = new ThreadController();
        RunnableController runnableController = new RunnableController();
        Thread2 thread2 = new Thread2("Thread2", model);
        Thread2 thread3 = new Thread2("Thread3", model);
        Thread2 thread4 = new Thread2("Thread4", model);
        Thread2 thread5 = new Thread2("Thread5", model);
        Runnable2 runnable2 = new Runnable2("Runnable2", model);
        Runnable2 runnable3 = new Runnable2("Runnable3", model);
        Runnable2 runnable4 = new Runnable2("Runnable4", model);
        Runnable2 runnable5 = new Runnable2("Runnable5", model);
        
        
        //Start threadController thread
        threadController.start();
        //Start runnableController thread
        (new Thread(runnableController)).start();
        //Start threads
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        //Start Runnables
        (new Thread(runnable2)).start();
        (new Thread(runnable3)).start();
        (new Thread(runnable4)).start();
        (new Thread(runnable5)).start();
    }
    
}
