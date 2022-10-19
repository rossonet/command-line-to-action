package org.rossonet.command.parser.template.option;

import java.util.logging.Level;

/**
 *
 * Callback for log level manager. The client need to implements it with the
 * code that changes the log level.
 *
 * @see org.rossonet.command.parser.template.option.StandardLogLevelManagementOption
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public interface ChangeLogLevelAction {

	public void setLogLevel(Level requestLogLevel);
}
