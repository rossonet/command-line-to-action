package org.rossonet.command.parser.option.token;

/**
 * Looking in the command line string to find a match with a regular expression
 *
 * @see org.rossonet.command.parser.option.token.TokenAnalyzer
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class RegExToken implements TokenAnalyzer {

	public final static class RegExTokenBuilder implements TokenBuilder<RegExToken> {

		@Override
		public RegExToken build() {
			// TODO Auto-generated method stub
			return new RegExToken();
		}

	}

	// mantenere privato
	private RegExToken() {

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
