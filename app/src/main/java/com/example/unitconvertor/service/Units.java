package com.example.unitconvertor.service;

public abstract class Units {

    public abstract double convert(double value, String from, String to);

    public abstract double addQuantity(double value1, double value2, String from, String to, String forRes);

}
