package org.rossonet.command.parser.action;

import org.rossonet.command.parser.option.Option;
import org.rossonet.command.parser.option.token.TokenMatch;

/**
 * Action fired by the CommandParser's execution when a @link
 * org.rossonet.command.parser.option.Option is found.
 *
 * The implementation must be thread save
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public interface Action {

	/**
	 *
	 * @param values the values found in the command line
	 * @param option the @link org.rossonet.command.parser.option.Option related
	 * @param tokens the matches the text. A @link
	 *               org.rossonet.command.parser.option.Option can have many @link
	 *               org.rossonet.command.parser.option.token.TokenAnalyzer
	 * @param args   the original text in where the matches are found
	 */
	public void fire(String[] values, Option option, TokenMatch[] tokens, String[] args);

}
