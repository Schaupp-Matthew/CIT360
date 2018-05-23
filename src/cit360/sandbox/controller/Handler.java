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

//Application Controller Pattern
//Handler interface to be implemented by each handler
public interface Handler {
    public void execute(HashMap<String, Object> data);
}
