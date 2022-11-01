package org.rossonet.command.parser;

/**
 * Template for help text. It uses the variables:
 *
 * TODO: completare elenco variabili utilizzabili
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class HelpTemplate {

	public static HelpTemplate fromString(final String template) {
		return new HelpTemplate(template);
	}

	private final String template;

	protected HelpTemplate(final String template) {
		this.template = template;
	}

	public String getTemplate() {
		return template;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("HelpTemplate [");
		if (template != null) {
			builder.append("template=");
			builder.append(template);
		}
		builder.append("]");
		return builder.toString();
	}

}
