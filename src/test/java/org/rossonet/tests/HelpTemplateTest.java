package org.rossonet.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.rossonet.command.parser.HelpTemplate;

class HelpTemplateTest {

	@Test
	void testFromStringAndGetTemplate() {
		final String randomString = UUID.randomUUID().toString();
		final HelpTemplate helpTemplate = HelpTemplate.fromString(randomString);
		assertEquals(randomString, helpTemplate.getTemplate());
	}

}
