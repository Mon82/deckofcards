package com.cmp.appian.deckofcards.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cmp.appian.deckofcards.entity.Card;
import com.cmp.appian.deckofcards.entity.DeckOfCards;

@SpringBootTest
public class DeckOfCardsServicesTest {

	@Autowired
    private DeckOfCardsServices dcServices;

	
	@Test
	public void testGetDealOneCard() {
		
		dcServices.initDeckOfCards();
		
		DeckOfCards tempDeck = new DeckOfCards();
		Card[] cTemp = tempDeck.getDeckOfCards();
		
		for (int i = 0; i < DeckOfCards.NCARDS; i++) {
			Card c = dcServices.getDealOneCard();
			assertEquals (c.getRanksValue(), cTemp[i].getRanksValue());
			assertEquals (c.getSuitsValue(), cTemp[i].getSuitsValue());
		}
	}
	
	
	@Test
	public void testSetShuffle() {
		DeckOfCards Deck = dcServices.getDeckOfCards();
		
		DeckOfCards tempDeck = new DeckOfCards();
		Card[] initCards = tempDeck.getDeckOfCards();

		
		dcServices.setShuffle();
				
		Card[] endCards = Deck.getDeckOfCards();
		
		int compare = 0;
		
		for (int i = 0; i < DeckOfCards.NCARDS; i++) {
			if (initCards[i].getRanksValue().equals(endCards[i].getRanksValue()) && 
					initCards[i].getSuitsValue().equals(endCards[i].getSuitsValue()))
				compare++;
		}		
		assertNotEquals(compare, DeckOfCards.NCARDS);
	}
	
}
