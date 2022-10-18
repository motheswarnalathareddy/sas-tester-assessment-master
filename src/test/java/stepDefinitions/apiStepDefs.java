package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class apiStepDefs {
//
    @Given("^User should be logged in and should be present on Amazon Home page$")
    public void user_should_be_logged_in_and_should_be_present_on_amazon_home_page() {
        System.out.println("User should be logged in and should be present on Amazon Home page");
    }
    @And("^User clicks on eGift Cards Button$")
    public void user_clicks_on_egift_cards_button() {
        System.out.println("User clicks on eGift Cards Button");
    }

    @When("^User select eGift Card$")
    public void user_select_egift_card(){
            System.out.println("User select eGift Card");
    }

    @Then("^eGift Card should be added to the Cart for payment$")
    public void egift_card_should_be_added_to_the_cart_for_payment() {
        System.out.println("eGift Card should be added to the Cart for payment");

    }

    @And("^User enter the details and clicks on Add to cart button$")
    public void user_enter_the_details_and_clicks_on_add_to_cart_button()  {
        System.out.println("User enter the details and clicks on Add to cart button");
    }

}
//
//    @Given("User should be logged in and should be present on Amazon Home page")
//    public void user_should_be_logged_in_and_should_be_present_on_amazon_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Given("User clicks on eGift Cards Button")
//    public void user_clicks_on_e_gift_cards_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("User select eGift Card")
//    public void user_select_e_gift_card() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("User enter the details and clicks on Add to cart button")
//    public void user_enter_the_details_and_clicks_on_add_to_cart_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("eGift Card should be added to the Cart for payment")
//    public void e_gift_card_should_be_added_to_the_cart_for_payment() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//io.cucumber.junit.UndefinedStepException: The step 'User should be logged in and should be present on Amazon Home page' and 4 other step(s) are undefined.
//        You can implement these steps using the snippet(s) below:
//
//@Given("User should be logged in and should be present on Amazon Home page")
//public void user_should_be_logged_in_and_should_be_present_on_amazon_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//        }
//@Given("User clicks on eGift Cards Button")
//public void user_clicks_on_e_gift_cards_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//        }
//@When("User select eGift Card")
//public void user_select_e_gift_card() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//        }
//@When("User enter the details and clicks on Add to cart button")
//public void user_enter_the_details_and_clicks_on_add_to_cart_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//        }
//@Then("eGift Card should be added to the Cart for payment")
//public void e_gift_card_should_be_added_to_the_cart_for_payment() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//        }
