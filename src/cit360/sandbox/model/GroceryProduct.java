/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Mattn
 */
//Example of serialization - getting more specific
//This is a Java Bean
public class GroceryProduct extends Products implements Serializable{
    
    String type;

    public GroceryProduct(String type, String name, int stock, String vendor, double price) {
        super(name, stock, vendor, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GroceryProduct other = (GroceryProduct) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    
}
