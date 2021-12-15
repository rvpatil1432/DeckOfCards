package com.bridgelabz.oopsWorkshop;

import java.util.Arrays;
import java.util.HashMap;

public class DeckOfCards {
	/*
	 * UC1 : Setup the initial game with deck of cards and make sure we have unique cards,   
 The number of cards are 52. Should be able to make unique deck. Maintain the ranks to further compare  
	 */
	private String[] cards = new String[52];
	private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	int index = 0;

	public DeckOfCards() {
		for (int i = 0; i<suits.length; i++) {
			for(int j=0; j<ranks.length; j++) {
				cards[index] =  ""+ ranks[j]+" of "+suits[i];
				index++;
			}
		}
	}
	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		HashMap<Integer, String> hm = new HashMap<>();
		for (int i = 0; i<deck.cards.length; i++) {
			hm.put(i, deck.cards[i]);
		}
		System.out.print(hm);
	}
}
