
import java.util.*;
import java.awt.*;
import java.io.*;

import javax.smartcardio.Card;

public class Pile {
	
	private boolean topVisible; // if top card is visible
	private ArrayList<Card> pile; // data stored
	private int centerX; // x coordinate of center of pile
	private int centerY; // y coordinate of center of pile
	private Set<String> allowedViewers; // set of all people allowed to see cards
	
	public Pile(boolean topVisible, int x, int y, Set<String> allowedViewers) {
		pile = new ArrayList<Card>(); // contents of the pile
		this.topVisible = topVisible;
		centerX = x;
		centerY = y;
		this.allowedViewers = allowedViewers;
	} 
	
		// shuffles pile n times
		public void shuffle(int n) {
			for(int i = 0; i < n; i++) {
				Collections.shuffle(pile);
			}
		}
		
		// returns the top card and deletes it from the pile
		public Card remove() {
			return pile.remove(0);
		}
		
		// returns this pile and removes the contents of it. 
		public Pile removeAll() {
			Pile temp = this;
			this.pile.clear();
			return temp;
		}
		
		// removes all selected cards from pile and returns pile of removed cards
		public Pile removeSelected() {
			Pile temp = new Pile(false, null, null, null);
			for(int i = pile.size(); i >= 0; i--) {
				if(pile.get(i).isSelected()) {
					temp.add(pile.remove(index));
				}
			}
			return temp;
		}
		
		// prints contents of the Pile
		public void showPile() {
			System.out.println(pile);
		}
		
		// Returns the ArrayList containing the cards
		public ArrayList<Card> getPile() {
			return pile;
		}
		
		// Returns whether a user can see the cards
		public boolean getAccess(String user) {
			return allowedViewers.contains(user);
		}
		
		// Adds card temp to top of pile
		public void add(Card temp) {
			pile.add(temp);
		}
		
		// Adds card to position n in the pile
		public void add(Card temp, int n) {
			if(n <= pile.size()) {
				pile.add(n, temp);
			}
		}
		
		// Adds card to end of the pile
		public void addToEnd(Card temp) {
			add(temp, pile.size());
		}
		
		// Adds all cards from another pile to this one and removes them from the original
		public void addAll(Pile temp) {
			pile.addAll(temp.pile);
		}
		
		// replaces top and bottom halves of the deck
		public void cut() {
			for(int i = pile.size() / 2; i < pile.size(); i++) {
				pile.add(pile.remove(i));
			}
		}
		
		// Returns x position of center of pile
		public int getX() {
			return centerX;
		}
		
		// Returns y position of center of pile
		public int getY() {
			return centerY;
		}
		
		// Move the pile by a dX and dY
		public void update(int dX, int dY) {
			centerX += dX;
			centerY += dY;
		}
		
}
