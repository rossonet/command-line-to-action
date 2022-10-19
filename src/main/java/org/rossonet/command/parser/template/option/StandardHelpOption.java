package org.rossonet.command.parser.template.option;

import org.rossonet.command.parser.action.Action;
import org.rossonet.command.parser.option.Option;
import org.rossonet.command.parser.option.token.TokenMatch;

public class StandardHelpOption extends StandardOption {

	private StandardPrinter printer = new StandardPrinter();

	public StandardHelpOption() {
		setGroup(StandardOption.BASE_GROUP);
		setDescription("print help");
		setHelpViewOrder(9998);
	}

	@Override
	public Action getPostAction() {
		return new Action() {

			@Override
			public void fire(final String[] values, final Option option, final TokenMatch[] tokens,
					final String[] args) {
				printer.writeOutputLine(getCommandParser().getHelp());

			}

		};
	}

	@Override
	public int getPostActionPriority() {
		return 8999;
	}

	public StandardPrinter getPrinter() {
		return printer;
	}

	public void setPrinter(final StandardPrinter printer) {
		this.printer = printer;
	}
}