package org.pure4j.exception;

import org.pure4j.model.FieldHandle;
import org.pure4j.processor.PureChecklistHandler.PureMethod;

public class PureMethodAccessesNonImmutableFieldException extends Pure4JException {

	public PureMethodAccessesNonImmutableFieldException(PureMethod pureMethod, FieldHandle fh) {
		super("Pure implementation: "+pureMethod+" is expected to be pure but accesses a non-immutable value which isn't private/protected "+fh);
	}

}
