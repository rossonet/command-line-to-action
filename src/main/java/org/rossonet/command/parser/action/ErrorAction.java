package org.rossonet.command.parser.action;

import org.rossonet.command.parser.option.Option;

public interface ErrorAction {

	public void notifyError(Option option, TokenMatch[] tokens, String[] args, CommandParserException[] errors);

}
