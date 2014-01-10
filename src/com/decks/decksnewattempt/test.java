import java.util.Set;
import java.util.*;

public class test {
	public static void main(String[args]) {
		Deck deck = new Deck(false, 0, 0, new TreeSet<String>());
		ArrayList<Pile> hands = new ArrayList<Pile>();
		for(int i = 0; i < 6; i++) {
			hands.add(new Pile(false, 0, 0, new TreeSet<String>()));
		}
		Pile discardPile = new Pile(true, 0, 0, new TreeSet<String>());
	}

}
