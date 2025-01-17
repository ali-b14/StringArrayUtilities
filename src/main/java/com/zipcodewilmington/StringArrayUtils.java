package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        if(Arrays.toString(array).contains(value)){

        }
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));

        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
//        for(String reverseArray : array){
//            System.out.println(reverseArray);
//        }
        int i = 0;
        int j = array.length-1;

        while(i<= array.length-1){
            if(array[i].equals(array[j])){
                i++;
                j--;
            }else {
               return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
//        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        boolean[] mark = new boolean[26];
        boolean pangram = true;
        int index = 0;
        String arrayConversionToString = Arrays.toString(array);

        for (int i = 0; i < arrayConversionToString.length(); i++){

            char currentCharacter = arrayConversionToString.charAt(i);

            if (currentCharacter >= 'A' && currentCharacter <= 'Z'){
                index = currentCharacter - 'A';
            } else if (currentCharacter >= 'a' && currentCharacter <= 'z'){
                index = currentCharacter - 'a';
            }
            mark[index] = true;
        }
        for (int i = 0; i < mark.length; i++){
            if (mark[i] == false){
                pangram = false;
            }
        }
        if (pangram){
            return true;
        } else{
        return false;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;

        System.out.println(value);
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArrayList = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if(!array[i].equals(valueToRemove)){
                newArrayList.add(array[i]);
            }
        }
        String[] finalArray = newArrayList.toArray(new String[0]);

        return finalArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        List<String> noDup = new ArrayList<>();
        noDup.add(array[0]);
        for(int i = 1; i < array.length; i++){
            if(!array[i].equals(array[i - 1])){
                noDup.add(array[i]);
            }
        }
        return noDup.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> holder = new ArrayList<>();
        StringBuilder appending = new StringBuilder();


        appending.append(array[0]);
        for(int i = 1; i < array.length; i++){
            if(array[i].equals(array[i - 1])){
                appending.append(array[i]);
            } else if (!array[i].equals(array[i - 1])) {
                holder.add(appending.toString());
                appending.setLength(0); //clears appending
                appending.append(array[i]);

            }
        }
        holder.add(appending.toString());

        return holder.toArray(new String[0]);
    }


}
