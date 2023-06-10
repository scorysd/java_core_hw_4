package ru.gb.hw;

public class MyArraySizeException extends MyArrayException {
    public MyArraySizeException(String message, int width, int height) {
        super(message, width, height);
    }
}
