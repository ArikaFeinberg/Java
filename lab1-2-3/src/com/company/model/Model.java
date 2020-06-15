package com.company.model;

import com.company.view.FileOperator;

import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;


public class Model {

    Show[] arrStr = FileOperator.dataReader();
    StringBuilder builder = new StringBuilder();
    StringBuilder builderForTheatre = new StringBuilder();
    StringBuilder builderForPerformance = new StringBuilder();

    public Model() throws FileNotFoundException {
    }


    public String findTheatre(String your_word, String yourDate){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        builderForTheatre.setLength(0);
        for (int i = 0; i < arrStr.length; i++) {
            if ((arrStr[i].getName().equals(your_word)) && (arrStr[i].getDate().format(dateTimeFormatter)).equals(yourDate)) {

                builderForTheatre.append("Show №").append(i + 1).append(": ").append("Name: ").append(arrStr[i].getName()).append("| Genre: ").append(arrStr[i].getGenre()).append("| Theatre: ").append(arrStr[i].getTheatre()).append("| Date: ").append(arrStr[i].getDate().format(dateTimeFormatter)).append("| Time: ").append(arrStr[i].getTime()).append("| Price: ").append(arrStr[i].getPrice()).append("| Number of actors: ").append(arrStr[i].getCount()).append("| Main actor: ").append(arrStr[i].getMainActor());
                builderForTheatre.append(System.lineSeparator());
            }
        }
        if(builderForTheatre.length() != 0){
            return builderForTheatre.toString();
        }
        else
            return "Not found";
    }


    public String findName(String actor){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        StringBuilder builderForPerformance = new StringBuilder();
        builderForPerformance.setLength(0);
        for (int i = 0; i < arrStr.length; i++) {
            if ((arrStr[i].getMainActor().equals(actor))){

                builderForPerformance.append("Show №").append(i + 1).append(": ").append("Name: ").append(arrStr[i].getName()).append("| Genre: ").append(arrStr[i].getGenre()).append("| Theatre: ").append(arrStr[i].getTheatre()).append("| Date: ").append(arrStr[i].getDate().format(dateTimeFormatter)).append("| Time: ").append(arrStr[i].getTime()).append("| Price: ").append(arrStr[i].getPrice()).append("| Number of actors: ").append(arrStr[i].getCount()).append("| Main actor: ").append(arrStr[i].getMainActor());
               // builder.append(getArrLine(i));
                builderForPerformance.append(System.lineSeparator());
            }
        }
        if (builderForPerformance.length() != 0){
            //System.out.print(builderForPerformance.toString());
            return builderForPerformance.toString();
        }
        else
            return "Not found";
    }

    public Show getArrLine(int i){
        return arrStr[i];
    }

    public Show[] getArrStr(){
        return arrStr;
    }

    public StringBuilder getBuilderForTheatre(){
        return builderForTheatre;
    }

    public StringBuilder getBuilderForPerformance() {
        return builderForPerformance;
    }
}







