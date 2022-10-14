package org.rossonet.command.parser.option.token;

public class RegExToken implements Token {

	public final class RegExTokenBuilder implements TokenBuilder<RegExToken> {

		@Override
		public RegExToken build() {
			// TODO Auto-generated method stub
			return null;
		}

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
	public TokenMatch lookingInCommandLine(final String[] commandLine) {
		// TODO Auto-generated method stub
		return null;
	}

}
