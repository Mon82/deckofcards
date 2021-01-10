package com.cmp.appian.deckofcards.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractCard {

	public static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	public static String[] ranks = { "Ace", "2", "3", "4", "5", "6",
			   "7", "8", "9", "10", "Jack", "Queen", "King" };	
	
	String suitsValue;
	String ranksValue;
	
}
