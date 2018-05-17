/*
 * Main class
 */
package Sandbox;

import cit360.sandbox.controller.CollectionsController;
import cit360.sandbox.controller.RunnableController;
import cit360.sandbox.controller.ThreadController;
//import cit360.sandbox.model.CollectionsModel;
//import cit360.sandbox.view.CollectionsView;

/**
 *
 * @author Mattn
 */
public class Main {

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


        //Create an instance variable of the ThreadContoller and RunnableController classes
        ThreadController threadController = new ThreadController();
        RunnableController runnableController = new RunnableController();
        //Start threadController thread
        threadController.start();
        //Start runnableController thread
        (new Thread(runnableController)).start();
        
    }
    
}
