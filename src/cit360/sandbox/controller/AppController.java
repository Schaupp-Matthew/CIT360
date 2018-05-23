/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.controller;

import java.util.HashMap;

/**
 *
 * @author Matthew
 */

//Application controller pattern
//Application controller to use to map a command to a handler
//and then pass the necessary parameters to the appropriate handler
public class AppController {
    
    private HashMap<String, Handler> handlerMap = new HashMap();
    
    public void handleRequest (String command, HashMap<String, Object> data) {
        Handler commandHandler = handlerMap.get(command);
        if (commandHandler != null){
            commandHandler.execute(data);
        }
    }
    
    public void mapCommand(String command, Handler commandHandler) {
        handlerMap.put(command, commandHandler);
    }
    
}
