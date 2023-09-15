import javax.print.attribute.standard.MediaTray;

import bridge.accelerator.Jet;
import bridge.accelerator.Propeller;
import bridge.vehicle.Submarin;
import chaineofresponsiblity.infrastructure.AddRequest;
import chaineofresponsiblity.infrastructure.MediaType;
import chaineofresponsiblity.infrastructure.WebService;
import human.HumanLikeRobot;
import robot.Robot;

public class App {
    public static void main(String[] args) throws Exception {
        /* Adapter test parts */
        // Robot newRobot = new Robot("T600 M2");
        // HumanLikeRobot hooman = new HumanLikeRobot("Hooman", newRobot);
        //// HumanLikeRobot hoo = new HumanLikeRobot(null, null);
        //
        // hooman.whoAreYou();
        // hooman.saySomething();
        // hooman.walk();
        // hooman.passCaptchaTest();
        // System.out.println("ayoub");

        /* Bridge part */
        // Propeller prop = new Propeller();
        // Jet jet = new Jet();
        //
        // Submarin sbMarine = new Submarin(jet);
        // sbMarine.move();
        //
        // Submarin sbMarine2 = new Submarin(prop);
        // sbMarine2.move();

        /*
         * Chain of Responsibility
         * Creating different request
         * and every request should be implemented differently
         */
        // creating different request
        AddRequest addreqq1 = new AddRequest(12, 15, MediaType.JSON);
        AddRequest addreqq2 = new AddRequest(3, 4, MediaType.XML);
        AddRequest addreqq3 = new AddRequest(7, 1, MediaType.TEXT);
        
        // Creating our web-service with default chain of handers
        WebService ws = new WebService();
        //sending request and printing the result:
        // sending request and printing the result
        System.out.println("req1:");
        System.out.println(ws.handleRequest(addreqq1));

        System.out.println("req2:");
        System.out.println(ws.handleRequest(addreqq2));

        System.out.println("req3:");
        System.out.println(ws.handleRequest(addreqq3));

        System.out.println("Hello, World!");
        System.out.println("ayoub");
    }
}
