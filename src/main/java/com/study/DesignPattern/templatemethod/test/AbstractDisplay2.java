package com.study.DesignPattern.templatemethod.test;

/**
 * 연습문제 3-4
 * 예제를 인터페이스로 구현해보세요
 */

public interface AbstractDisplay2 {
    public void open();

    public void print();

    public void close();

    //Java 8이후로 인터페이스의 메소드를 default 키워드로 정의해서
    //디폴트 구현을 정의할 수 있다
    public default void display() {
        open();
        for (int i = 0; i < 5; i++)
            print();
        close();
    }
}
