package com.cmp.appian.deckofcards.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeckOfCards
{

	public static int NCARDS=52;
	public static int NUMSHUFFLE=34;
	public static int HAND = 0;
	
	private Card[] deckOfCards;
   
	public DeckOfCards( )
	{
		deckOfCards = initCards();
	}
   
	public Card[] initCards() {

		Card[] initCards = new Card[NCARDS];

		int i = 0;
 
		for ( int suit = 0; suit < Card.suits.length; suit++ )           
			for ( int rank = 0; rank < Card.ranks.length; rank++ )
				initCards[i++] = new Card(suit, rank);
		
		return initCards;
		
	}
   
	public String toString()
	{
		String s = "";
		int k;

		k = 0;
		for ( int i = 0; i < Card.suits.length; i++ ){
			for ( int j = 1; j <= Card.ranks.length; j++ ) {
				Card c = deckOfCards[k++];
				s += ( c.getSuitsValue() + " - " + c.getRanksValue() + ", " );
			}
         s += "\n";
		}
		return (s);
   }
}
