package org.rossonet.command.parser.template.option;

import java.util.logging.Level;

import org.rossonet.command.parser.action.Action;
import org.rossonet.command.parser.exception.CommandParserException;
import org.rossonet.command.parser.option.Option;
import org.rossonet.command.parser.option.token.TokenMatch;

/**
 * @link org.rossonet.command.parser.option.Option implementation to manage -l
 *       <NEW LOGLEVEL> and --log <NEW LOGLEVEL> parameters
 *
 * @see org.rossonet.command.parser.template.option.StandardOption
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class StandardLogLevelManagementOption extends StandardOption {

	private final ChangeLogLevelAction changeLogLevelAction;

	public StandardLogLevelManagementOption(final ChangeLogLevelAction changeLogLevelAction) {
		this.changeLogLevelAction = changeLogLevelAction;
		setGroup(StandardOption.BASE_GROUP);
		setDescription(
				"change log level, you can set the logger to: all, config, fine, finer, finest, info, off, severe or warning");
		setHelpViewOrder(9998);
	}

	public ChangeLogLevelAction getChangeLogLevelAction() {
		return changeLogLevelAction;
	}

	@Override
	public Action getPreAction() {
		return new Action() {

			@Override
			public void fire(final String[] values, final Option option, final TokenMatch[] tokens,
					final String[] args) {
				final Level targetLevel = stringToLoglevel(values[0]);
				changeLogLevelAction.setLogLevel(targetLevel);

			}

		};
	}

	@Override
	public int getPreActionPriority() {
		return 0;
	}

	private Level stringToLoglevel(final String value) {
		Level targetLevel = Level.INFO;
		switch (value) {
		case "all":
			targetLevel = Level.ALL;
			break;
		case "config":
			targetLevel = Level.CONFIG;
			break;
		case "fine":
			targetLevel = Level.FINE;
			break;
		case "finer":
			targetLevel = Level.FINER;
			break;
		case "finest":
			targetLevel = Level.FINEST;
			break;
		case "info":
			targetLevel = Level.INFO;
			break;
		case "off":
			targetLevel = Level.OFF;
			break;
		case "severe":
			targetLevel = Level.SEVERE;
			break;
		case "warning":
			targetLevel = Level.WARNING;
			break;
		default:
			throw new CommandParserException("log level " + value
					+ " not exists. You can use: all, config, fine, finer, finest, info, off, severe or warning");
		}
		return targetLevel;
	}

}
