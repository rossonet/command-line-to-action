package org.rossonet.tests;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.rossonet.command.parser.CommandParser;

@TestMethodOrder(OrderAnnotation.class)
public class ParserTests {

	private static final Logger logger = Logger.getLogger(ParserTests.class.getName());

	@AfterEach
	public void cleanTestsContext() throws Exception {
		logger.info("test completed");
	}

	@Test
	@Order(1)
	public void runBaseCostructionTest() throws Exception {
		final CommandParser parser = CommandParser.getNewCommandParser();
		logger.info("ok");
	}

}
