/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.controller;

import cit360.sandbox.model.CollectionsModel;
import cit360.sandbox.model.Products;
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
        String message = "\nThe original model data:";
        String model = collectionsData.toString();
        collectionsDisplay.modelDisplay(message,model);
        return null;
    }
    
    
    
    //To get to basic: Use each type of collection (List, Set, Map, Queue, and Tree)
    //in a program showcasing the uniqueness of that type of collection.
    
    //List example
    //Method to show uniqueness of collection types
    public String collections() {
        collectionsDisplay.display("\nJava Collections:");
        
        //Get arrays from model to be used with collections
        String[] abc = collectionsData.getABCs();
        String[] story = collectionsData.getStory();
        byte[] numbers = collectionsData.getNumbers();
        
        //Create a new list from the model data
        List list1 = new ArrayList();
        //Convenience implementation of List from array
        list1.addAll(Arrays.asList(story));
        //Non-convenience implementation
        List list2 = new ArrayList();
        list2.add(story[0]);
        list2.add(story[1]);
        //Set message and send to view to display output
        String message = "\nList Example (convenience):";
        collectionsDisplay.modelDisplay(message, list1);
        message = "\nList Example (non-convenience):";
        collectionsDisplay.modelDisplay(message, list2);
        message = "\nAdding to list1 and list2:";
        list1.add(story[2]);
        list2.add(story[2]);
        collectionsDisplay.modelDisplay(message, list1);
        collectionsDisplay.modelDisplay(message, list2);
        //The list sort method
        message = "\nSorted List:";
        list1.sort(null);
        collectionsDisplay.modelDisplay(message, list1);
        //List add at index method
        message = "\nAdd at specific index in List:";
        list2.add(2, "Added at index 2");
        collectionsDisplay.modelDisplay(message, list2);
        //List size method
        int list1Size = list1.size();
        int list2Size = list2.size();
        collectionsDisplay.display("\nList1 size: " + list1Size + ""
                + "\nList2 size: " + list2Size);
        //Clear on list and compare both lists with isEmpty() method
        collectionsDisplay.display("\n******Clearing List 1*******");
        list1.clear();
        boolean list1Empty = list1.isEmpty();
        boolean list2Empty = list2.isEmpty();
        collectionsDisplay.display("\nList1 is empty: " + list1Empty + ""
                + "\nList2 is empty: " + list2Empty);
        
        
        //Set Example
        //Create a new set from the array
        Set<String> set1 = new HashSet();
        //Convenience implementation of Set from array
        set1.addAll(Arrays.asList(story));
        //Set message and send to view to display output
        message = "\nHashSet Example:";
        collectionsDisplay.modelDisplay(message, set1);
        
        Set<String> set2 = new TreeSet();
        //Convenience implementation of Set from array
        set2.addAll(Arrays.asList(story));
        //Set message and send to view to display output
        message = "\nTreeSet Example:";
        collectionsDisplay.modelDisplay(message, set2);
        
        Set<String> set3 = new TreeSet();
        //Convenience implementation of Set from array
        set3.addAll(Arrays.asList(story));
        //Set message and send to view to display output
        message = "\nSortedSet Example:";
        collectionsDisplay.modelDisplay(message, set3);
        
        //Map Example
        //Create a new set from the array
        Map<String,String> map1 = new HashMap();
        Map map2 = new HashMap();
        
        //Loop through strings for new Map elements
        for(int i = 0; i < 6; i++) {
            String a = abc[i];
            String b = story[i];
            map1.put(a, b);
        }
        
        //Add a variety of different object types to map 
        //without parametric types
        map2.put(numbers[0], story[0]);
        map2.put(numbers[1], story[1]);
        map2.put(numbers[2], story[2]);
        map2.put(numbers[3], story[3]);
        map2.put(numbers[4], story[4]);
        map2.put(numbers[5], story[5]);
        
        //Set message and send to view to display output
        message = "\nMap Example:";
        collectionsDisplay.modelDisplay(message, map1);
        
        //non-parametrized map collection type has byte key/string value
        message = "\nThis map has no parametric types";
        message += "\nThe key is of type byte and value of type String:";
        collectionsDisplay.modelDisplay(message, map2);
        
        //Queue Example
        Queue<String> queue1 = new LinkedList<>();
        //Populate the queue
        for(int i = 0; i < 6; i++) {
            queue1.add(story[i]);
        }
        
        //Set message and send to the view to display output
        message = "\nQueue Example:";
        collectionsDisplay.modelDisplay(message, queue1);
        
        //Tree Examples
        //Create a new set from the array
        Set<String> tree1 = new TreeSet();
        //Convenience implementation of TreeSet from array
        tree1.addAll(Arrays.asList(story));
        //Set message and send to view to display output
        message = "\nTree Example:";
        collectionsDisplay.modelDisplay(message, tree1);
        
        //Collection examples of object, not just primitive datatypes
        //This collection will be a Map holding the previous collections as well 
        //as instances of the Products class
        Map collections = new TreeMap();
        //Constructor method: public Products(String name, int stock, String vendor, double price)
        Products cereal1 = new Products("Cheereos", 100, "General Mills", 3.50);
        Products cereal2 = new Products("Great Grains", 50, "General Mills", 3.25);
        Products cereal3 = new Products("Cinnamon Toast Crunch", 150, "General Mills", 3.50);
        //Create Map and put cereal objects inside
        Map cereals = new HashMap();
        cereals.put(1, cereal1);
        cereals.put(2, cereal2);
        cereals.put(3, cereal3);
        //Now add all the previous collections into this collection
        collections.put("cereals", cereals);
        collections.put("tree1", tree1);
        collections.put("queue1", queue1);
        collections.put("map2", map2);
        collections.put("map1", map1);
        collections.put("set3", set3);
        collections.put("set2", set2);
        collections.put("set1", set1);
        collections.put("list2", list2);
        collections.put("list1", list1);
        //Now lets see what this complicated collection looks like
        message = "\nMap of all collections:";
        collectionsDisplay.modelDisplay(message, collections);
        
        return null;
    }
    
}
