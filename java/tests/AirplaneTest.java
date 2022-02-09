import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {

    @Test
    void shouldSendLandingRequest() {
        Airplane airplane = new Airplane();
        assertEquals("Landing request: Airplane BOING777 asking for landing, over.", airplane.sendLandingRequest("Airplane BOING777 asking for landing, over."));
    }

    @Test
    void shouldSendDepartureRequest() {
        Airplane airplane = new Airplane();
        assertEquals("Departure request: Airplane BOING777 asking for departure, over.", airplane.sendDepartureRequest("Airplane BOING777 asking for departure, over."));
    }

    @Test
    void shouldReportProblem() {
        Airplane airplane = new Airplane();
        assertEquals("Problem report: We are going through turmoil , over.", airplane.reportProblem("We are going through turmoil , over."));
    }

}