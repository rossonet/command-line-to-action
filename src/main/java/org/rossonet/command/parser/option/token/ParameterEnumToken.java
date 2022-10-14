package org.rossonet.command.parser.option.token;

public class ParameterEnumToken implements Token {

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
