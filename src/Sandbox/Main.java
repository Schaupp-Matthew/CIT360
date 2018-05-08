/*
 * Main class
 */
package Sandbox;

import cit360.sandbox.controller.CollectionsController;
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
        
        //Create an instance variable of the CollectionsController class which will
        //hold all of the logic for this part of the program
        CollectionsController collectionsController = new CollectionsController();
        //call method to display the collections model data
        collectionsController.modelToString();
        //call method to display the list collection
        collectionsController.collections();
    }
    
}
