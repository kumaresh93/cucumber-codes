package testNg;

import org.testng.annotations.Test;

public class Driveacar {
	@Test
	public void startthecar(priority="0") {
		System.out.println("start the car");
	}
@Test()
	public void putfirstgear("1") {
		System.out.println("put first gear");
	}
@Test()
	public void putsecondgear("2") {
		System.out.println("put second gear");
	}
@Test()
	public void putthirdgear("3") {
		System.out.println("put third gear");
	}
@Test()
	public void putfourthgear("4") {
		System.out.println("put fourth gear");
	}
}
