package org.rossonet.command.parser.option.token;

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
public class ParameterRegExToken implements TokenAnalyzer {

	public final static class ParameterRegExTokenBuilder implements TokenBuilder<ParameterRegExToken> {

		@Override
		public ParameterRegExToken build() {
			// TODO Auto-generated method stub
			return new ParameterRegExToken();
		}

	}

	// mantenere privato
	private ParameterRegExToken() {

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
