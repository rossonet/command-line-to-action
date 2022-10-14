package org.rossonet.command.parser;

import java.util.Collection;

import org.rossonet.command.parser.exception.CommandParserException;
import org.rossonet.command.parser.option.Option;

public interface CommandParser {

	public static enum Status {
		ACTION_COMPLETED, ACTION_RUNNING, COMPLETED, ERROR, INIT, POST_ACTION_COMPLETED, POST_ACTION_RUNNING,
		PRE_ACTION_COMPLETED, PRE_ACTION_RUNNING
	}

	public static CommandParser getNewCommandParser() {
		return new CommandParserImpl();
	}

	public void addOption(Option option);

	public void fireActionRules() throws CommandParserException;

	public void fireAllRules() throws CommandParserException;

	public void firePostRules() throws CommandParserException;

	public void firePreRules() throws CommandParserException;

	public String getBashAutoCompletionScript();

	public String[] getCommandLine();

	public String getHelp();

	public HelpTemplate getHelpTemplate();

	public Collection<Option> getOptions();

	public String getPowerShellAutoCompletionScript();

	public Status getStatus();

	public String getZshAutoCompletionScript();

	public void setCommandLine(String[] args);

	public void setHelpTemplate(HelpTemplate helpTemplate);

}
