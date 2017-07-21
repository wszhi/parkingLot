package com.thoughtworks;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LotTest{
    @Test
    public void should_return_success_to_parking_when_parking_lot_has_empty_seat() throws Exception {
        Lot lot = new Lot(1);
        Car car = new Car("1");
        assertEquals("success to parking", lot.parking(car));
    }

    @Test
    public void should_return_failed_to_parking_when_parking_lot_is_full() throws Exception {
        Lot lot = new Lot(1);
        Car car = new Car("1");
        lot.parking(car);
        Car car2 = new Car("2");
        assertEquals("failed to parking",lot.parking(car2));
    }

    @Test
    public void should_return_success_to_get_car_when_the_car_in_lot() throws Exception {
        Lot lot = new Lot(1);
        Car car = new Car("1");
        lot.parking(car);
        assertEquals("success to get car",lot.getCar(car));
    }

    @Test
    public void should_return_failed_to_get_car_when_the_car_is_not_in_lot() throws Exception {
        Lot lot = new Lot(1);
        Car car = new Car("1");
        assertEquals("failed to get car",lot.getCar(car));

    }

    @Test
    public void should_return_success_to_parking_when_user_get_a_car_from_lot() throws Exception {
        Lot lot = new Lot(1);
        Car car = new Car("1");
        lot.parking(car);

        Car car2 = new Car("2");
        assertEquals("failed to parking",lot.parking(car2));

        lot.getCar(car);
        assertEquals("success to parking",lot.parking(car2));
    }
}