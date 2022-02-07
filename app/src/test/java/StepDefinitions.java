public class StepDefinitions {

    @Given("account balance is {double}")
    public void givenAccountBalance(Double initialBalance) {
        account = new Account(initialBalance);
    }

    // other step definitions 

}