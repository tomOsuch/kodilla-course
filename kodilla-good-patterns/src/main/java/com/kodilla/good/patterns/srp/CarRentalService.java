package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {

    @Override
    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {

        return true;
    }
}
