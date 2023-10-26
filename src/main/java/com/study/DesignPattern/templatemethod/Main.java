package com.study.DesignPattern.templatemethod;

/**
 * 상위 클래스에서 처리의 뼈대를 결정하고 하위클래스에서 구체적 내용을 결정
 */
public class Main {
    public static void main(String[] args){
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World");

        //AbstractDisplay 클래스의 display가 실제로 무슨일을 하는지는
        // 하위 클래스를 확인하지 않는 이상 알 수 없다
        d1.display();
        d2.display();
    }
}
