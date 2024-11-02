package strategy.ducksim.ducks;

import strategy.ducksim.behaviors.fly.FlyNoWay;
import strategy.ducksim.behaviors.quack.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
