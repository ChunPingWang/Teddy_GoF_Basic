/*
 * Copyright 2016 TeddySoft Technology. All rights reserved.
 * 
 */
package tw.teddysoft.gof.Observer;

public interface Subject {
	void addObserver(Observer observer); 
	void deleteObserver(Observer observer);
	void notifyObserver();
}
