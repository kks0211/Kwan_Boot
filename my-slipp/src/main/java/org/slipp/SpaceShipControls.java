package org.slipp;

class SpaceShip {
	
	void up(int velocity) {
	}

	void down(int velocity) {
	}

	void left(int velocity) {
	}

	void right(int velocity) {
	}

	void forward(int velocity) {
		System.out.println("forward");
	}

	void back(int velocity) {
	}

	void turboBoost() {
	}
}

public class SpaceShipControls extends SpaceShip{
	
	private String name;
	
	public SpaceShipControls(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		SpaceShipControls protector = new SpaceShipControls("NSEA Protector");
		protector.forward(100);
	}
	
}
