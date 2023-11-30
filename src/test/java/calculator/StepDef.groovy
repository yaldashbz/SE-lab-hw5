package calculator


import cucumber.api.PendingException

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^Two input values, (\d+) and (\d+)$/) { int arg1, int arg2 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
When(~/^I radical division the values$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}
Then(~/^I expect the result (\d+)$/) { int arg1 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}