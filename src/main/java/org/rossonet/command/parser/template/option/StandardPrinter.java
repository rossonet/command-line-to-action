package org.rossonet.command.parser.template.option;

/**
 * Standard output for templates
 *
 * @see org.rossonet.command.parser.template.option.StandardAboutAndVersionOption
 * @see org.rossonet.command.parser.template.option.StandardHelpOption
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class StandardPrinter {

	public void writeError(final String output) {
		System.err.print(output);
	};

	public void writeErrorLine(final String output) {
		System.err.println(output);
	};

	public void writeOutput(final String output) {
		System.out.print(output);
	};

	public void writeOutputLine(final String output) {
		System.out.println(output);
	};

}
