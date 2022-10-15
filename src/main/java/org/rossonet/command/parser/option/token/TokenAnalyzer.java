package org.rossonet.command.parser.option.token;

/**
 * Analyzer to parse the command line input and find the tokens. The
 * implementation must have the related builder class @link
 * org.rossonet.command.parser.option.token.TokenBuilder<TOKEN>
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public interface TokenAnalyzer {

	public static <TOKEN extends TokenAnalyzer, BUILDER extends TokenBuilder<TOKEN>> BUILDER getNewBuilder(
			final Class<BUILDER> builderClass) throws InstantiationException, IllegalAccessException {
		return builderClass.newInstance();
	}

	public int getSearchOrder();

	public String getTokenHelpLine();

	public TokenMatch lookingInCommandLine(String[] commandLine);

	public boolean searchInTotalCommadLine();

}
