package cardgame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rikkol
 */
public class Card {

	private int value;
	private String suit;
	private String name;

	public Card(int value, String suit, String name) {
		this.name = name;
		this.suit = suit;
		this.value = value;

	}

	@Override
	public String toString() {
		return name + " " + value;
	}

	public int getValue() {
		
		return 0;
	}
}
