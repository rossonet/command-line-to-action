package org.rossonet.command.parser.template.option;

import org.rossonet.command.parser.action.Action;
import org.rossonet.command.parser.option.Option;
import org.rossonet.command.parser.option.token.TokenMatch;

/**
 *
 * Manage the unary flags --credits and --version
 *
 * @see org.rossonet.command.parser.template.option.StandardOption
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */

public class StandardAboutAndVersionOption extends StandardOption {

	private StandardPrinter printer = new StandardPrinter();

	public StandardAboutAndVersionOption() {
		setGroup(StandardOption.BASE_GROUP);
		setDescription("print version and credit");
		setHelpViewOrder(9999);
	}

	@Override
	public Action getPostAction() {
		return new Action() {

			@Override
			public void fire(final String[] values, final Option option, final TokenMatch[] tokens,
					final String[] args) {
				printer.writeOutputLine(getAboutAndVersionMessage());

			}

		};
	}

	@Override
	public int getPostActionPriority() {
		return 9000;
	}

	public StandardPrinter getPrinter() {
		return printer;
	}

	public void setPrinter(final StandardPrinter printer) {
		this.printer = printer;
	}

	private String getAboutAndVersionMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
