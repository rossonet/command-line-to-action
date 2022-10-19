package org.rossonet.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.rossonet.command.parser.option.Option;
import org.rossonet.command.parser.option.token.ParameterEnumToken;
import org.rossonet.command.parser.option.token.ParameterEnumToken.ParameterEnumTokenBuilder;
import org.rossonet.command.parser.option.token.ParameterRegExToken;
import org.rossonet.command.parser.option.token.ParameterRegExToken.ParameterRegExTokenBuilder;
import org.rossonet.command.parser.option.token.ParameterUnaryToken;
import org.rossonet.command.parser.option.token.ParameterUnaryToken.ParameterUnaryTokenBuilder;
import org.rossonet.command.parser.option.token.RegExToken;
import org.rossonet.command.parser.option.token.RegExToken.RegExTokenBuilder;
import org.rossonet.command.parser.option.token.TokenAnalyzer;
import org.rossonet.command.parser.option.token.TokenMatch;

class TokenMatchTest {

	@Test
	void testTokenMatchWithParameterEnumTokenBuilder() throws InstantiationException, IllegalAccessException {
		final String[] value = new String[] { UUID.randomUUID().toString() };
		final boolean found = UUID.randomUUID().getLeastSignificantBits() % 2 == 0;
		final int[] originalArgs = new int[] { (int) UUID.randomUUID().getLeastSignificantBits(),
				(int) UUID.randomUUID().getLeastSignificantBits(), (int) UUID.randomUUID().getLeastSignificantBits() };
		final Option option = Option.getNewOption();
		final TokenAnalyzer token = TokenAnalyzer.getNewBuilder(ParameterEnumTokenBuilder.class).build();
		final TokenMatch tokenMatch = new TokenMatch(value, found, originalArgs, option, token);
		assertEquals(value, tokenMatch.getValue());
		assertEquals(found, tokenMatch.isFound());
		assertEquals(originalArgs, tokenMatch.getFoundInArgs());
		assertEquals(option, tokenMatch.getOption());
		assertEquals(token, tokenMatch.getToken());
		assertTrue(tokenMatch.getToken() instanceof ParameterEnumToken);
	}

	@Test
	void testTokenMatchWithParameterRegExTokenBuilder() throws InstantiationException, IllegalAccessException {
		final String[] value = new String[] { UUID.randomUUID().toString() };
		final boolean found = UUID.randomUUID().getLeastSignificantBits() % 2 == 0;
		final int[] originalArgs = new int[] { (int) UUID.randomUUID().getLeastSignificantBits(),
				(int) UUID.randomUUID().getLeastSignificantBits(), (int) UUID.randomUUID().getLeastSignificantBits() };
		final Option option = Option.getNewOption();
		final TokenAnalyzer token = TokenAnalyzer.getNewBuilder(ParameterRegExTokenBuilder.class).build();
		final TokenMatch tokenMatch = new TokenMatch(value, found, originalArgs, option, token);
		assertEquals(value, tokenMatch.getValue());
		assertEquals(found, tokenMatch.isFound());
		assertEquals(originalArgs, tokenMatch.getFoundInArgs());
		assertEquals(option, tokenMatch.getOption());
		assertEquals(token, tokenMatch.getToken());
		assertTrue(tokenMatch.getToken() instanceof ParameterRegExToken);
	}

	@Test
	void testTokenMatchWithRegExToken() throws InstantiationException, IllegalAccessException {
		final String[] value = new String[] { UUID.randomUUID().toString() };
		final boolean found = UUID.randomUUID().getLeastSignificantBits() % 2 == 0;
		final int[] originalArgs = new int[] { (int) UUID.randomUUID().getLeastSignificantBits(),
				(int) UUID.randomUUID().getLeastSignificantBits(), (int) UUID.randomUUID().getLeastSignificantBits() };
		final Option option = Option.getNewOption();
		final TokenAnalyzer token = TokenAnalyzer.getNewBuilder(RegExTokenBuilder.class).build();
		final TokenMatch tokenMatch = new TokenMatch(value, found, originalArgs, option, token);
		assertEquals(value, tokenMatch.getValue());
		assertEquals(found, tokenMatch.isFound());
		assertEquals(originalArgs, tokenMatch.getFoundInArgs());
		assertEquals(option, tokenMatch.getOption());
		assertEquals(token, tokenMatch.getToken());
		assertTrue(tokenMatch.getToken() instanceof RegExToken);
	}

	@Test
	void testTokenMatchWithUnaryTokenBuilder() throws InstantiationException, IllegalAccessException {
		final String[] value = new String[] { UUID.randomUUID().toString() };
		final boolean found = UUID.randomUUID().getLeastSignificantBits() % 2 == 0;
		final int[] originalArgs = new int[] { (int) UUID.randomUUID().getLeastSignificantBits(),
				(int) UUID.randomUUID().getLeastSignificantBits(), (int) UUID.randomUUID().getLeastSignificantBits() };
		final Option option = Option.getNewOption();
		final TokenAnalyzer token = TokenAnalyzer.getNewBuilder(ParameterUnaryTokenBuilder.class).build();
		final TokenMatch tokenMatch = new TokenMatch(value, found, originalArgs, option, token);
		assertEquals(value, tokenMatch.getValue());
		assertEquals(found, tokenMatch.isFound());
		assertEquals(originalArgs, tokenMatch.getFoundInArgs());
		assertEquals(option, tokenMatch.getOption());
		assertEquals(token, tokenMatch.getToken());
		assertTrue(tokenMatch.getToken() instanceof ParameterUnaryToken);
	}

}
