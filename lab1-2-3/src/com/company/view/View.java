package com.company.view;
import com.company.model.Show;
import com.company.view.exceptions.*;

import java.time.format.DateTimeFormatter;

import java.util.Scanner;
import java.lang.String;

public class View {
    Scanner in = new Scanner(System.in);
    Validator validator = new Validator();

    public int inputCommand()  {
        String menuCommand;
        print(System.lineSeparator()+"-----------------"+System.lineSeparator()+"1 - Theatre by name and date: "+ System.lineSeparator() +"2 - Performance by actor "+ System.lineSeparator() +"3 - Show all data"+System.lineSeparator()+"4 - Exit"+System.lineSeparator()+"Input command: ");
        menuCommand = in.next();
        try {
            validator.validateMenuCommand(menuCommand);

        }catch (WrongMenuCommandException e){
            showErrorMessage(e.getMessage());
           return -1;
        }
        return Integer.parseInt(menuCommand);
        }

   public String inputName(){
        String name;
        do{
            print("Input name of the play: ");
            name = in.next();
            //System.out.print(validator.validateName(name));
            if(validator.validateName(name)){
                print("Name is invalid, input another name");
            }
        }while(validator.validateName(name));
        return name;

   }
   /*public String input_date(){
       String date;
       do{
           print("Input date like 2001-02-21: ");
           date = in.next();
           try{
               validator.validateDate(date);
               return date;
           }catch (WrongDateException e){
               showErrorMessage(e.getMessage());

           }
           //  if(validator.validateActorName(name)){
           //print("Name is invalid, input another name");
           // }
       }while(true);
       //return date;
       // print("Input date like: 21-июл.-01: ");
    //return in.next();
}*/

public String inputPartDate(){
        String day, month, year;
        String date;
    StringBuilder builder = new StringBuilder();
    do{
        print("Input day: ");
        day = in.next();
        print("Input month: ");
        month = in.next();
        print("Input year: ");
        year = in.next();
        date = year.concat("-").concat(month).concat("-").concat(day);
        try{
            validator.validatePartDate(Integer.parseInt(day), Integer.parseInt(month), Integer.parseInt(year));
            return date;
        } catch (WrongDateException e){
            showErrorMessage(e.getMessage());

        }
    }while(true);
}




public String inputActorName(){
        String name;
    do{
        print("Input actor's name: ");
        name = in.next();

        try{
            validator.validateActorName(name);
            return name;
        } catch (WrongActorNameException e){
            showErrorMessage(e.getMessage());

        }
    }while(true);

}

public String inputFilePath(){
    int command;
    String filePath;
    print("Do you want to save result to file? 1 - yes; any other number - no");
    command = in.nextInt();
    if (command==1){
        do{
        print("Enter a file path: ");
        filePath = in.next();
        try{
            validator.validateFilePath(filePath);
            return filePath;
        } catch (WrongFilePathException e) {
            showErrorMessage(e.getMessage());
        }

        }while (true);
    }
    else
        return "-";
   //print("Enter a file path: ");
   //filePath = in.next();
   //return filePath;
}


    public void print(String str){
        System.out.print(str + System.lineSeparator());
    }

    public void printResult(String str){
        System.out.print("Result: "+str+System.lineSeparator());
    }

    public void printArr(Show[] arrStr){
       // SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for(int i =0; i<arrStr.length; i++) {
            System.out.print("Show №" + (i + 1) + ": " + "Name: " + arrStr[i].getName() + "| Genre: " + arrStr[i].getGenre() + "| Theatre: " + arrStr[i].getTheatre() + "| Date: " + arrStr[i].getDate().format(dateTimeFormatter) + "| Time: " + arrStr[i].getTime() + "| Price: " + arrStr[i].getPrice() + "| Number of actors: " + arrStr[i].getCount() + "| Main actor: " + arrStr[i].getMainActor() + System.lineSeparator()+"------------------------------------------------------------------------------------------------------------------------------------------------------------------------"+System.lineSeparator());
        }
    }

    public void printArrResult(Show[] arrStr, int i){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print(" ");
    }

    public void showErrorMessage(String str){
        System.err.println(str);
    }


}
