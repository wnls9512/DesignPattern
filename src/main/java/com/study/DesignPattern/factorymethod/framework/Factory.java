package com.study.DesignPattern.factorymethod.framework;

//Template Method가 적용
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract void registerProduct(Product p);

    protected abstract Product createProduct(String owner);
}
