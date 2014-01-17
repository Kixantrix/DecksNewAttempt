package com.decks.decksnewattempt;
import java.awt.*;
import java.util.*;

// Cards in play on the board
public class PlaySpace {
	private Map<String, Pile> played; // Map of the cards each player has played
	
	// new empty PlaySpace
	// has piles for each player mapped to the player's name
	public PlaySpace(Set<String> players) {
		played = new TreeMap<String, Pile>();
		for(String player: players) {
			played.put(player, new Pile(true, 0, 0, players));
		}
	}
	
	// Adds a pile from a user to the PlaySpace tagged by their name 
	public void play(String player, Pile toAdd) {
		played.get(player).addAll(toAdd);
	}
	
	// Removes the pile played by a user from the PlaySpace and returns it
	public Pile remove(String player) {
		return played.get(player).removeAll();
	}
	
	// Removes all of the piles played by all users from the PlaySpace and returns it as a single
	// Pile 
	public Pile removeAll() {
		Pile temp = new Pile(false, 0, 0, null);
		for(String player: played.keySet()) {
			temp.addAll(remove(player));
		}
		return temp;
	}

}
