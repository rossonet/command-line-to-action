package org.rossonet.command.parser.option.token;

public interface Token {

	public abstract <BUILDER extends TokenBuilder<? extends Token>> BUILDER getNewBuilder();

	public TokenMatch lookingInCommandLine(String[] commandLine);

}
