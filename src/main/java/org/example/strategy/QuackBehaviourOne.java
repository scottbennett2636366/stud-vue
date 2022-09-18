package org.example.strategy;

public class QuackBehaviourOne  implements IQuack{
    @Override
    public void quack() {
        System.out.println("behaviour one quack");
    }
}
