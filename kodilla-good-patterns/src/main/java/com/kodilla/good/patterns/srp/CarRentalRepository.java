package com.kodilla.good.patterns.srp;


import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {

    @Override
    public void createRental(User user, LocalDateTime rentFrom, LocalDateTime rentTo) {
        System.out.println("Create Car rental" );
    }
}
