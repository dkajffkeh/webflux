package com.patrick.reactiveweb.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@RequiredArgsConstructor
@Getter
public class Customer {

    @Id
    private Long id;

    private final String firstName;

    private final String lastName;

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
