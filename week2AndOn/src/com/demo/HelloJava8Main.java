package com.demo;

public class HelloJava8Main implements HelloJava8Interface {
public static void main(String[] args) {
	HelloJava8Main h = new HelloJava8Main();
			h.hiDefault();
	HelloJava8Interface.hiStatic();
}
}
