package org.rossonet.command.parser.template.option;

import java.util.Collection;
import java.util.HashSet;

import org.rossonet.command.parser.CommandParser;
import org.rossonet.command.parser.action.Action;
import org.rossonet.command.parser.action.ErrorAction;
import org.rossonet.command.parser.exception.CommandParserException;
import org.rossonet.command.parser.option.Option;
import org.rossonet.command.parser.option.token.TokenAnalyzer;

/**
 * Abstract class used for the @link org.rossonet.command.parser.option.Option
 * templates
 *
 * @see org.rossonet.command.parser.option.Option
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public abstract class StandardOption implements Option {

	public static final String BASE_GROUP = "Base Commands";

	private CommandParser commandParser;

	private String description;

	private String group = BASE_GROUP;

	private int helpViewOrder = 1000;
	private final Collection<TokenAnalyzer> tokens = new HashSet<>();

	@Override
	public Action getAction() {
		throw new CommandParserException("not implemented");
	}

	@Override
	public int getActionPriority() {
		throw new CommandParserException("not implemented");
	}

	@Override
	public CommandParser getCommandParser() {
		return commandParser;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public ErrorAction getErrorAction() {
		throw new CommandParserException("not implemented");
	}

	@Override
	public String getGroup() {
		return this.group;
	}

	@Override
	public int getHelpViewOrder() {
		return this.helpViewOrder;
	}

	@Override
	public Action getPostAction() {
		throw new CommandParserException("not implemented");
	}

	@Override
	public int getPostActionPriority() {
		throw new CommandParserException("not implemented");
	}

	@Override
	public Action getPreAction() {
		throw new CommandParserException("not implemented");
	}

	@Override
	public int getPreActionPriority() {
		throw new CommandParserException("not implemented");
	}

	@Override
	public Collection<TokenAnalyzer> getTokenParsers() {
		return tokens;
	}

	@Override
	public boolean isMandatary() {
		return false;
	}

	@Override
	public boolean isPresentInCommandLine() {
		throw new CommandParserException("not implemented");
	}

	@Override
	public Option setAction(final Action action) {
		throw new CommandParserException("not implemented");
	}

	@Override
	public Option setActionPriority(final int priority) {
		throw new CommandParserException("not implemented");
	}

	@Override
	public Option setCommandParser(final CommandParser commandParser) {
		this.commandParser = commandParser;
		return this;
	}

	@Override
	public Option setDescription(final String description) {
		this.description = description;
		return this;
	}

	@Override
	public Option setErrorAction(final ErrorAction errorAction) {
		throw new CommandParserException("not implemented");
	}

	@Override
	public Option setGroup(final String group) {
		this.group = group;
		return this;
	}

	@Override
	public Option setHelpViewOrder(final int order) {
		helpViewOrder = order;
		return this;
	}

	@Override
	public Option setMandatary(final boolean isMandatary) {
		throw new CommandParserException("not implemented");
	}

	@Override
	public Option setPostAction(final Action action) {
		throw new CommandParserException("not implemented");
	}

	@Override
	public Option setPostActionPriority(final int priority) {
		throw new CommandParserException("not implemented");
	}

	@Override
	public Option setPreAction(final Action action) {
		throw new CommandParserException("not implemented");
	}

	@Override
	public Option setPreActionPriority(final int priority) {
		throw new CommandParserException("not implemented");
	}

}
