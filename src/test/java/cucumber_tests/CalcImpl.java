package cucumber_tests;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CalcImpl {
	int num1;
	int num2;
	int res;
	Calculator calc = new Calculator();
	@Given("I have to add (.*) with (.*)")
	public void i_have_two_oerand_for_adition_operand_and(int int1, int int2) {
	   this.num1=int1;
	   this.num2=int2;
	}

	@When("I make an adition")
	public void i_make_an_adition() {
		this.res=calc.add(this.num1, this.num2);
	}

	@Then("I get result as {int}")
	public void i_get_result_as(int int1) {
		Assert.assertEquals(this.res, int1);
	}
	@Then("I give (.*) message")
	public void i_give_Hello_message(String s) {
	    System.out.println("I Say "+s);
	}

}
