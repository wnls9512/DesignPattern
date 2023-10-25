package com.study.DesignPattern.adapter.test;

import java.io.IOException;

/**
 * 연습 문제 2-2
 * Adapter 패턴을 사용해 속성 집합을 파일에 저장하는 FileProperties 클래스를 만들어보세요
 */
public class Main_2 {
    public static void main(String args[]){
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("newfile.txt");
            System.out.println("newfile.txt is created.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
