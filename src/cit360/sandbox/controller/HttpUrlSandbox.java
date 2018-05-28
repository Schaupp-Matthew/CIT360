/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.controller;

import cit360.sandbox.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Matthew
 */
public class HttpUrlSandbox {

    public HttpUrlSandbox() {
       
    }
    
    View display = new View();
    String message;
    
    public void mySite() throws MalformedURLException, IOException {
        //Read from oracle site
        URL site = new URL("https://schaupp-matthew.github.io/Pages/sub4");
        URLConnection connect = site.openConnection();
        
        message = "\nProtocol: " + site.getProtocol() + ""
                + "\nHost: " + site.getHost() + ""
                + "\nPath: " + site.getPath() + ""
                + "\nFile: " + site.getFile() + ""
                + "\nPort: " + site.getPort() + ""
                + "\nQuery: " + site.getQuery() + ""
                + "\nReference: " + site.getRef();
        display.display(message);
        
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connect.getInputStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.out.println("**********HttpUrlSandbox.mySite() Error");
        }
        
    }
}
