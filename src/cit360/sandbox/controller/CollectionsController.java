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
    
    //Method to show uniqueness of List
    public String listCollection() {
        System.out.println("Java Collections:");
        //Create a new list from the model data
        List list1 = new ArrayList();
        //Get arrays from model to be used with collections
        String[] abc = collectionsData.getABCs();
        String[] story = collectionsData.getStory();
        byte[] numbers = collectionsData.getNumbers();
        
        list1.addAll(Arrays.asList(story));
        //Set message and send to view to display output
        String message = "List Example:";
        collectionsDisplay.modelDisplay(message, list1);
        
        //Set Example
        //Create a new set from the array
        Set<String> set1 = new HashSet();
        set1.addAll(Arrays.asList(story));
        //Set message and send to view to display output
        message = "Set Example:";
        collectionsDisplay.modelDisplay(message, set1);
        
        //Map Example
        //Create a new set from the array
        Map<String,String> map1 = new HashMap();
        
        map1.put("Test", "Run");
        //Loop through strings for new Map elements
        for(int i = 0; i < 6; i++) {
            String a = abc[i];
            String b = story[i];
            map1.put(a, b);
        }
        
        //Set message and send to view to display output
        message = "Map Example:";
        collectionsDisplay.modelDisplay(message, map1);
        
        //Queue Example
        
        //Tree Example
        
        //The list sort method
        message = "Sorted List:";
        list1.sort(null);
        collectionsDisplay.modelDisplay(message, list1);
        
        
        
        return null;
    }
    
}
