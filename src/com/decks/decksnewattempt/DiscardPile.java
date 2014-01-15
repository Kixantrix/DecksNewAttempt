package com.decks.decksnewattempt;
import java.util.Set;

// Describes the discard pile of a game of cards. If there are any relevant methods to this funtion
// add them here
public class DiscardPile extends Pile{
	public DiscardPile(boolean topVisible, int x, int y, Set<String> allowedViewers) {
		super(topVisible, x, y, allowedViewers);
	}
	

}
