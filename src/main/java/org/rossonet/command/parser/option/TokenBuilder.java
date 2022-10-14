package org.rossonet.command.parser.option;

public interface TokenBuilder<TOKEN extends Token> {

	public TOKEN build();

}
