package com.cmp.appian.deckofcards.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Card extends AbstractCard {

	public Card (int suit, int ranck) {

		this.setSuitsValue(suits[suit]);
		this.setRanksValue(ranks[ranck]);

	}
	
	public Card (String suit, String ranck) {
		this.setSuitsValue(suit);
		this.setRanksValue(ranck);
	}
}