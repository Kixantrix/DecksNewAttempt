package com.decks.decksnewattempt;
import java.util.*;

public class test {
	public static void main(String [ ] args) {
		Set<String> players = new TreeSet<String>();
		players.add("Steve");
		players.add("Jim");
		players.add("Bob");
		Deck deck = new Deck(false, 0, 0, players);
		System.out.println(deck);
		Map<String,Pile> hands = new TreeMap<String, Pile>();
		for(String player: players) {
			Set<String> temp = new TreeSet<String>();
			temp.add(player);
			hands.put(player, new Pile(false, 0, 0, temp));
		}
		System.out.println(deck);
		System.out.println(players);
		Pile discardPile = new Pile(true, 0, 0, players);
		PlaySpace playSpace = new PlaySpace(players);
		deck.deal(7, hands);
	}

}
