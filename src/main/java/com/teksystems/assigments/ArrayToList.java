package com.teksystems.assigments;

import java.util.ArrayList;

class ArrayToList implements MyList{
    ArrayList<String> arrayToList;
    
    ArrayToList(){
        arrayToList = new ArrayList<String>();
    }
    
    @Override
    public void convert(String[] a){
        for (String str : a){
            arrayToList.add(str);
            System.out.println("I have added the string: " + str + " at the index: " + arrayToList.indexOf(str));
        }
    }
    
    @Override
    public void replace(int idx){
        String replacedString = arrayToList.get(idx);
        arrayToList.set(idx, "");
        System.out.println("I have replaced the string: " + replacedString + " with a null string");
    }
    
    @Override
    public ArrayList<String> compact(){
        ArrayList<String> compactedList = new ArrayList<String>();
        for (String str: arrayToList){
            if (!str.equals("")){
                compactedList.add(str);
            }
        }
        return compactedList;
    }
}
