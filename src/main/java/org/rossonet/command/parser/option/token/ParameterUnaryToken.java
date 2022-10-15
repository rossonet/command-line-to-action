package org.rossonet.command.parser.option.token;

/**
 *
 * Looking in the command line string to find single parameter without value.
 * For example --version , play or -h
 *
 * @see org.rossonet.command.parser.option.token.TokenAnalyzer
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class ParameterUnaryToken implements TokenAnalyzer {

	public final static class ParameterUnaryTokenBuilder implements TokenBuilder<ParameterUnaryToken> {

		@Override
		public ParameterUnaryToken build() {
			// TODO Auto-generated method stub
			return new ParameterUnaryToken();
		}

	}

	// mantenere privato
	private ParameterUnaryToken() {

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
