package observer.simple;

import observer.simple.observer.SimpleObserver;
import observer.simple.subject.SimpleSubject;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
	
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

		simpleSubject.setValue(80);
		
		simpleSubject.removeObserver(simpleObserver);
	}
}
