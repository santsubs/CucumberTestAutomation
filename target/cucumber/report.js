$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features//first/Test_Feature1.feature");
formatter.feature({
  "name": "test feature 1",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "go to yahoo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test1"
    }
  ]
});
formatter.step({
  "name": "User navigates to \"https://in.yahoo.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.first.stepDefinitions.webPages_stepDef.user_navigates_to_something(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: time pass asser\n\tat org.junit.Assert.fail(Assert.java:89)\n\tat org.junit.Assert.assertTrue(Assert.java:42)\n\tat com.first.stepDefinitions.webPages_stepDef.user_navigates_to_something(webPages_stepDef.java:20)\n\tat ✽.User navigates to \"https://in.yahoo.com/\"(classpath:features//first/Test_Feature1.feature:5)\n",
  "status": "failed"
});
formatter.uri("classpath:features//first/Test_Feature2.feature");
formatter.feature({
  "name": "test feature 2",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "go to google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test2"
    }
  ]
});
formatter.step({
  "name": "User navigates to \"https://www.google.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.first.stepDefinitions.webPages_stepDef.user_navigates_to_something(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: time pass asser\n\tat org.junit.Assert.fail(Assert.java:89)\n\tat org.junit.Assert.assertTrue(Assert.java:42)\n\tat com.first.stepDefinitions.webPages_stepDef.user_navigates_to_something(webPages_stepDef.java:20)\n\tat ✽.User navigates to \"https://www.google.com/\"(classpath:features//first/Test_Feature2.feature:5)\n",
  "status": "failed"
});
});