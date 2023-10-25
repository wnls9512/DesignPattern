package com.study.DesignPattern.adapter;

//Adapter Pattern
//기존클래스를 수정하지 않고 목적한 인터페이스에 맞추기 위해 작성한다.
public class Main {
    public static void main(String[] args){
        // Main 클래스는 showWithParen, showWithAster 메소드가 어떻게 구현되어있는지 전혀 알지 못한다 => 숨김
        // Main 클래스를 변경하지 않고도 PrintBanner의 변경이 언제든지 가능하다
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

//        PrintBanner p = new PrintBanner("Hello");
//        Print 인터페이스의 메소드만 사용하겠다라는 프로그래머의 의도를 명확하게 하기 위해
//        PrintBanner 클래스가 아닌 Print 인터페이스를 사용한다
    }
}
