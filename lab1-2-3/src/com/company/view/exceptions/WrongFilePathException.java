package com.company.view.exceptions;
import java.io.IOException;

public class WrongFilePathException extends IOException{
    public WrongFilePathException(String message){
        super(message);
    }
}
