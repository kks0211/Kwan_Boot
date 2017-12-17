package org.slipp;

class Game {
	Game(int i) {
		System.out.println("Game Constuctor");
	}
}

class BoardGeme extends Game {
	BoardGeme(int i) {
		super(i);
		System.out.println("Board Constructor");
	}
}

public class Cartoon extends BoardGeme {
	Cartoon() {
		super(11);
		System.out.println("Cartoon Constructor");
	}

	public static void main(String[] args) {
		Cartoon car = new Cartoon();
	}

}
