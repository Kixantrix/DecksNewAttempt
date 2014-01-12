import java.util.*;

public class test {
	public static void main(String[args]) {
		Set<String> players = new TreeSet<String>();
		players.add("Steve");
		players.add("Jim");
		players.add("Bob");
		Deck deck = new Deck(false, 0, 0, players);
		System.out.println(deck);
		Map hands = new TreeMap<String, Pile>();
		for(String player: players) {
			Set temp = new TreeSet<String>();
			temp.add(player);
			hands.add(player, new Pile(false, 0, 0, temp));
		}
		System.out.println(deck);
		System.out.println(players);
		Pile discardPile = new Pile(true, 0, 0, players);
		PlaySpace playSpace = new PlaySpace(players);
		deck.deal(7, hands);
	}

}
