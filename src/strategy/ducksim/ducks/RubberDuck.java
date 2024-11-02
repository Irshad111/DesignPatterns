package strategy.ducksim.ducks;

import strategy.ducksim.behaviors.fly.FlyBehavior;
import strategy.ducksim.behaviors.fly.FlyNoWay;
import strategy.ducksim.behaviors.quack.QuackBehavior;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		//quackBehavior = new Squeak();
		quackBehavior = () -> System.out.println("Squeak");
	}
	
	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior; 
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
