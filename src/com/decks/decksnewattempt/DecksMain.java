package com.decks.decksnewattempt;
public class DecksMain {
	public static void main(String args) {
		Deck d1 = new Deck();
		//Hand h1 = new Hand();
		//Hand h2 - new Hand();
		d1.showPile();
		d1.shuffle(7);
		d1.showPile();
		//d1.deal();
	}
}
