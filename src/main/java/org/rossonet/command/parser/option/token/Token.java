package org.rossonet.command.parser.option.token;

public interface Token {

	public static <TOKEN extends Token, BUILDER extends TokenBuilder<TOKEN>> BUILDER getNewBuilder(
			final Class<BUILDER> builderClass) throws InstantiationException, IllegalAccessException {
		return builderClass.newInstance();
	}

	public int getSearchOrder();

	public String getTokenHelpLine();

	public TokenMatch lookingInCommandLine(String[] commandLine);

	public boolean searchInTotalCommadLine();

}
