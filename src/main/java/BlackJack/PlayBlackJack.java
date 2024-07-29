package BlackJack;
import java.awt.Color;

import BlackJackBase.PGame;

public class PlayBlackJack {
    public static void main(String[] args) {
        BJDeck deck = new BJDeck();

        BJHand KooksCards = new BJHand();
        BJHand KooksDealer = new BJHand();

        PGame game = PGame.run(deck,KooksDealer,KooksCards);

        game.setBackground(Color.BLACK);
		game.setBannerColor(Color.GRAY);
		game.setBannerTextColor(Color.WHITE);
		game.setStatusTextColor(Color.WHITE);
		game.setButtonColor(Color.ORANGE);
		game.setButtonHighlightColor(Color.ORANGE);
		game.setButtonTextColor(Color.BLACK);

		game.setFont("Times New Roman");


    }

}