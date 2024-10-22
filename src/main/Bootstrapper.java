package main;


public class Bootstrapper {

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld("John john");
		System.out.println(hw.getHello());
	}
}
