package com.laba4;


import java.util.Scanner;

public class Menu {
    public static void startProgramme(){
        Actions actions = new Actions();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Choose menu item: "+ System.lineSeparator());
            System.out.print("1 - Generate and print list"+ System.lineSeparator());
            System.out.print("2 - Sort and print list"+ System.lineSeparator());
            System.out.print("3 - Delete full duplicates and print list"+ System.lineSeparator());
            System.out.print("4 - Exit"+ System.lineSeparator());
            switch (scanner.nextInt()){
                case 1:
                    actions.generateList();
                    actions.showList();
                    break;
                case 2:
                    actions.sortList();
                    actions.showList();
                    break;
                case 3:
                    actions.deleteDuplicate();
                    actions.showList();
                    break;
                case 4:
                    System.exit(0);
            }
        }while(true);
    }
}
