package org.rossonet.command.parser.action;

import org.rossonet.command.parser.exception.CommandParserException;
import org.rossonet.command.parser.option.Option;
import org.rossonet.command.parser.option.token.TokenMatch;

public interface ErrorAction {

	public void notifyError(Option option, TokenMatch[] tokens, String[] args, CommandParserException[] errors);

}
