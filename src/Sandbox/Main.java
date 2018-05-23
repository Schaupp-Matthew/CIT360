/*
 * Main class
 */
package Sandbox;

import cit360.sandbox.controller.AddHandler;
import cit360.sandbox.controller.AppController;
import cit360.sandbox.controller.CollectionsController;
import cit360.sandbox.controller.Runnable2;
import cit360.sandbox.controller.RunnableController;
import cit360.sandbox.controller.SubtractHandler;
import cit360.sandbox.controller.Thread2;
import cit360.sandbox.controller.ThreadController;
import cit360.sandbox.model.CollectionsModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        //open charater stream file for end user input and output
            Main.inPut = new BufferedReader(new InputStreamReader(System.in));
            Main.outPut = new PrintWriter(System.out, true);
        
//        //====================================================================
//        //Uncomment this section in order to run Java Collections
//        //====================================================================
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


//        //======================================================================
//        //Uncomment to run Threads, Runnables, and Executors
//        //======================================================================
//        //Create instance of model
//        CollectionsModel model = new CollectionsModel();
//        //Create an instance variable of the Thread and Runnable classes
//        ThreadController threadController = new ThreadController();
//        RunnableController runnableController = new RunnableController();
//        Thread2 thread2 = new Thread2("Thread2", model);
//        Thread2 thread3 = new Thread2("Thread3", model);
//        Thread2 thread4 = new Thread2("Thread4", model);
//        Thread2 thread5 = new Thread2("Thread5", model);
//        Runnable2 runnable2 = new Runnable2("Runnable2", model);
//        Runnable2 runnable3 = new Runnable2("Runnable3", model);
//        Runnable2 runnable4 = new Runnable2("Runnable4", model);
//        Runnable2 runnable5 = new Runnable2("Runnable5", model);
//        
////        //Start threadController thread
////        threadController.start();
////        //Start runnableController thread
////        (new Thread(runnableController)).start();
////        //Start threads manually
////        thread2.start();
////        thread3.start();
////        thread4.start();
////        thread5.start();
////        //Start Runnables manually
////        (new Thread(runnable2)).start();
////        (new Thread(runnable3)).start();
////        (new Thread(runnable4)).start();
////        (new Thread(runnable5)).start();
//        
//        //Create Executors
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
//        //Use executors to manage threads
//        //Use ExecutorService to manage threads
//        System.out.println("\n\n\nStart ExecutorService");
//        executorService.execute(thread5);
//        executorService.execute(thread4);
//        executorService.execute(thread3);
//        executorService.execute(thread2);
//        executorService.execute(threadController);
//        
//        
//        //Shutdown executorService
//        System.out.println("Exit ExecutorService\n\n\n");
//        executorService.shutdown();
//        
//        //Use ScheduledExecutorService to manage threads
//        System.out.println("\n\n\nStart ScheduledExecutorService");
//        scheduledExecutorService.execute(runnable5);
//        scheduledExecutorService.execute(runnable4);
//        scheduledExecutorService.execute(runnable3);
//        scheduledExecutorService.execute(runnable2);
//        scheduledExecutorService.execute(runnableController);
//        
//        
//        //Shutdown ScheduledxecutorService
//        System.out.println("Exit ScheduledExecutorService\n\n\n");
//        scheduledExecutorService.shutdown();
//        
//        try {
//            while(!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
//                System.out.println("\n\n******Executors not finished******\n\n");
//            }
//        } catch (InterruptedException ex) {
//            System.out.println("\nExecutor Service Await Termination Interrupted!\n" + ex);
//        }
//        
//        System.out.println("\n******Finished******");
        
        
        //======================================================================
        //Uncomment to run Application Controller Pattern
        //======================================================================
        System.out.println("\n*********Application Controller Pattern Starting*************\n");
        //Create instance of AppController
        AppController appController = new AppController();
        //Create instance of all handlers
        AddHandler addHandler = new AddHandler();
        SubtractHandler subtractHandler = new SubtractHandler();
        //Create HashMap object for AppController and command data/parameters
        HashMap<String, Object> data = new HashMap(); 
        
        //Add handlers to the appController HashMap
        appController.mapCommand("add", addHandler);
        appController.mapCommand("subtract", subtractHandler);
        
        //Addition
        //Place parameters in data Collection object
        data.put("a", 100);
        data.put("b", 900);
        
        //Run add command through application controller pattern
        appController.handleRequest("add", data);
        
        data.clear();
        
        System.out.println("Please enter an integer:");
        try {
            String aInput = inPut.readLine();
            System.out.println("You typed: " + aInput);
            int a = Integer.parseInt(aInput);
            data.put("a", a);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\nPlease enter another integer to add to the first:");
        try {
            String bInput = inPut.readLine();
            System.out.println("You typed: " + bInput);
            int b = Integer.parseInt(bInput);
            data.put("b", b);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        appController.handleRequest("add", data);
        data.clear();
        
        //Subtraction
        //Place parameters in data Collection object
        data.put("a", 100);
        data.put("b", 900);
        
        //Run add command through application controller pattern
        appController.handleRequest("subtract", data);
        
        data.clear();
        
        System.out.println("Please enter an integer:");
        try {
            String aInput = inPut.readLine();
            System.out.println("You typed: " + aInput);
            int a = Integer.parseInt(aInput);
            data.put("a", a);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\nPlease enter another integer to subtract from the first:");
        try {
            String bInput = inPut.readLine();
            System.out.println("You typed: " + bInput);
            int b = Integer.parseInt(bInput);
            data.put("b", b);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        appController.handleRequest("subtract", data);
    }
    
}
