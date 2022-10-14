package org.rossonet.command.parser.option.token;

public interface TokenBuilder<TOKEN extends Token> {

	public TOKEN build();

}
