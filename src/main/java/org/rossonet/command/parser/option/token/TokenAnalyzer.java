package org.rossonet.command.parser.option.token;

import org.rossonet.command.parser.option.Option;

/**
 * Analyzer to parse the command line input and find the tokens. The
 * implementation must have the related builder class @link
 * org.rossonet.command.parser.option.token.TokenBuilder<TOKEN>
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public abstract class TokenAnalyzer {

	public static <TOKEN extends TokenAnalyzer, BUILDER extends TokenBuilder<TOKEN>> BUILDER getNewBuilder(
			final Class<BUILDER> builderClass) throws InstantiationException, IllegalAccessException {
		return builderClass.newInstance();
	}

	protected static String getCommandString(final String[] commandLine) {
		final StringBuilder sb = new StringBuilder();
		boolean firstWord = true;
		for (final String s : commandLine) {
			if (firstWord) {
				firstWord = false;
			} else {
				sb.append(" ");
			}
			sb.append(s);
		}
		return sb.toString();
	}

	protected boolean searchInTotalCommadLine;

	protected int searchOrder;

	protected String tokenHelpLine;

	public TokenAnalyzer(final int searchOrder, final boolean searchInTotalCommadLine, final String tokenHelpLine) {
		this.searchOrder = searchOrder;
		this.searchInTotalCommadLine = searchInTotalCommadLine;
		this.tokenHelpLine = tokenHelpLine;
	}

	public int getSearchOrder() {
		return this.searchOrder;
	}

	public String getTokenHelpLine() {
		return this.tokenHelpLine;
	}

	public abstract TokenMatch lookingInCommandLine(final Option option, final String[] commandLine);

	public boolean searchInTotalCommadLine() {
		return this.searchInTotalCommadLine;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append(getClass());
		builder.append("[searchInTotalCommadLine=");
		builder.append(searchInTotalCommadLine);
		builder.append(", searchOrder=");
		builder.append(searchOrder);
		builder.append(", tokenHelpLine=");
		builder.append(tokenHelpLine);
		builder.append("]");
		return builder.toString();
	}

}
