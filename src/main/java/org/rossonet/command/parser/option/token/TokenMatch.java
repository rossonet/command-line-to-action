package org.rossonet.command.parser.option.token;

import java.util.Arrays;

import org.rossonet.command.parser.option.Option;

/**
 * Represents the match done by a @link
 * org.rossonet.command.parser.option.token.TokenAnalyzer on the command line
 * String
 *
 * @see org.rossonet.command.parser.option.token.TokenAnalyzer
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public final class TokenMatch {

	private final boolean found;
	private final int[] foundInArgs;
	private final Option option;
	private final TokenAnalyzer token;
	private final String[] values;

	public TokenMatch(final String[] values, final boolean found, final int[] foundInArgs, final Option option,
			final TokenAnalyzer token) {
		this.found = found;
		this.foundInArgs = foundInArgs;
		this.option = option;
		this.token = token;
		this.values = values;
	}

	public int[] getFoundInArgs() {
		return foundInArgs;
	}

	public Option getOption() {
		return option;
	}

	public TokenAnalyzer getToken() {
		return token;
	}

	public String[] getValues() {
		return values;
	}

	public boolean isFound() {
		return found;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("TokenMatch [");
		if (values != null) {
			builder.append("values=[");
			int c = 0;
			for (final String v : values) {
				if (c > 0) {
					builder.append(", ");
				}
				builder.append(c + ": " + v);
				c++;
			}
			builder.append("], ");
		}
		builder.append("found=");
		builder.append(found);
		builder.append(", ");
		if (foundInArgs != null) {
			builder.append("foundInArgs=");
			builder.append(Arrays.toString(foundInArgs));
			builder.append(", ");
		}
		if (option != null) {
			builder.append("option=");
			builder.append(option);
			builder.append(", ");
		}
		if (token != null) {
			builder.append("token=");
			builder.append(token);
		}
		builder.append("]");
		return builder.toString();
	}
}
