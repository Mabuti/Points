package com.pvminecraft.points;

public class InvalidDestinationException extends Exception {

    public InvalidDestinationException(){

    }

    public InvalidDestinationException(Throwable cause){
        super(cause);
    }

    public InvalidDestinationException(String message, Throwable cause){
        super(message, cause);
    }
}
