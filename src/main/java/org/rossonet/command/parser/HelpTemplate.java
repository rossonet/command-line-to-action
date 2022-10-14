package org.rossonet.command.parser;

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
