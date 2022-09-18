package org.example.strategy;

public class Duck {
    private IFly iFly;
    private IQuack iQuack;

    public Duck() {
    }

    void Fly(){
        this.iFly.fly();
    }
    void quack(){
        this.iQuack.quack();
    }

    public Duck(IFly iFly, IQuack iQuack) {
        this.iFly = iFly;
        this.iQuack = iQuack;
    }


}
