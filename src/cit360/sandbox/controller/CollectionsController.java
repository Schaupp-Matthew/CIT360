/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.controller;

import cit360.sandbox.model.CollectionsModel;
import cit360.sandbox.view.CollectionsView;

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
        String model = collectionsData.toString();
        collectionsDisplay.modelDisplay(model);
        return null;
    }
    
    
    
    //To get to basic: Use each type of collection (List, Set, Map, Queue, and Tree)
    //in a program showcasing the uniqueness of that type of collection.
    
    
    
}
