package com.ouz.chuckyjokes.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author oguz, created on 2018.10.03
 * 
 */

@Service
public class JokeServiceImpl implements JokeService {

	@Override
	public String getJoke() {
		return new ChuckNorrisQuotes().getRandomQuote();
	}
}
