package org.rossonet.command.parser.option;

import org.rossonet.command.parser.action.TokenMatch;

public interface Token {

	public abstract <BUILDER extends TokenBuilder<? extends Token>> BUILDER getNewBuilder();

	public TokenMatch lookingInCommandLine(String[] commandLine);

}
