package ru.gb.hw;

abstract class MyArrayException extends Exception{
    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public MyArrayException(String message, int width, int height) {
        super(message);
        this.width = width;
        this.height = height;
    }
}
