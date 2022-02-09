public class Aircraft {

    public String sendLandingRequest(String message) {
        return AirTrafficController.getInstance().receiveLandingRequestFromControlTower(message);
    }

    public String sendDepartureRequest(String message) {
        return AirTrafficController.getInstance().receiveDepartureRequestFromControlTower(message);
    }

    public String reportProblem(String message) {
        return AirTrafficController.getInstance().receiveProblemReportFromControlTower(message);
    }


}
