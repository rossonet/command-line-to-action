package org.rossonet.command.parser.option.token;

public class ParameterRegExToken implements Token {

	public final class ParameterRegExTokenBuilder implements TokenBuilder<ParameterRegExToken> {

		@Override
		public ParameterRegExToken build() {
			// TODO Auto-generated method stub
			return null;
		}

	}

	// mantenere privato
	private ParameterRegExToken() {

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
