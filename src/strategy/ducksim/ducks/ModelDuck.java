package strategy.ducksim.ducks;

import strategy.ducksim.behaviors.fly.FlyNoWay;
import strategy.ducksim.behaviors.quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
