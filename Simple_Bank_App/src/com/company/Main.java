package com.company;
//Arrays review

import java.util.ArrayList;

class IntClass{ // int is not used in an array list as arraylists do not take primitive values. This intclass is a wrapper.
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");
        ArrayList<IntClass> IntClassArrayList = new ArrayList<IntClass>();
        IntClassArrayList.add(new IntClass(54));

        //we can use inbuilt wrappers to replace all the above code like shown below:


        Integer integer = new Integer(54); //Integer is a class instead of a primitive double type
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); //valueOf takes the integer values and converts them to integer class so they can be used
        }
        //Integer.valueOf converting from a primitize type to a class in a wrapper--> autoboxing
        for (int j = 0; j <= 10; j++) {
            System.out.println(j + " --> " + intArrayList.get(j).intValue());
            //intArrayList.get(i).intValue() is unboxing. Changing it from the Integer class in the wrapper to primitive type.
        }

        //There is a shortcut way to do it
        Integer myIntValue = 56; // At compile time, java runs it like Integer.valueOf(56);
        int myInt = myIntValue.intValue(); //java is operating myIntValue.intValue();
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubleValues.add(dbl); //autoboxing
        }
for (int i =0; i< myDoubleValues.size(); i++){
    double value = myDoubleValues.get(i); // unboxing
    System.out.println(i +"  -->" + value);
}

    }
}


