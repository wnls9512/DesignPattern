package com.study.DesignPattern.templatemethod.test;

import com.study.DesignPattern.templatemethod.AbstractDisplay;

public class StringDisplay implements AbstractDisplay2 {
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
