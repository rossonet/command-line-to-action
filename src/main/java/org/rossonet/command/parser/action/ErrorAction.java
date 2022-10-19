package org.rossonet.command.parser.action;

import org.rossonet.command.parser.exception.CommandParserException;
import org.rossonet.command.parser.option.Option;
import org.rossonet.command.parser.option.token.TokenMatch;

/**
 * Action fired by the CommandParser when end the execution of a @see
 * org.rossonet.command.parser.option.Option with errors
 * 
 * The implementation must be thread save
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public interface ErrorAction {
	/**
	 *
	 * @param option the @link org.rossonet.command.parser.option.Option related
	 * @param tokens the matches the text. A @link
	 *               org.rossonet.command.parser.option.Option can have many @see
	 *               org.rossonet.command.parser.option.token.TokenAnalyzer
	 * @param args   the original text in where the matches are found
	 * @param errors collection of errors found during the @link ExecutionException
	 */
	public void notifyError(Option option, TokenMatch[] tokens, String[] args, CommandParserException[] errors);

}
