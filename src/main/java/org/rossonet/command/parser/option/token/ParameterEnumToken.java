package org.rossonet.command.parser.option.token;

public class ParameterEnumToken implements Token {

	public final class ParameterEnumTokenBuilder implements TokenBuilder<ParameterEnumToken> {

		@Override
		public ParameterEnumToken build() {
			// TODO Auto-generated method stub
			return null;
		}

	}

	// mantenere privato
	private ParameterEnumToken() {

	}

	@Override
	public <BUILDER extends TokenBuilder<? extends Token>> BUILDER getNewBuilder() {
		// TODO Auto-generated method stub
		return null;
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

}
