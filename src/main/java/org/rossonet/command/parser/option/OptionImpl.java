package org.rossonet.command.parser.option;

import java.util.Collection;

import org.rossonet.command.parser.CommandParser;
import org.rossonet.command.parser.action.Action;
import org.rossonet.command.parser.action.ErrorAction;
import org.rossonet.command.parser.option.token.TokenAnalyzer;

/**
 * Base implementation of the @link org.rossonet.command.parser.option.Option
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class OptionImpl implements Option {

	// mantenere non public
	OptionImpl() {

	}

	@Override
	public Action getAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getActionPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CommandParser getCommandParser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErrorAction getErrorAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getHelpViewOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Action getPostAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPostActionPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Action getPreAction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPreActionPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<TokenAnalyzer> getTokenParsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMandatary() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPresentInCommandLine() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Option setAction(final Action action) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Option setActionPriority(final int priority) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Option setCommandParser(final CommandParser commandParser) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Option setDescription(final String description) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Option setErrorAction(final ErrorAction errorAction) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Option setGroup(final String group) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Option setHelpViewOrder(final int order) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Option setMandatary(final boolean isMandatary) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Option setPostAction(final Action action) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Option setPostActionPriority(final int priority) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Option setPreAction(final Action action) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Option setPreActionPriority(final int priority) {
		// TODO Auto-generated method stub
		return this;
	}

}
