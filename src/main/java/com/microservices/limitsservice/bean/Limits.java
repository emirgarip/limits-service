package com.microservices.limitsservice.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Limits {

    private int min;
    private int max;


    public Limits(int min, int max) {
        this.min = min;
        this.max = max;
    }

}
