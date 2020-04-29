package Tests;

import org.testng.annotations.Test;

import Pages.Home;

public class HomeTest {

	@Test
	public void HomeTestCase() {
		Home home = new Home();
		home.sayHello();
	}

}
