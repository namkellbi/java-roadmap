package java_collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListImpl implements ListService{
    @Override
    //TODO: Write a Java program to create a new array list, add some colors (string) and print out the collection
    public void ex1(){
        List<String> listColor = new ArrayList();
        listColor.add("Green");
        listColor.add("Red");
        listColor.add("Yellow");
        System.out.println(listColor);
    }

    @Override
    //TODO: Write a Java program to iterate through all elements in a array list.
    public void ex2(){
        List<String> listColor = new ArrayList();
        listColor.add("Green");
        listColor.add("Red");
        listColor.add("Yellow");
        for (String str: listColor) {
            System.out.println(str);
        }
    }

    @Override
    //TODO: Write a Java program to insert an element into the array list at the first position
    public void ex3(){
        List<String> listColor = new ArrayList<>();
        listColor.add("Green");
        listColor.add("Red");
        listColor.add("Yellow");
        System.out.println(listColor);

        listColor.add(0,"Pink");
        System.out.println(listColor);
    }

    //TODO: Write a Java program to retrieve an element (at a specified index) from a given array list
    @Override
    public void ex4() {
        List<String> listColor = new ArrayList<>();
        listColor.add("Green");
        listColor.add("Red");
        listColor.add("Yellow");
        System.out.println(listColor.get(1));
    }

    //TODO: Write a Java program to update specific array element by given element.
    @Override
    public void ex5() {
        List<String> listColor = new ArrayList();
        listColor.add("Green");
        listColor.add("Red");
        listColor.add("Yellow");
        System.out.println(listColor);
        listColor.set(1, "Red Update");
        System.out.println(listColor);
    }

    //TODO: Write a Java program to remove the third element from a array list.
    @Override
    public void ex6() {
        List<String> listColor = new ArrayList();
        listColor.add("Green");
        listColor.add("Red");
        listColor.add("Yellow");
        System.out.println(listColor);
        listColor.remove(1);
        System.out.println(listColor);
    }

    //TODO: Write a Java program to search an element in a array list
    @Override
    public void ex7() {
        List<String> listColor = new ArrayList();
        listColor.add("Green");
        listColor.add("Red");
        listColor.add("Yellow");

        if (listColor.contains("Red")){
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

    //TODO: Write a Java program to sort a given array list.
    @Override
    public void ex8() {
        List<String> listColor = new ArrayList<>();
        listColor.add("Green");
        listColor.add("Red");
        listColor.add("Yellow");
        System.out.println(listColor);

        Collections.sort(listColor);
        System.out.println(listColor);
    }

    //TODO; Write a Java program to copy one array list into another.
    @Override
    public void ex9() {
        List<String> listColor = new ArrayList();
        listColor.add("Green");
        listColor.add("Red");
        listColor.add("Yellow");
        System.out.println(listColor);

        List <String> listCopy = new ArrayList<>();
        Collections.copy(listColor,listCopy);
        System.out.println("list copy: "+ listCopy);
    }

    //TODO: Write a Java program to shuffle elements in a array list.
    @Override
    public void ex10() {

    }

    @Override
    public void ex11() {

    }

    @Override
    public void ex12() {

    }

    @Override
    public void ex13() {

    }

    @Override
    public void ex14() {

    }

    @Override
    public void ex15() {

    }

    @Override
    public void ex16() {

    }

    @Override
    public void ex17() {

    }

    @Override
    public void ex18() {

    }

    @Override
    public void ex19() {

    }

    @Override
    public void ex20() {

    }

    @Override
    public void ex21() {

    }

    @Override
    public void ex22() {

    }
}
