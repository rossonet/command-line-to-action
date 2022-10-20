package org.rossonet.command.parser.option.token;

import org.rossonet.command.parser.option.Option;

/**
 *
 * Looking in the command line string to find a match with a flag and the
 * related value. Also check the value with a regular expression pattern
 *
 * @see org.rossonet.command.parser.option.token.TokenAnalyzer
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class ParameterRegExToken extends TokenAnalyzer {

	public final static class ParameterRegExTokenBuilder extends TokenBuilder<ParameterRegExToken> {

		private String parameter;
		private String regExParameterCheck;

		@Override
		public ParameterRegExToken build() {
			return new ParameterRegExToken(searchOrder, searchInTotalCommadLine, tokenHelpLine, parameter,
					regExParameterCheck);
		}

		public ParameterRegExTokenBuilder setParameter(final String flag) {
			this.parameter = flag;
			return this;
		}

		public ParameterRegExTokenBuilder setRegExParameterCheck(final String regExParameterCheck) {
			this.regExParameterCheck = regExParameterCheck;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public ParameterRegExTokenBuilder setSearchInTotalCommadLine(final boolean searchInTotalCommadLine) {
			this.searchInTotalCommadLine = searchInTotalCommadLine;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public ParameterRegExTokenBuilder setSearchOrder(final int searchOrder) {
			this.searchOrder = searchOrder;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public ParameterRegExTokenBuilder setTokenHelpLine(final String tokenHelpLine) {
			this.tokenHelpLine = tokenHelpLine;
			return this;
		}

	}

	private final String parameter;
	private final String regExParameterCheck;

	// mantenere privato
	private ParameterRegExToken(final int searchOrder, final boolean searchInTotalCommadLine,
			final String tokenHelpLine, final String parameter, final String regExParameterCheck) {
		super(searchOrder, searchInTotalCommadLine, tokenHelpLine);
		this.parameter = parameter;
		this.regExParameterCheck = regExParameterCheck;

	}

	@Override
	public TokenMatch lookingInCommandLine(final Option option, final String[] commandLine) {
		// TODO Auto-generated method stub
		return null;
	}

}
