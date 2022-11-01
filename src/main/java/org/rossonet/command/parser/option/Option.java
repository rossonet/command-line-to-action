package org.rossonet.command.parser.option;

import java.util.Collection;

import org.rossonet.command.parser.CommandParser;
import org.rossonet.command.parser.action.Action;
import org.rossonet.command.parser.action.ErrorAction;
import org.rossonet.command.parser.option.token.TokenAnalyzer;

/**
 * Represent a single option to looking for. When a Option is found, the
 * related @link org.rossonet.command.parser.action.Action is called. If an
 * error occurs the @link org.rossonet.command.parser.action.ErrorAction is
 * invoked at the end execution
 *
 * An Option have one or many @link
 * org.rossonet.command.parser.option.token.TokenAnalyzer to search in the
 * command line. It can be mandatary, have a group and a description for the
 * help text
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public interface Option {

	public static Option getNewOption() {
		return new OptionImpl();
	}

	public Action getAction();

	public int getActionPriority();

	public CommandParser getCommandParser();

	public String getDescription();

	public ErrorAction getErrorAction();

	public String getGroup();

	public int getHelpViewOrder();

	public Action getPostAction();

	public int getPostActionPriority();

	public Action getPreAction();

	public int getPreActionPriority();

	public Collection<TokenAnalyzer> getTokenParsers();

	public boolean isMandatary();

	public boolean isPresentInCommandLine();

	public Option setAction(Action action);

	public Option setActionPriority(int priority);

	public Option setCommandParser(CommandParser commandParser);

	public Option setDescription(String description);

	public Option setErrorAction(ErrorAction errorAction);

	public Option setGroup(String group);

	public Option setHelpViewOrder(int order);

	public Option setMandatary(boolean isMandatary);

	public Option setPostAction(Action action);

	public Option setPostActionPriority(int priority);

	public Option setPreAction(Action action);

	public Option setPreActionPriority(int priority);

}
