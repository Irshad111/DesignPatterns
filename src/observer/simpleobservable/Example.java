package observer.simpleobservable;

import observer.simpleobservable.observer.SimpleObserver;
import observer.simpleobservable.subject.SimpleSubject;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
	
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);

		simpleSubject.setValue(80);
	}
}
