$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com.freeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 4,
      "value": "#BDD without example keyword"
    }
  ],
  "line": 5,
  "name": "user is already on login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"arahim\" and \"arahim\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FreeCRMSteps.user_is_already_on_login_Page()"
});
formatter.result({
  "duration": 5454418389,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMSteps.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 7089348,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arahim",
      "offset": 13
    },
    {
      "val": "arahim",
      "offset": 26
    }
  ],
  "location": "FreeCRMSteps.user_enters_and(String,String)"
});
formatter.result({
  "duration": 360958366,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMSteps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 5114944999,
  "status": "passed"
});
formatter.match({
  "location": "FreeCRMSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 4520095,
  "status": "passed"
});
});