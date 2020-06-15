package com.company.view;
import com.company.model.Show;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class FileOperator {
    public static Show[] dataReader() throws FileNotFoundException {
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

    public void dataWriter(String filePath, String builder){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(builder);
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }



    }




