package org.rossonet.command.parser.template.help;

import org.rossonet.command.parser.HelpTemplate;

/**
 * Template for online help without ANSI colors
 *
 * @see org.rossonet.command.parser.HelpTemplate
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class BlackAndWhiteHelpTemplate extends HelpTemplate {

	private final static String BLACK_AND_WHITE_HELP_TEMPLATE = "b&w help template";
	// TODO completare definizione

	public BlackAndWhiteHelpTemplate() {
		super(BLACK_AND_WHITE_HELP_TEMPLATE);
	}

}
