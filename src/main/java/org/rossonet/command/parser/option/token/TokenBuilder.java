package org.rossonet.command.parser.option.token;

/**
 * Abstract builder for the link
 * org.rossonet.command.parser.option.token.TokenAnalyzer
 *
 * @see org.rossonet.command.parser.option.token.TokenAnalyzer
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 * @param <TOKEN extends TokenAnalyzer>
 */
public abstract class TokenBuilder<TOKEN extends TokenAnalyzer> {

	protected boolean searchInTotalCommadLine = false;

	protected int searchOrder = 100;

	protected String tokenHelpLine = "online help";

	public abstract TOKEN build();

	public abstract <BUILDER extends TokenBuilder<TOKEN>> BUILDER setSearchInTotalCommadLine(
			final boolean searchInTotalCommadLine);

	public abstract <BUILDER extends TokenBuilder<TOKEN>> BUILDER setSearchOrder(final int searchOrder);

	public abstract <BUILDER extends TokenBuilder<TOKEN>> BUILDER setTokenHelpLine(final String tokenHelpLine);

}
