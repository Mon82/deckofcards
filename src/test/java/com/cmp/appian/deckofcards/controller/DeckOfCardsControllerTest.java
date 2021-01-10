package com.cmp.appian.deckofcards.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class DeckOfCardsControllerTest {

	@Autowired
    private MockMvc mvc;

    @Test
    public void testShuffle_OK() throws Exception {
    	
        mvc.perform(MockMvcRequestBuilders.get("/shuffle")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
	
    @Test
    public void testDealonecard_OK() throws Exception {
    	
        mvc.perform(MockMvcRequestBuilders.get("/dealonecard")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
	
}
