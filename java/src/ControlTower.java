public interface ControlTower {
    String receiveDepartureRequest(String message);
    String receiveLandingRequest(String message);
    String receiveProblemReport(String message);
}
