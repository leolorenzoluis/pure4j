package org.pure4j.checker.basic.immutable.equals;

import org.pure4j.annotations.immutable.ImmutableValue;
import org.pure4j.checker.basic.support.ShouldBePure;

@ImmutableValue
public final class ConfusingEquals2 { 
	
	@ShouldBePure
	public int hashCode() {
		return 0;
	}
	
	@ShouldBePure
	public String toString() {
		return "blah";
	}

}
