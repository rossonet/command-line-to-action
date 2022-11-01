package org.rossonet.command.parser.option.token;

import java.util.HashSet;
import java.util.Set;

import org.rossonet.command.parser.option.Option;

/**
 *
 * Looking in the command line string to find a match with a flag and the
 * related value. Also check if the value is in collection of strings
 * (enumerator).
 *
 * @see org.rossonet.command.parser.option.token.TokenAnalyzer
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class ParameterEnumToken extends TokenAnalyzer {

	public final static class ParameterEnumTokenBuilder extends TokenBuilder<ParameterEnumToken> {

		private String parameter;
		private final Set<String> parameterEnumerator = new HashSet<>();

		public ParameterEnumTokenBuilder addParameterValue(final String value) {
			parameterEnumerator.add(value);
			return this;
		}

		@Override
		public ParameterEnumToken build() {
			return new ParameterEnumToken(searchOrder, searchInTotalCommadLine, tokenHelpLine, parameter,
					parameterEnumerator);
		}

		public ParameterEnumTokenBuilder setParameter(final String flag) {
			this.parameter = flag;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public ParameterEnumTokenBuilder setSearchInTotalCommadLine(final boolean searchInTotalCommadLine) {
			this.searchInTotalCommadLine = searchInTotalCommadLine;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public ParameterEnumTokenBuilder setSearchOrder(final int searchOrder) {
			this.searchOrder = searchOrder;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public ParameterEnumTokenBuilder setTokenHelpLine(final String tokenHelpLine) {
			this.tokenHelpLine = tokenHelpLine;
			return this;
		}

	}

	private final String parameter;
	private final Set<String> parameterEnumerator;

	// mantenere privato
	private ParameterEnumToken(final int searchOrder, final boolean searchInTotalCommadLine, final String tokenHelpLine,
			final String parameter, final Set<String> parameterEnumerator) {
		super(searchOrder, searchInTotalCommadLine, tokenHelpLine);
		this.parameter = parameter;
		this.parameterEnumerator = parameterEnumerator;
	}

	@Override
	public TokenMatch lookingInCommandLine(final Option option, final String[] commandLine) {
		// TODO Auto-generated method stub
		return null;
	}

}
