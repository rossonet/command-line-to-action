package org.rossonet.command.parser.option.token;

/**
 * Builder interface for the link
 * org.rossonet.command.parser.option.token.TokenAnalyzer
 *
 * @see org.rossonet.command.parser.option.token.TokenAnalyzer
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 * @param <TOKEN extends TokenAnalyzer>
 */
public interface TokenBuilder<TOKEN extends TokenAnalyzer> {

	public TOKEN build();

}
