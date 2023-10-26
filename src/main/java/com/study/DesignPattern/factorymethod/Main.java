package com.study.DesignPattern.factorymethod;

import com.study.DesignPattern.factorymethod.framework.Factory;
import com.study.DesignPattern.factorymethod.framework.Product;
import com.study.DesignPattern.factorymethod.idcard.IDCardFactory;

/**
 *  TemplateMethod 패턴을 인스턴스 생성 장면에 적용한 것
 */
public class Main {
    public static void main(String[] args){
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("kim");
        Product card2 = factory.create("park");
        Product card3 = factory.create("lee");

        card1.use();
        card2.use();
        card3.use();
    }

}
