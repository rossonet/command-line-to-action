package org.rossonet.command.parser.action;

import org.rossonet.command.parser.option.Option;

public interface Action {

	public void fire(String[] values, Option option, TokenMatch[] tokens, String[] args);

}
