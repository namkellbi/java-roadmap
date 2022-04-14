package java_collection.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

   //TODO: Write a Java program to create a new array list, add some colors (string) and print out the collection

    public static void main(String[] args) {
        List<String> listColor = new ArrayList();
        listColor.add("Green");
        listColor.add("Red");
        listColor.add("Yellow");
        System.out.println(listColor);
    }

}
