
import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.*;

public class Decks extends Applet implements Runnable, KeyListener {
	private Deck deck; 
	private ArrayList<Pile> Hands;
	private ArrayList<Pile> Board;
	private URL base;
	private Graphics g;
	private Image image, otherHand, back;
	
	public void init() {
		setSize(1270, 720);
		setBackground(Color.BLACK);
		setFocusable(true);
		addKeyListener(this);
		Frame frame = (Frame) this.getParent().getParent();
		frame.setTitle("Decks Derp");
		try {
				base = getDocumentBase();
		}	catch(Exception e) {
			//todo: handle exception
		}
		
		// Image Setups
		otherHand = getImage(base, "data/otherHand.png");
		
	}
	
	public void start() {
		
	}
	
	public void stop() {
		
	}
	
	public void destroy() {
		
	}
	
	public void run() {
		
	}
	
	public void update(Graphics G) {
		
	}
}
