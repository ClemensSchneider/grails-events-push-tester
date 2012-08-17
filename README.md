This is a simple grails-app to test the basic functionality of grails-events-push plugin (https://github.com/smaldini/grails-events-push).

To run it:

1. Clone it
2. Change to the folder of the repository and run `grailsw run-app` which automatically loads grails 2.1.0 (if not installed) and runs the application.
3. Open your browser, open the development tools and browse to http://localhost:8080/push-tester
4. Check the network tab for established websockets-connection and try clicking the button
5. Check console-output for errors/warnings (websockets should be used instead of long-polling)