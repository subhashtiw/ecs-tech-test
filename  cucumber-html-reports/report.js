$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/test1.feature");
formatter.feature({
  "line": 1,
  "name": "ECSD technical test",
  "description": "",
  "id": "ecsd-technical-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Open http://localhost:3000 and click on \u0027Render the Challenge\u0027 button",
  "description": "",
  "id": "ecsd-technical-test;open-http://localhost:3000-and-click-on-\u0027render-the-challenge\u0027-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user is on the application home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user click on RENDER THE CHALLENGE button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the Array Challenge should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "test1StepDef.theUserIsOnTheApplicationHomePage()"
});
formatter.result({
  "duration": 5985213921,
  "status": "passed"
});
formatter.match({
  "location": "test1StepDef.theUserClickOnRENDERTHECHALLENGEButton()"
});
formatter.result({
  "duration": 2190549369,
  "status": "passed"
});
formatter.match({
  "location": "test1StepDef.theArrayChallengeShouldBeDisplayed()"
});
formatter.result({
  "duration": 3062607494,
  "status": "passed"
});
formatter.after({
  "duration": 1488490004,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Create 3 arrays out of the given table rows",
  "description": "",
  "id": "ecsd-technical-test;create-3-arrays-out-of-the-given-table-rows",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "the user is on the application home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "the user click on RENDER THE CHALLENGE button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the Array Challenge should be displayed",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the table rows are extracted in an array",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "displayed on screen",
  "keyword": "And "
});
formatter.match({
  "location": "test1StepDef.theUserIsOnTheApplicationHomePage()"
});
formatter.result({
  "duration": 4221981494,
  "status": "passed"
});
formatter.match({
  "location": "test1StepDef.theUserClickOnRENDERTHECHALLENGEButton()"
});
formatter.result({
  "duration": 2150764772,
  "status": "passed"
});
formatter.match({
  "location": "test1StepDef.theArrayChallengeShouldBeDisplayed()"
});
formatter.result({
  "duration": 3084871190,
  "status": "passed"
});
formatter.match({
  "location": "test1StepDef.theTableRowsAreExtractedInAnArray()"
});
formatter.result({
  "duration": 542994603,
  "status": "passed"
});
formatter.match({
  "location": "test1StepDef.displayedOnScreen()"
});
formatter.result({
  "duration": 1356677542,
  "status": "passed"
});
formatter.after({
  "duration": 1382817488,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Find the answer for all the 3 arrays and submit",
  "description": "",
  "id": "ecsd-technical-test;find-the-answer-for-all-the-3-arrays-and-submit",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "the user is on the application home page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "the user click on RENDER THE CHALLENGE button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the Array Challenge should be displayed",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "calculate and submit the answers",
  "keyword": "Then "
});
formatter.match({
  "location": "test1StepDef.theUserIsOnTheApplicationHomePage()"
});
formatter.result({
  "duration": 4529742637,
  "status": "passed"
});
formatter.match({
  "location": "test1StepDef.theUserClickOnRENDERTHECHALLENGEButton()"
});
formatter.result({
  "duration": 2159398542,
  "status": "passed"
});
formatter.match({
  "location": "test1StepDef.theArrayChallengeShouldBeDisplayed()"
});
formatter.result({
  "duration": 3061564992,
  "status": "passed"
});
formatter.match({
  "location": "test1StepDef.calculateAndSubmitTheAnswers()"
});
formatter.result({
  "duration": 7940248910,
  "status": "passed"
});
formatter.after({
  "duration": 4354946709,
  "status": "passed"
});
});