package com.cmp.appian.deckofcards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmp.appian.deckofcards.entity.Card;
import com.cmp.appian.deckofcards.services.DeckOfCardsServices;

@RestController
public class DeckOfCardsController {

	@Autowired
    private DeckOfCardsServices dcServices;
    
    @GetMapping(value = {"/shuffle"})
    public ResponseEntity<String> shuffle() {
    	dcServices.setShuffle();
        return ResponseEntity.ok("");
    }
  
    
    @GetMapping(value = {"/dealonecard"}, produces = "application/json")
    public ResponseEntity<Card> dealOneCard() {
        return ResponseEntity.ok(dcServices.getDealOneCard());
    }
	
}
