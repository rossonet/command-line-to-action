package org.rossonet.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;
import org.rossonet.command.parser.option.token.RegExToken;
import org.rossonet.command.parser.option.token.RegExToken.RegExTokenBuilder;
import org.rossonet.command.parser.option.token.TokenAnalyzer;
import org.rossonet.command.parser.option.token.TokenMatch;

public class TokenAnalyzerTest {

	@Test
	public void exampleRegEx() {
		final Pattern p = Pattern.compile("command");
		final Matcher m = p.matcher("this is a command to do in command");
		System.out.println(m.matches());
		m.find();
		System.out.println("m.group() " + m.group());
		assertEquals("command", m.group());
		System.out.println("m.start() " + m.start());
		assertEquals(10, m.start());
		System.out.println("m.end() " + m.end());
		assertEquals(17, m.end());
		m.find();
		System.out.println("m.group() " + m.group());
		assertEquals("command", m.group());
		System.out.println("m.start() " + m.start());
		assertEquals(27, m.start());
		System.out.println("m.end() " + m.end());
		assertEquals(34, m.end());

	}

	@Test
	public void regExTokenTest() throws InstantiationException, IllegalAccessException {
		final RegExToken analyzer = TokenAnalyzer.getNewBuilder(RegExTokenBuilder.class)
				.setSearchInTotalCommadLine(false).setSearchOrder(100).setTokenHelpLine("help online")
				.setRegExValueCheck("command").build();
		final String[] commandLine = new String[] { "this", "is", "a", "command", "to", "do", "in", "command" };
		final TokenMatch matches = analyzer.lookingInCommandLine(null, commandLine);
		System.out.println(matches);
		assertEquals("command", matches.getValues()[0]);
		assertEquals("command", matches.getValues()[1]);
		assertEquals(2, matches.getValues().length);
		assertEquals(3, matches.getFoundInArgs()[0]);
		assertEquals(7, matches.getFoundInArgs()[1]);
		assertEquals(2, matches.getFoundInArgs().length);
		assertTrue(matches.isFound());
	}

	@Test
	public void regExTokenWithPatternTest() throws InstantiationException, IllegalAccessException {
		final RegExToken analyzer = TokenAnalyzer.getNewBuilder(RegExTokenBuilder.class)
				.setSearchInTotalCommadLine(false).setSearchOrder(100).setRegExValueCheck("c[oman]{5}d")
				.setTokenHelpLine("help online").build();
		final String[] commandLine = new String[] { "this", "is", "a", "command", "to", "do", "in", "command" };
		final TokenMatch matches = analyzer.lookingInCommandLine(null, commandLine);
		System.out.println(matches);
		assertEquals("command", matches.getValues()[0]);
		assertEquals("command", matches.getValues()[1]);
		assertEquals(2, matches.getValues().length);
		assertEquals(3, matches.getFoundInArgs()[0]);
		assertEquals(7, matches.getFoundInArgs()[1]);
		assertEquals(2, matches.getFoundInArgs().length);
		assertTrue(matches.isFound());
	}

}
