/*
 * CIT 360 Sandbox Code
 * Author:  Matthew Schaupp
 */
package cit360.sandbox.model;

import java.util.Objects;

/**
 *
 * @author Mattn
 */

public class Products {
    
    String name;
    int stock;
    String vendor;
    double price;

    public Products(String name, int stock, String vendor, double price) {
        this.name = name;
        this.stock = stock;
        this.vendor = vendor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + this.stock;
        hash = 31 * hash + Objects.hashCode(this.vendor);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final Products other = (Products) obj;
        if (this.stock != other.stock) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.vendor, other.vendor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Products{" + "name=" + name + ", stock=" + stock + ", vendor=" + vendor + ", price=" + price + '}';
    }
    
    

}
