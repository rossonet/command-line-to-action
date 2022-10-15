package org.rossonet.command.parser.option.token;

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
public class ParameterEnumToken implements TokenAnalyzer {

	public final static class ParameterEnumTokenBuilder implements TokenBuilder<ParameterEnumToken> {

		@Override
		public ParameterEnumToken build() {
			// TODO Auto-generated method stub
			return new ParameterEnumToken();
		}

	}

	// mantenere privato
	private ParameterEnumToken() {

	}

	@Override
	public int getSearchOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getTokenHelpLine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TokenMatch lookingInCommandLine(final String[] commandLine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean searchInTotalCommadLine() {
		// TODO Auto-generated method stub
		return false;
	}

}
