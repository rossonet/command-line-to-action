package org.rossonet.command.parser.option;

import java.util.Collection;

import org.rossonet.command.parser.action.Action;
import org.rossonet.command.parser.action.ErrorAction;

public interface Option {

	public static Option getNewOption() {
		return new OptionImpl();
	}

	public Action getAction();

	public int getActionPriority();

	public ErrorAction getErrorAction();

	public Action getPostAction();

	public int getPostActionPriority();

	public Action getPreAction();

	public int getPreActionPriority();

	public Collection<Token> getTokenParsers();

	public boolean isMandatary();

	public boolean isPresentInCommandLine();

	public Option setAction(Action action);

	public Option setActionPriority(int priority);

	public Option setErrorAction(ErrorAction errorAction);

	public Option setMandatary(boolean isMandatary);

	public Option setPostAction(Action action);

	public Option setPostActionPriority(int priority);

	public Option setPreAction(Action action);

	public Option setPreActionPriority(int priority);

}
