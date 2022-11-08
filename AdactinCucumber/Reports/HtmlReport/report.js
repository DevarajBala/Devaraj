$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin_feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User login In Adactin  Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-adactin--application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user Launch the web application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter the Username in user user field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter the password in password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clik the login button to navigate to sear hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_the_web_application()"
});
formatter.result({
  "duration": 8731103500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_the_Username_in_user_user_field()"
});
formatter.result({
  "duration": 107671700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_the_password_in_password_field()"
});
formatter.result({
  "duration": 72353100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clik_the_login_button_to_navigate_to_sear_hotel_page()"
});
formatter.result({
  "duration": 966991400,
  "status": "passed"
});
});