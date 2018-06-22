# ATMFinder

ATM Finder is a Java web application to display the list of ATMs. It calls the ING REST API displays the JSON result in a table.

Technologies: 

Spring boot 
Spring Security
Thymeleaf
Maven
JDK 8
Tomcat

Application Security:

In memory authentication is used. Two users "user" and "admin" are created. The password for both the users is "backbase"


Configuration:

URL to call REST API provided by ING is configured in application.properties. The JSON returned by this API is converted into model object and returned by ATMFinderService.java class.

Controller:

The application provides below endpoints:

/atmLocations -> To get all atm locations in Netherlands
/atmLocations/{city} -> To get all atm locations in a given city

Front End:

Thymeleaf is used in front end for the UI. Also Jquery is used to retrieve the data using ajax calls.


