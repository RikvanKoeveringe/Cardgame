/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.Scanner;

/**
 *
 * @author Rikkol
 */
public class CardGame {

	private Card currentCard;
	private Card nextCard;
	private int points;

	public static void main(String[] args) {
		int points = 0;
		Deck d = new Deck();
		boolean isPlaying = true;

		while (isPlaying) {
			Card currentCard = d.getNextCard();
			Card nextCard = d.getNextCard();

			System.out.println(currentCard);
			Scanner sc = new Scanner(System.in);
			System.out.println("Guess higher or lower");
			System.out.print("Input here : ");

			boolean yeet = check(currentCard, nextCard, points);
			System.out.println(nextCard);
			if (yeet == true) {
				isPlaying = true;
			} else {
				System.out.println("N00B!");
				isPlaying = false;
			}

		
		}

	}

	public static boolean check(Card currentCard, Card nextCard, int points) {
		Scanner yeet = new Scanner(System.in);
		String hl = yeet.nextLine();

		
		
		if (hl.equals("higher")) {
			if (nextCard.getValue() > currentCard.getValue()) {
				points++;
				return true;
			} else if (nextCard.getValue() < currentCard.getValue())
				return false;

			if (hl.equals("lower")) {
				if (nextCard.getValue() < currentCard.getValue()) {
					points++;
					return true;
				}

			} else if (nextCard.getValue() > currentCard.getValue()) {
				return false;
			}
			if (hl.equals("yeet")) {
				System.out.println("prima jima");
				return check(currentCard, nextCard, points);
			}

		} else
			System.out.println("go play fortnite kid, u noob.");
		return check(currentCard, nextCard, points);
	}

}
