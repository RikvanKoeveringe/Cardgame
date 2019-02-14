package cardgame;
//

import java.util.ArrayList;
import java.util.Collections;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
///**
// *

//* @author Rikkol
// */
public class Deck {

	private ArrayList<Card> cards = new ArrayList<>();
	String name = null;
	int value;
	String suit = null;

	public Deck() {
		for (int i = 1; i <= 4; i++) {
			for (int i2 = 2; i2 <= 10; i2++) {
				value = i2;
				switch (i) {
				case 1:
					suit = "hearts";
					break;
				case 2:
					suit = "spades";
					break;
				case 3:
					suit = "clubs";
					break;
				case 4:
					suit = "diamonds";
					break;

				}
				Card c = new Card(value, suit, suit + value);
				cards.add(c);
			}
			Card c = new Card(11, " ", "jack of" + " " + suit);
			cards.add(c);
			Card c1 = new Card(12, " ", "queen of" + " " + suit);
			cards.add(c1);
			Card c2 = new Card(13, " ", "king of" + " " + suit);
			cards.add(c2);
			Card c3 = new Card(14, " ", "ace of" + " " + suit);
			cards.add(c3);
		}

		Collections.shuffle(cards);

	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public Card getNextCard() {
		return cards.remove(0);
	}
}
