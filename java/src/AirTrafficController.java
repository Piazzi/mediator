public class AirTrafficController {

    private static AirTrafficController instance = new AirTrafficController();

    private AirTrafficController() {}

    public static AirTrafficController getInstance() {
        return instance;
    }

    public String receiveLandingRequestFromControlTower(String message) {
        return "Landing request: " + NorthControlTower.getInstance().receiveLandingRequest(message);
    }

    public String receiveDepartureRequestFromControlTower(String message) {
        return "Departure request: " + NorthControlTower.getInstance().receiveDepartureRequest(message);
    }

    public String receiveProblemReportFromControlTower(String message) {
        return "Problem report: " + NorthControlTower.getInstance().receiveProblemReport(message);
    }

}
