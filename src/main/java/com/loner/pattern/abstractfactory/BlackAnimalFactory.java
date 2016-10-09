package com.loner.pattern.abstractfactory;

//ConcreteFactory

public class BlackAnimalFactory implements IAnimalFactory {

    public ICat createCat() {
        return new BlackCat();
    }

    public IDog createDog() {
        return new BlackDog();
    }

}
