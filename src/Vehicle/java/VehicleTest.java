package Vehicle.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testGo() {
        Car car = new Car("プリウス", "白");
        car.setVelocity(5);

        car.go(3);

        assertEquals(15, car.getX());
    }

    @Test
    public void testBack() {
        Car car = new Car("プリウス", "白");
        car.setVelocity(5);

        car.go(3);
        car.back(2);

        assertEquals(5, car.getX());
    }

    @Test
    public void testDiff() {
        assertEquals(10, Vehicle.diff(15, 5));
        assertEquals(10, Vehicle.diff(5, 15));
    }
}
