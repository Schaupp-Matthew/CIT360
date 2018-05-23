/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.controller;

import cit360.sandbox.view.View;
import java.util.HashMap;

/**
 *
 * @author Matthew
 */
public class SubtractHandler implements Handler{
    View display = new View();
    
    @Override
    public void execute(HashMap<String, Object> data) {
        int a = (int)data.get("a");
        int b = (int)data.get("b");
        int c = a - b;
        
        String message = "Subtraction: " + a + " "
                + "- " + b + " = " + c;
        
        display.display(message);
        
    }
}
