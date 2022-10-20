package org.rossonet.command.parser.option.token;

import org.rossonet.command.parser.option.Option;

/**
 *
 * Looking in the command line string to find single parameter without value.
 * For example --version , play or -h
 *
 * @see org.rossonet.command.parser.option.token.TokenAnalyzer
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class ParameterUnaryToken extends TokenAnalyzer {

	public final static class ParameterUnaryTokenBuilder extends TokenBuilder<ParameterUnaryToken> {

		private String parameter = null;

		@Override
		public ParameterUnaryToken build() {
			return new ParameterUnaryToken(searchOrder, searchInTotalCommadLine, tokenHelpLine, parameter);
		}

		public ParameterUnaryTokenBuilder setParameter(final String flag) {
			this.parameter = flag;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public ParameterUnaryTokenBuilder setSearchInTotalCommadLine(final boolean searchInTotalCommadLine) {
			this.searchInTotalCommadLine = searchInTotalCommadLine;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public ParameterUnaryTokenBuilder setSearchOrder(final int searchOrder) {
			this.searchOrder = searchOrder;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public ParameterUnaryTokenBuilder setTokenHelpLine(final String tokenHelpLine) {
			this.tokenHelpLine = tokenHelpLine;
			return this;
		}

	}

	private final String parameter;

	// mantenere privato
	private ParameterUnaryToken(final int searchOrder, final boolean searchInTotalCommadLine,
			final String tokenHelpLine, final String parameter) {
		super(searchOrder, searchInTotalCommadLine, tokenHelpLine);
		this.parameter = parameter;
	}

	@Override
	public TokenMatch lookingInCommandLine(final Option option, final String[] commandLine) {
		// TODO Auto-generated method stub
		return null;
	}

}
