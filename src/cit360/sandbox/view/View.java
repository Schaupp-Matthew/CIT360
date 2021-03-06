/*
 * Main Menu
 */
package cit360.sandbox.view;

import java.util.*;

/**
 *
 * @author Mattn
 */
public class View {

    //Constructor method
    public View() {
    }
    
    //Overloaded one parameter display methods:
    //String display
    public String display(String output) {
        System.out.println(output);
        return null;
    }
    
    //Overloaded display methods:
    //Method to display message and output
    public String modelDisplay(String message, String output) {
        System.out.println(message);
        System.out.println(output);
        return null;
    }
    
    //Method to display message and output
    public String modelDisplay(String message, List output) {
        System.out.println(message);
        System.out.println(output);
        return null;
    }
    
    //Method to display message and output
    public String modelDisplay(String message, Set output) {
        System.out.println(message);
        System.out.println(output);
        return null;
    }
    
    //Method to display message and output
    public String modelDisplay(String message, Map output) {
        System.out.println(message);
        System.out.println(output);
        return null;
    }
    
    //Method to display message and output
    public String modelDisplay(String message, Queue output) {
        System.out.println(message);
        System.out.println(output);
        return null;
    }
    
}
