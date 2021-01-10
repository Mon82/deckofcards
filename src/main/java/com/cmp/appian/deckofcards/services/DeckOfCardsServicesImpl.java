package com.cmp.appian.deckofcards.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cmp.appian.deckofcards.entity.Card;
import com.cmp.appian.deckofcards.entity.DeckOfCards;

@Service
public class DeckOfCardsServicesImpl implements DeckOfCardsServices{
	
	private static final Logger logger = LoggerFactory.getLogger(DeckOfCardsServicesImpl.class);

	@Override
	public void initDeckOfCards() {
		DeckOfCards newDeck = new DeckOfCards();
		deck.setDeckOfCards(newDeck.initCards());
	}
	
	
	@Override
	public DeckOfCards getDeckOfCards() {
		return deck;
	}
	
	@Override
	public void setShuffle() {
		
		logger.debug("Init setShuffle method");
		logger.debug("Actual Deck: " + deck.toString());
		
		Card Deck[] = deck.getDeckOfCards();
		
		
	    int i, j, k;
	    for ( k = 0; k < DeckOfCards.NUMSHUFFLE; k++ )
	    {
	        i = (int) ( DeckOfCards.NCARDS * Math.random() );      
	        j = (int) ( DeckOfCards.NCARDS * Math.random() );
	          
	        Card tmp = Deck[i];
	        Deck[i] = Deck[j];
	        Deck[j] = tmp;
	    }		
		
	    logger.debug("Shuffle Deck: " + deck.toString());
		DeckOfCards.HAND = 0;
		logger.debug("End setShuffle method");
	}
	
	@Override
	public Card getDealOneCard() {
		if (DeckOfCards.HAND < DeckOfCards.NCARDS) {
			Card c = deck.getDeckOfCards()[DeckOfCards.HAND];			
			DeckOfCards.HAND++;
			return c;
		} else {
			Card errorCard = new Card("","Empty Deck, you need shuffle!!!");
			return errorCard;
		}
	}

}
