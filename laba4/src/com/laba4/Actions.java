package com.laba4;

import java.util.*;


public class Actions {
    LinkedList<ListObjects> myList = new LinkedList<>();

public void generateList(){
    for (int i = 0; i<15; i++){
        myList.add(new ListObjects(generateName(), generateCode()));
    }
    }



    public void sortList(){
        myList.sort(Comparator.comparingInt(ListObjects::getCode));
    }

    public void deleteDuplicate(){
        for (int i = 0; i < myList.size() - 1; i++) {
            if (((myList.get(i).getName().equals(myList.get(i + 1).getName()))) && (myList.get(i).getCode() == myList.get(i + 1).getCode())) {
                myList.remove(i);
                i--;

            }
        }
    }

    public void showList(){
        for(ListObjects i : myList){
            //System.out.println("Name: "+i.getName()+System.lineSeparator());
            System.out.println(i.getCode() + "  "+i.getName());
        }
    }

public int generateCode(){
    return (int) (1+Math.random()*5);
}

public String generateName(){
    char[] chars = "a".toCharArray();
    StringBuilder sb = new StringBuilder(2);
    Random random = new Random();
    for (int i = 0; i < 2; i++) {
        char c = chars[random.nextInt(chars.length)];
        sb.append(c);
    }
    return sb.toString();

}
}
