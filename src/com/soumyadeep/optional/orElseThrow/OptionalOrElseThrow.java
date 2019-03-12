package com.soumyadeep.optional.orElseThrow;

import java.util.Optional;

public class OptionalOrElseThrow {

	public static void main(String[] args) {

	Optional<String> opt = Optional.empty();
		System.out.println(opt.orElseThrow());
	}
}
