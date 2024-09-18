package basic.arraylist.method;

import basic.arraylist.ArrayListOpen;

public class AddList {
    public static void main(String[] args) {
        ArrayListOpen listArray = new ArrayListOpen();
        listArray.myGroups.add("John");
        listArray.myGroups.add("El mangrove");
        System.out.println(listArray.myGroups);
    }
}
