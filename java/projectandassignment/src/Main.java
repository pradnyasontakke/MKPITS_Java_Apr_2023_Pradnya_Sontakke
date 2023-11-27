//create an arraylist of string representation words in sentence.
//        implement a method to count the frequency of each word .
//        display the word along with their frequency in descending order


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            String sentence = "java is a object oriented programming language.";

            /////////// Split the sentence into an array of words
            String[] wordsOfArray = sentence.split("\\s+");

            // Create an ArrayList from the array
            ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsOfArray));
             /////////////The asList() method of java.util.Arrays class is used to return a fixed-size list backed by the specified array.

            /////////// Print the ArrayList
            System.out.println("ArrayList of words: " + wordsList);
       }
    }
