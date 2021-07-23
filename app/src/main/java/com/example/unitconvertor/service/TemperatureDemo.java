package com.example.unitconvertor.service;

public class TemperatureDemo extends Units {
    double res, total;

    @Override
    public double convert(double value, String from, String to) {
        if (from.equalsIgnoreCase("Celsius") && to.equalsIgnoreCase("Fahrenheit")) {
            return value * 33.8;
        } else if (from.equalsIgnoreCase("Celsius") && to.equalsIgnoreCase("Kelvin")) {
            return value * 274.15;
        } else if (from.equalsIgnoreCase("Fahrenheit") && to.equalsIgnoreCase("Celsius")) {
            return value * -17.2222;
        } else if (from.equalsIgnoreCase("Fahrenheit") && to.equalsIgnoreCase("Kelvin")) {
            return value * 255.928;
        } else if (from.equalsIgnoreCase("Kelvin") && to.equalsIgnoreCase("Celsius")) {
            return value * -272.15;
        } else if (from.equalsIgnoreCase("Kelvin") && to.equalsIgnoreCase("Fahrenheit")) {
            return value * -457.87;
        } else {
            return 0;
        }
    }

    @Override
    public double addQuantity(double value1, double value2, String from, String to, String forRes) {
        if (from.equalsIgnoreCase("Celsius") && to.equalsIgnoreCase("Celsius")) {
            total = (value1) + (value2);
            switch (forRes) {
                case "Celsius":
                    res = (total);
                    break;
                case "Fahrenheit":
                    res = (total * 33.8);
                    break;
                case "Kelvin":
                    res = (total * 274.15);
                    break;
            }
            return res;
        }else if (from.equalsIgnoreCase("Celsius") && to.equalsIgnoreCase("Fahrenheit")) {
            total = (value1 * 33.8)  + (value2);
            switch (forRes) {
                case "Celsius":
                    res = (total * -17.2222);
                    break;
                case "Fahrenheit":
                    res = (total * 33.8);
                    break;
                case "Kelvin":
                    res = (total * 274.15);
                    break;
            }
            return res;
        }else if (from.equalsIgnoreCase("Celsius") && to.equalsIgnoreCase("Kelvin")) {
            total = (value1 * 274.15)  + (value2);
            switch (forRes) {
                case "Celsius":
                    res = (total * -17.2222);
                    break;
                case "Fahrenheit":
                    res = (total * 33.8);
                    break;
                case "Kelvin":
                    res = (total * 274.15);
                    break;
            }
            return res;
        }else if (from.equalsIgnoreCase("Fahrenheit") && to.equalsIgnoreCase("Fahrenheit")) {
            total = (value1)  + (value2);
            switch (forRes) {
                case "Celsius":
                    res = (total * -17.2222);
                    break;
                case "Fahrenheit":
                    res = (total);
                    break;
                case "Kelvin":
                    res = (total * 255.928);
                    break;
            }
            return res;
        }else if (from.equalsIgnoreCase("Fahrenheit") && to.equalsIgnoreCase("Celsius")) {
            total = (value1 * -17.2222)  + (value2);
            switch (forRes) {
                case "Celsius":
                    res = (total * -17.2222);
                    break;
                case "Fahrenheit":
                    res = (total * 33.8);
                    break;
                case "Kelvin":
                    res = (total * 255.928);
                    break;
            }
            return res;
        }else if (from.equalsIgnoreCase("Fahrenheit") && to.equalsIgnoreCase("Kelvin")) {
            total = (value1 * 274.15)  + (value2);
            switch (forRes) {
                case "Celsius":
                    res = (total * -17.2222);
                    break;
                case "Fahrenheit":
                    res = (total * 33.8);
                    break;
                case "Kelvin":
                    res = (total * 255.928);
                    break;
            }
            return res;
        }else if (from.equalsIgnoreCase("Kelvin") && to.equalsIgnoreCase("Kelvin")) {
            total = (value1)  + (value2);
            switch (forRes) {
                case "Celsius":
                    res = (total * -272.1496);
                    break;
                case "Fahrenheit":
                    res = (total * -457.86928);
                    break;
                case "Kelvin":
                    res = (total);
                    break;
            }
            return res;
        }else if (from.equalsIgnoreCase("Kelvin") && to.equalsIgnoreCase("Celsius")) {
            total = (value1 * -272.1496)  + (value2);
            switch (forRes) {
                case "Celsius":
                    res = (total * -272.1496);
                    break;
                case "Fahrenheit":
                    res = (total * -457.86928);
                    break;
                case "Kelvin":
                    res = (total*274.15);
                    break;
            }
            return res;
        }else if (from.equalsIgnoreCase("Kelvin") && to.equalsIgnoreCase("Fahrenheit")) {
            total = (value1 * -457.87)  + (value2);
            switch (forRes) {
                case "Celsius":
                    res = (total * -17.2222);
                    break;
                case "Fahrenheit":
                    res = (total * 33.8);
                    break;
                case "Kelvin":
                    res = (total * 255.928);
                    break;
            }
            return res;
        }else{
            return 0;
        }
    }
}
