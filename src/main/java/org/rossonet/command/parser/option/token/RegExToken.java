package org.rossonet.command.parser.option.token;

public class RegExToken implements Token {

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
