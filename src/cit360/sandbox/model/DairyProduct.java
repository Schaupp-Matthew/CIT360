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
//Example of serialization/specialization
//This is a Java Bean
public class DairyProduct extends Products implements Serializable{
    
    String type;
    String expDate;

    public DairyProduct(String type, String expDate, String name, int stock, String vendor, double price) {
        super(name, stock, vendor, price);
        this.type = type;
        this.expDate = expDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.type);
        hash = 29 * hash + Objects.hashCode(this.expDate);
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
        final DairyProduct other = (DairyProduct) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.expDate, other.expDate)) {
            return false;
        }
        return true;
    }
    
    
    
}
