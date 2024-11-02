package strategy.ducksim.ducks;

import strategy.ducksim.behaviors.fly.FlyWithWings;
import strategy.ducksim.behaviors.quack.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
