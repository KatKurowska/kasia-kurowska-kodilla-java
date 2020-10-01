package com.kodilla.exception.nullpointer;

public class MessageNotSentException extends Exception{

    public MessageNotSentException(final String message){
        super(message);
    }
}

/* due to extending Exception class, the exception is checked
and its handling is NECESSARY
*/