import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test1() {
        Plane plane = new Plane();
        plane.doAction();
        Assertions.assertEquals("Самолет сейчас в гараже" + System.lineSeparator(), output.toString());
    }

    @Test
    public void test2() {
        Plane plane = new Plane();
        plane.exitFromGarage();
        plane.doAction();
        Assertions.assertEquals("Самолет вышел из гаража" + System.lineSeparator()
                + "Самолет сейчас на взлетной полосе" + System.lineSeparator(), output.toString());
    }

    @Test
    public void test3() {
        Plane plane = new Plane();
        plane.exitFromGarage();
        plane.takeoff();
        plane.doAction();
        Assertions.assertEquals("Самолет вышел из гаража" + System.lineSeparator()
                + "Самолет собирается взлететь" + System.lineSeparator() +
                "Самолет сейчас в воздухе" + System.lineSeparator(), output.toString());
    }

    @Test
    public void test4() {
        Plane plane = new Plane();
        plane.exitFromGarage();
        plane.takeoff();
        plane.exitFromGarage();
        Assertions.assertEquals("Самолет вышел из гаража" + System.lineSeparator()
                + "Самолет собирается взлететь" + System.lineSeparator() +
                "Действие невозможно! Самолет в воздухе" + System.lineSeparator(), output.toString());
    }

    @Test
    public void test5() {
        Plane plane = new Plane();
        plane.land();
        plane.takeoff();
        Assertions.assertEquals("Самолет не может приземлиться! Он уже в гараже" + System.lineSeparator()
                + "Самолет не может взлететь! Он уже в гараже" + System.lineSeparator(), output.toString());
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(standardOut);
    }
}