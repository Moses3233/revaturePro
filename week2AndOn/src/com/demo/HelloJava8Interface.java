package com.demo;

public interface HelloJava8Interface {

	public static void hiStatic() {
		System.out.println("Hello from static methods from a Java interface in 8+");
	}
	default void hiDefault() {
		System.out.println("Hi from default methods from Java 8+");
	}
}
