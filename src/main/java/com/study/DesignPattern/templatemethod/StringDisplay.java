package com.study.DesignPattern.templatemethod;

public class StringDisplay extends AbstractDisplay {
    private String str;
    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.length();
    }

    @Override
    public void open() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++)
            System.out.print("-");
        System.out.println("+");
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        printLine();
    }
}
