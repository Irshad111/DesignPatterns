package strategy.ducksim.simulator;

import strategy.ducksim.ducks.Duck;
import strategy.ducksim.ducks.MallardDuck;
import strategy.ducksim.ducks.ModelDuck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.performFly();

	}
}
