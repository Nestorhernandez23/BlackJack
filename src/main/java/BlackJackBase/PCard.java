package BlackJackBase;

import java.awt.Color;


public abstract class PCard {

	/** Sets the card to the face down state. */
	public abstract void hideCard();

	/** Sets the card to the face up state. */
	public abstract void showCard();

	/**
	 * Finds if the card if face-down or face-up 
	 * 
	 * @return <b>true</b> if the card if face down.
	 */
	public abstract boolean isHidden();

	
	public abstract String getText(); // Returns a value such as "K\u2605"

	/** Returns the color of the font used for the card text. */
	public Color getFontColor() {
		return Color.LIGHT_GRAY;
	}

	/** Returns the color of the cards face. */
	public Color getFaceColor() {
		return Color.WHITE;
	}

	/** Returns the color of the cards background. */
	public Color getBackColor() {
		return Color.WHITE;
	}

	/** Returns the color of an 8 pixel border around the edge of the card. */
	public Color getBorderColor() {
		return Color.LIGHT_GRAY;
	}

	/** Returns the alternative color used on the cards background. */
	public Color getStripeColor() {
		return Color.LIGHT_GRAY;
	}
}