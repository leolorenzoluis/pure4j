package org.pure4j.checker.basic.immutable.not_final;

import org.pure4j.annotations.immutable.ImmutableValue;
import org.pure4j.checker.basic.support.ShouldBePure;

@ImmutableValue
public class NotFinal {

	@ShouldBePure
	@Override
	public int hashCode() {
		return 1;
	}

	@ShouldBePure
	@Override
	public boolean equals(Object obj) {
		return false;
	}

	@ShouldBePure
	@Override
	public String toString() {
		return null;
	}

	
}
