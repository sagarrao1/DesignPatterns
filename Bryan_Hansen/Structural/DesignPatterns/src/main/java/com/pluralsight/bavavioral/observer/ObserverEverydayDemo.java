package com.pluralsight.bavavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {

	public static void main(String[] args) {
		TwitterStream stream = new TwitterStream();
		
		Client client1 = new Client("Sagar");
		Client client2 = new Client("Madhu");
		
		stream.addObserver(client1);
		stream.addObserver(client2);
		
		stream.someoneTweeted();

	}

}
//	Concrete Subject
class TwitterStream extends Observable{
	public void someoneTweeted() {
		setChanged();
		notifyObservers();
	}	
}

class Client implements Observer{
	private String name;
		
	public Client(String name) {
		this.name = name;
	}


	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Update "+ name + "'s stream , someone tweeted somthing");
	}
	
}
	
