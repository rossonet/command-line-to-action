package org.rossonet.command.parser.option.token;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.rossonet.command.parser.option.Option;

/**
 * Looking in the command line string to find a match with a regular expression
 *
 * @see org.rossonet.command.parser.option.token.TokenAnalyzer
 *
 * @author Andrea Ambrosini [Rossonet s.c.a r.l.]
 *
 */
public class RegExToken extends TokenAnalyzer {
	public final static class RegExTokenBuilder extends TokenBuilder<RegExToken> {

		private String regExValueCheck = DEFAULT_REGEX;

		@Override
		public RegExToken build() {
			return new RegExToken(searchOrder, searchInTotalCommadLine, tokenHelpLine, regExValueCheck);
		}

		public RegExTokenBuilder setRegExValueCheck(final String regExValueCheck) {
			this.regExValueCheck = regExValueCheck;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public RegExTokenBuilder setSearchInTotalCommadLine(final boolean searchInTotalCommadLine) {
			this.searchInTotalCommadLine = searchInTotalCommadLine;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public RegExTokenBuilder setSearchOrder(final int searchOrder) {
			this.searchOrder = searchOrder;
			return this;
		}

		@SuppressWarnings("unchecked")
		@Override
		public RegExTokenBuilder setTokenHelpLine(final String tokenHelpLine) {
			this.tokenHelpLine = tokenHelpLine;
			return this;
		}

	}

	private class ValueFound {

		private final int end;
		private final String group;
		private final int start;

		public ValueFound(final String group, final int start, final int end) {
			this.group = group;
			this.start = start;
			this.end = end;
		}

	}

	private static final String DEFAULT_REGEX = "^.*$";

	private Pattern pattern = null;

	private String regExValueCheck = DEFAULT_REGEX;

	// mantenere privato
	private RegExToken(final int searchOrder, final boolean searchInTotalCommadLine, final String tokenHelpLine,
			final String regExValueCheck) {
		super(searchOrder, searchInTotalCommadLine, tokenHelpLine);
		this.regExValueCheck = regExValueCheck;

	}

	@Override
	public TokenMatch lookingInCommandLine(final Option option, final String[] commandLine) {
		final String commandString = getCommandString(commandLine);
		if (pattern == null) {
			pattern = Pattern.compile(regExValueCheck);
		}
		final Matcher m = pattern.matcher(commandString);
		String[] values = new String[0];
		boolean found = false;
		int[] foundInArgs = new int[0];
		if (m.matches()) {
			// all line matches
			found = true;
			values = new String[] { commandString };
			foundInArgs = new int[commandLine.length];
			for (int i = 0; i < commandLine.length; i++) {
				foundInArgs[i] = i;
			}
		} else {
			final List<ValueFound> listValuesFound = new ArrayList<>();
			while (m.find()) {
				if (!found) {
					found = true;
				}
				listValuesFound.add(new ValueFound(m.group(), m.start(), m.end()));
			}
			if (found) {
				final SortedSet<Integer> usedWords = new TreeSet<>();
				values = new String[listValuesFound.size()];
				int count = 0;
				for (final ValueFound v : listValuesFound) {
					values[count] = v.group;
					usedWords.addAll(findWordsInOffset(commandLine, v.start, v.end));
					count++;
				}
				foundInArgs = new int[usedWords.size()];
				count = 0;
				for (final Integer uw : usedWords) {
					foundInArgs[count] = uw;
					count++;
				}
			}
		}
		return new TokenMatch(values, found, foundInArgs, option, this);
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("RegExToken [pattern=");
		builder.append(pattern);
		builder.append(", regExValueCheck=");
		builder.append(regExValueCheck);
		builder.append("]");
		return builder.toString();
	}

	private Collection<Integer> findWordsInOffset(final String[] commandLine, final int start, final int end) {
		final Set<Integer> result = new HashSet<>();
		int from = 0;
		int to = 0;
		int counter = 0;
		for (final String w : commandLine) {
			to = from + w.length();
			if (start <= from && end >= to) {
				result.add(counter);
			}
			from = to + 1;
			counter++;
		}
		return result;
	}

}
