package org.pure4j.checker.basic.immutable.good;

import java.math.BigInteger;

import org.pure4j.annotations.immutable.ImmutableValue;
import org.pure4j.checker.basic.pure.methods.SomePureStuff;
import org.pure4j.checker.basic.support.ShouldBePure;

/**
 * Decent immutable value implementation.
 */
@ImmutableValue
public final class SomeValueObject {

	private final String name;
	private final Integer age;
	private final int nameLength;
	private final BigInteger bi = new BigInteger("498");
	private final int r = 5;
	
	@ShouldBePure
	public BigInteger getBi() {
		return bi;
	}

	@ShouldBePure
	public int getR() {
		return r;
	}

	@ShouldBePure
	public char getC() {
		return c;
	}

	private final char c = '5';
	
	
	@ShouldBePure
	public int getNameLength() {
		return nameLength;
	}

	@ShouldBePure
	public String getName() {
		return name;
	}

	@ShouldBePure
	public Integer getAge() {
		return age;
	}

	@ShouldBePure
	public SomeValueObject(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
		this.nameLength = SomePureStuff.getLetterCount(name);
	}

	@ShouldBePure
	@Override
	public int hashCode() {
		return 0;
	}

	@ShouldBePure
	@Override
	public String toString() {
		return "hey";
	}
	
	
}
