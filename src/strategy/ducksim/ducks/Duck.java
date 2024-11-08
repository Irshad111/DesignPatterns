package strategy.ducksim.ducks;

import strategy.ducksim.behaviors.fly.FlyBehavior;
import strategy.ducksim.behaviors.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public  void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
    abstract void display();

}
