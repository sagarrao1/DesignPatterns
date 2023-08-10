package com.pluralsight.bavavioral.observer;


public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
