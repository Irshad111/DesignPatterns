package strategy.ducksim.simulator;

import strategy.ducksim.behaviors.fly.FlyBehavior;
import strategy.ducksim.behaviors.quack.QuackBehavior;
import strategy.ducksim.ducks.DecoyDuck;
import strategy.ducksim.ducks.MallardDuck;
import strategy.ducksim.ducks.RubberDuck;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();
		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");
		RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
		DecoyDuck decoy = new DecoyDuck();


		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();

	}
}
