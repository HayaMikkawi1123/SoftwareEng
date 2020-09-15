package testing;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import MainCheck.Checkout;
import MainCheck.Fruit;


public class CheckingOut {
	
	private Checkout co= new Checkout(); 
	Fruit f;
	@Given("the price of a {string} is {int}")
	public void thePriceOfAIs(String product, Integer price) {
		
		f= new Fruit(product, price);
		co.pushing(f);
	}
	@When("I checkout {int} {string}")
	public void iCheckout(Integer num, String string) { 
		co.add(num, string);
		
	}
	@Then("the total price should be {int}")
	public void theTotalPriceShouldBe (Integer int1) {
		assertEquals(int1,co.finalTotal());
	}
	}


