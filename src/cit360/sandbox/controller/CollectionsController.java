/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.controller;

import cit360.sandbox.model.CollectionsModel;
import cit360.sandbox.view.CollectionsView;
import java.util.*;

/**
 *
 * @author Mattn
 */
public class CollectionsController {
    
    //Create an instance variable of the CollectionsView class which will 
    //hold all of the methods to display the various views for this part of the program
    CollectionsView collectionsDisplay = new CollectionsView();
    //Create an instance variable of the CollectionsModel class which will 
    //hold all of the data for the collections
    CollectionsModel collectionsData = new CollectionsModel();
    
    //Constructor method
    public CollectionsController() {
    }
    
    //Method to get the model data to pass to the view
    public String modelToString() {
        String message = "The original model data:";
        String model = collectionsData.toString();
        collectionsDisplay.modelDisplay(message,model);
        return null;
    }
    
    
    
    //To get to basic: Use each type of collection (List, Set, Map, Queue, and Tree)
    //in a program showcasing the uniqueness of that type of collection.
    
    //Method to show unigueness of List
    public String listCollection() {
        System.out.println("The List Collection Type:");
        //Create a new list from the model data
        List original = new ArrayList();
        //Populate the new list collection
        String[] abc = collectionsData.getABCs();
        original.addAll(Arrays.asList(abc));
        //Set message and send to view to display output
        String message = "Original List:";
        collectionsDisplay.modelDisplay(message, original);
        
        //The list sort method
        message = "Sorted List:";
        original.sort(null);
        collectionsDisplay.modelDisplay(message, original);
        
        return null;
    }
    
}
