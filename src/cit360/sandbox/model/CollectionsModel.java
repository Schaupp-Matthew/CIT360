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
public class CollectionsModel {
    
    //Atomic variable
    public int atomic = 0;

    public synchronized int getAtomic() {
        return atomic;
    }

    public synchronized void setAtomic(int atomic) {
        this.atomic = atomic;
    }
    
    //Here are several instance variables that will be used within collections
    String string1 = "Once upon a time";
    String string2 = "There was a family";
    String string3 = "that lived happily";
    String string4 = "ever after";
    String string5 = "The";
    String string6 = "End";
    String string7 = "A";
    String string8 = "B";
    String string9 = "C";
    String string10 = "D";
    String string11 = "E";
    String string12 = "F";
    
    String [] story = {string1, string2, string3, string4, string5, string6, string1, string2, string3, string4, string5, string6};
    String [] ABCs = {string7, string8, string9, string10, string11, string12};
    
    byte one = 1;
    byte two = 2;
    byte three = 3;
    byte four = 4;
    byte five = 5;
    byte six = 6;
    byte seven = 7;
    byte eight = 8;
    byte nine = 9;
    byte ten = 10;
    
    byte [] numbers = {one, two, three, four, five, six, one, two, three, four, five, six};
    
    boolean test1 = true;
    boolean test2 = true;
    boolean test3 = true;
    boolean test4 = false;
    boolean test5 = false;
    boolean test6 = false;
    
    boolean [] condition = {test1, test2, test3, test4, test5, test6, test1, test2, test3, test4, test5, test6};

    //Constructor method
    public CollectionsModel() {
    }

    //Getters and setters for instance variables
    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public String getString3() {
        return string3;
    }

    public void setString3(String string3) {
        this.string3 = string3;
    }

    public String getString4() {
        return string4;
    }

    public void setString4(String string4) {
        this.string4 = string4;
    }

    public String getString5() {
        return string5;
    }

    public void setString5(String string5) {
        this.string5 = string5;
    }

    public String getString6() {
        return string6;
    }

    public void setString6(String string6) {
        this.string6 = string6;
    }

    public String getString7() {
        return string7;
    }

    public void setString7(String string7) {
        this.string7 = string7;
    }

    public String getString8() {
        return string8;
    }

    public void setString8(String string8) {
        this.string8 = string8;
    }

    public String getString9() {
        return string9;
    }

    public void setString9(String string9) {
        this.string9 = string9;
    }

    public String getString10() {
        return string10;
    }

    public void setString10(String string10) {
        this.string10 = string10;
    }

    public String getString11() {
        return string11;
    }

    public void setString11(String string11) {
        this.string11 = string11;
    }

    public String getString12() {
        return string12;
    }

    public void setString12(String string12) {
        this.string12 = string12;
    }

    public int getOne() {
        return one;
    }

    public void setOne(byte one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(byte two) {
        this.two = two;
    }

    public int getThree() {
        return three;
    }

    public void setThree(byte three) {
        this.three = three;
    }

    public int getFour() {
        return four;
    }

    public void setFour(byte four) {
        this.four = four;
    }

    public int getFive() {
        return five;
    }

    public void setFive(byte five) {
        this.five = five;
    }

    public int getSix() {
        return six;
    }

    public void setSix(byte six) {
        this.six = six;
    }

    public int getSeven() {
        return seven;
    }

    public void setSeven(byte seven) {
        this.seven = seven;
    }

    public int getEight() {
        return eight;
    }

    public void setEight(byte eight) {
        this.eight = eight;
    }

    public int getNine() {
        return nine;
    }

    public void setNine(byte nine) {
        this.nine = nine;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(byte ten) {
        this.ten = ten;
    }

    public boolean isTest1() {
        return test1;
    }

    public void setTest1(boolean test1) {
        this.test1 = test1;
    }

    public boolean isTest2() {
        return test2;
    }

    public void setTest2(boolean test2) {
        this.test2 = test2;
    }

    public boolean isTest3() {
        return test3;
    }

    public void setTest3(boolean test3) {
        this.test3 = test3;
    }

    public boolean isTest4() {
        return test4;
    }

    public void setTest4(boolean test4) {
        this.test4 = test4;
    }

    public boolean isTest5() {
        return test5;
    }

    public void setTest5(boolean test5) {
        this.test5 = test5;
    }

    public boolean isTest6() {
        return test6;
    }

    public void setTest6(boolean test6) {
        this.test6 = test6;
    }

    public String[] getABCs() {
        return ABCs;
    }

    public void setABCs(String[] ABCs) {
        this.ABCs = ABCs;
    }

    public String[] getStory() {
        return story;
    }

    public void setStory(String[] story) {
        this.story = story;
    }

    public byte[] getNumbers() {
        return numbers;
    }

    public void setNumbers(byte[] numbers) {
        this.numbers = numbers;
    }

    public boolean[] getCondition() {
        return condition;
    }

    public void setCondition(boolean[] condition) {
        this.condition = condition;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.string1);
        hash = 67 * hash + Objects.hashCode(this.string2);
        hash = 67 * hash + Objects.hashCode(this.string3);
        hash = 67 * hash + Objects.hashCode(this.string4);
        hash = 67 * hash + Objects.hashCode(this.string5);
        hash = 67 * hash + Objects.hashCode(this.string6);
        hash = 67 * hash + Objects.hashCode(this.string7);
        hash = 67 * hash + Objects.hashCode(this.string8);
        hash = 67 * hash + Objects.hashCode(this.string9);
        hash = 67 * hash + Objects.hashCode(this.string10);
        hash = 67 * hash + Objects.hashCode(this.string11);
        hash = 67 * hash + Objects.hashCode(this.string12);
        hash = 67 * hash + this.one;
        hash = 67 * hash + this.two;
        hash = 67 * hash + this.three;
        hash = 67 * hash + this.four;
        hash = 67 * hash + this.five;
        hash = 67 * hash + this.six;
        hash = 67 * hash + this.seven;
        hash = 67 * hash + this.eight;
        hash = 67 * hash + this.nine;
        hash = 67 * hash + this.ten;
        hash = 67 * hash + (this.test1 ? 1 : 0);
        hash = 67 * hash + (this.test2 ? 1 : 0);
        hash = 67 * hash + (this.test3 ? 1 : 0);
        hash = 67 * hash + (this.test4 ? 1 : 0);
        hash = 67 * hash + (this.test5 ? 1 : 0);
        hash = 67 * hash + (this.test6 ? 1 : 0);
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
        final CollectionsModel other = (CollectionsModel) obj;
        if (this.one != other.one) {
            return false;
        }
        if (this.two != other.two) {
            return false;
        }
        if (this.three != other.three) {
            return false;
        }
        if (this.four != other.four) {
            return false;
        }
        if (this.five != other.five) {
            return false;
        }
        if (this.six != other.six) {
            return false;
        }
        if (this.seven != other.seven) {
            return false;
        }
        if (this.eight != other.eight) {
            return false;
        }
        if (this.nine != other.nine) {
            return false;
        }
        if (this.ten != other.ten) {
            return false;
        }
        if (this.test1 != other.test1) {
            return false;
        }
        if (this.test2 != other.test2) {
            return false;
        }
        if (this.test3 != other.test3) {
            return false;
        }
        if (this.test4 != other.test4) {
            return false;
        }
        if (this.test5 != other.test5) {
            return false;
        }
        if (this.test6 != other.test6) {
            return false;
        }
        if (!Objects.equals(this.string1, other.string1)) {
            return false;
        }
        if (!Objects.equals(this.string2, other.string2)) {
            return false;
        }
        if (!Objects.equals(this.string3, other.string3)) {
            return false;
        }
        if (!Objects.equals(this.string4, other.string4)) {
            return false;
        }
        if (!Objects.equals(this.string5, other.string5)) {
            return false;
        }
        if (!Objects.equals(this.string6, other.string6)) {
            return false;
        }
        if (!Objects.equals(this.string7, other.string7)) {
            return false;
        }
        if (!Objects.equals(this.string8, other.string8)) {
            return false;
        }
        if (!Objects.equals(this.string9, other.string9)) {
            return false;
        }
        if (!Objects.equals(this.string10, other.string10)) {
            return false;
        }
        if (!Objects.equals(this.string11, other.string11)) {
            return false;
        }
        if (!Objects.equals(this.string12, other.string12)) {
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CollectionsModel{" + "string1=" + string1 + ", string2=" + string2 + ", string3=" + string3 + ", string4=" + string4 + ", string5=" + string5 + ", string6=" + string6 + ", string7=" + string7 + ", string8=" + string8 + ", string9=" + string9 + ", string10=" + string10 + ", string11=" + string11 + ", string12=" + string12 +  ", one=" + one + ", two=" + two + ", three=" + three + ", four=" + four + ", five=" + five + ", six=" + six + ", seven=" + seven + ", eight=" + eight + ", nine=" + nine + ", ten=" + ten + ", test1=" + test1 + ", test2=" + test2 + ", test3=" + test3 + ", test4=" + test4 + ", test5=" + test5 + ", test6=" + test6 + '}';
    }
    
    
    
}
