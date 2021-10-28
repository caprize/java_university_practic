package com.company;

public class NotInDBInnException extends Exception {
    public NotInDBInnException(String message) {
        super(message);
    }
}
