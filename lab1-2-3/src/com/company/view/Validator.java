package com.company.view;

import com.company.view.exceptions.*;

public class Validator {
     public void validateMenuCommand(String menuCommand) throws WrongMenuCommandException {
         if(!menuCommand.matches("[1-4]")){
         throw new WrongMenuCommandException("Menu command is invalid ");
         }
    }

    public boolean validateName(String name){
             return !name.matches("[a-zA-Z]*(?i).*");
    }

   public void validateActorName(String actorName) throws WrongActorNameException {
         if (!actorName.matches("[a-zA-Z]*")){
             throw new WrongActorNameException("Actor's name is invalid ");
         }
    }


   public void validatePartDate(int day, int month, int year) throws WrongDateException{

         if((month == 4 || month == 6 || month == 9 || month == 11) && day>=30){
             throw new WrongDateException("Invalid date. Input another date");
         }
         else if (month == 2 && day>=30){
             throw new WrongDateException("February can't contain so much days");
         }

         else if (day>=31){
             throw new WrongDateException("Invalid date. Input another date");

       }
   }

   public void validateFilePath(String filePath) throws WrongFilePathException{
       if (!filePath.matches("[a-zA-Z]*(?i).*")){
           throw new WrongFilePathException("File path is invalid. Input another file path ");
       }
   }

}
