package com.study.DesignPattern.templatemethod;

public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    //메소드 오버라이드를 금지하기 위해 final을 사용
    public final void display() {
        open();
        for (int i = 0; i < 5; i++)
            print();
        close();
    }
}
