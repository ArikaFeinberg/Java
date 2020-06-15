package com.company.model;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.time.LocalDate;

public class Show {
    private String Name;
    private String Genre;
    private String Theatre;
    private LocalDate Date;
    private String Time;
    private int Price;
    private int Count;
    private String mainActor;



    public Show(String name, String genre, String theatre, LocalDate date, String time, int price, int count, String mainActor) {
        this.Name = name;
        this.Genre = genre;
        this.Theatre = theatre;
        //this.S_Date = date;
        this.Date = date;
        this.Time = time;
        this.Price = price;
        this.Count = count;
        this.mainActor = mainActor;
    }
    public String getName(){
        return Name;
    }

    public String getGenre() {
        return Genre;
    }

    public String getTheatre() {
        return Theatre;
    }

    public LocalDate getDate(){
        return Date;
    }

    public String getTime() {
        return Time;
    }

    public int getPrice() {
        return Price;
    }

    public int getCount() {
        return Count;
    }
    public String getMainActor(){
        return mainActor;
}
}
