package org.pure4j.checker.basic.immutable.broken_extend;

import java.io.IOException;

import org.junit.Test;
import org.pure4j.checker.AbstractChecker;

public class TestCheckWellMadeImmutable extends AbstractChecker {

	@Test
	public void checkThisPackage() throws IOException {
		checkThisPackage(this.getClass(), 1);
	}
}
