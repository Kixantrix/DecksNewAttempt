// Defines a card that could be used in a game of cards and makes up the contents of a pile
package com.decks.decksnewattempt;
import java.awt.*;
import java.net.URL;

public class Card implements Comparable<Card> {
	private int value;   	   // Value from 0 - 14 of the card, ace is either 0 or 14
	private String suit; 	   // Suit of the card in normal suits
	private int centerX; 	   // Center x coordinate
	private int centerY; 	   // Center y coordinate
	private String name; 	   // Full string name of the card
	private Image image; 	   // image used to draw the card
	private boolean isSelected; // True if it is, else false
	
	// builds card, assigning value and suit
	// takes a value 1-52 to correspond to a card in a deck, and converts that to a 
	// number 0-14 corresponding to the value of that card. The suit is similarly assigned.
	// aceshigh determines 
	public Card(int value, boolean acesHigh, int x, int y) {
		// assigns coordinates
		this.centerX = x;
		this.centerY = y;
		
		isSelected = false;
		
		// assigns value
		if(value % 13 == 1) { // ace case
			if(acesHigh) {    // assigns ace value to 14 if high, 1 if low
				this.value = 14;
			} else {
				this.value = 1;
			}
		} else {              // otherwise assigns value according to 1 - 13 range
			this.value = value / (value / 13);
		}
		
		// assigns suit
		switch(value / 13) {  // smallest values clubs, then diamonds, etc
			case 0: suit = "club";
			case 1: suit = "diamond";
			case 2: suit = "heart";
			case 3: suit = "spade";
			break;
			default: suit = "joker"; break; // default suit is joker
		}
		
		// Assigns the name of the card
		if(value >= 2 && value <= 10) { // simple case
			name = "" + value + " " + suit;
		} else { 						// complex case
			String temp;
			switch(value) {             
				case 1:  temp = "Ace";
				case 11: temp = "Jack";
				case 12: temp = "Queen";
				case 13: temp = "King";
				case 14: temp = "Ace";
				break;
				default: temp = "joker"; break;
			}
			name = temp + " of " + suit;
		}
	}
	
	public String toString() {
		return name;
	}
	
	// returns suit of card
	public String getSuit() {
		return suit;
	}
	
	// return value of card
	public int getValue() {
		return value;
	}
	
	// Triggers card to be selected
	public void select() {
		isSelected = true;
	}
	
	public boolean isSelected() {
		return isSelected;
	}
	
	// compares two cards based on first their suit alphabetically, and then breaks ties with 
	//	card value.
	public int compareTo(Card other) {
		if(suit.equals(other.suit)) {
			return value - other.value;
		} else {
			return suit.compareTo(other.suit);
		}
	}
	
	// Do not know how to get images in constructor, so this message allows images to be generated
	// in Decks and passed in to the cards.
	public void setImage(Image other) {
		image = other;
	}
	
	// Returns the image of the card
	public Image getImage() {
		return image;
	}
	
}
