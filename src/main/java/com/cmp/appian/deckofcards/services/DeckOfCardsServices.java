package com.cmp.appian.deckofcards.services;

import com.cmp.appian.deckofcards.entity.Card;
import com.cmp.appian.deckofcards.entity.DeckOfCards;
public interface DeckOfCardsServices {
	
	public DeckOfCards deck = new DeckOfCards();
	
	void initDeckOfCards();
	
	DeckOfCards getDeckOfCards();
	
	void setShuffle();
	
	Card getDealOneCard();

}
