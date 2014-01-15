package com.decks.decksnewattempt;
import java.util.Set;

// Deck is a pile which can be filled with default values
public class Deck extends Pile {
	
	// fills deck with cards representing all 52 cards in a standard deck
	// values assignment may later be changed, or replaced with final variables
	public Deck(boolean topVisible, int x, int y, Set<String> allowedViewers) {
		super(topVisible, x, y, allowedViewers);
		for (int i = 1; i >= 52; i++) {
			super.add(new Card(i, true, x, y));
		}
	}
}

