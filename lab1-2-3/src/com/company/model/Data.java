package com.company.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Data {


    public static Show[] fillDataArray(){
        Show[] dataArr = new Show[5];
        dataArr[0] = new Show("Macbeth", "genre0", "theatre0", LocalDate.of(2001, 2, 21), "Time0", 10, 12, "John");
        dataArr[1] = new Show("name1", "genre1", "theatre1", LocalDate.of(2001, 2, 22), "Time1", 17, 15, "John");
        dataArr[2] = new Show("name2", "genre2", "theatre2", LocalDate.of(2001, 2, 24), "Time2", 24, 20, "Smith");
        dataArr[3] = new Show("name3", "genre3", "theatre3", LocalDate.of(2001, 2, 24), "Time3", 30, 16, "John");
        dataArr[4] = new Show("name4", "genre4", "theatre4", LocalDate.of(2001, 2, 27), "Time4", 12, 14, "Henry");

        return dataArr;
    }


    public static Show[] fillNewDataArray(){
        String str = "aaa";
        int a = 2;
        Show[] newDataArr = new Show[5];
        newDataArr[0] = new Show(str, str, str, LocalDate.of(2001, 2, 21), str, a, a, str );
        for(int i =0; i<5; i++){

        }
        return newDataArr;
    }

public static Show[] textDataArray() throws FileNotFoundException {
    File file = new File("C:\\GoogleDrive\\Java\\lab3.txt");
    Scanner scanner = new Scanner(file);
    //String line = scanner.nextLine();
    Show[] textDataArr = new Show[5];
    while(scanner.hasNext()){


        for(int i =0; i<5; i++){

            String line = scanner.nextLine();
            String[] arr = line.split(";");
        textDataArr[i] = new Show(arr[0], arr[1], arr[2], LocalDate.of(Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5])), arr[6], Integer.parseInt(arr[7]), Integer.parseInt(arr[8]), arr[9]);
        }

    }
    scanner.close();
    return textDataArr;
}


}

