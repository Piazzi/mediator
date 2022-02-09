public class NorthControlTower implements ControlTower {

    private static NorthControlTower instance = new NorthControlTower();

    private NorthControlTower() {}

    public static NorthControlTower getInstance() {
        return instance;
    }

    public String receiveDepartureRequest(String message) {
        return  message;
    }

    public String receiveLandingRequest(String message) {
        return message;
    }

    public String receiveProblemReport(String message) {
        return  message;
    }
}
