package com.example.unitconvertor.service;

public class LengthDemo extends Units {

    double total , res;

    @Override
    public double convert(double value, String from, String to) {
        if (from.equalsIgnoreCase("INCH") && to.equalsIgnoreCase("CENTIMETER")) {
            return value * 2.54;
        } else if (from.equalsIgnoreCase("INCH") && to.equalsIgnoreCase("FOOT")) {
            return value * 0.0833333;
        } else if (from.equalsIgnoreCase("INCH") && to.equalsIgnoreCase("METER")) {
            return value * 0.0254;
        } else if (from.equalsIgnoreCase("INCH") && to.equalsIgnoreCase("KILOMETER")) {
            return value * 2.54e-5;
        } else if (from.equalsIgnoreCase("CENTIMETER") && to.equalsIgnoreCase("INCH")) {
            return value * 0.393701;
        } else if (from.equalsIgnoreCase("CENTIMETER") && to.equalsIgnoreCase("FOOT")) {
            return value * 0.0328084;
        } else if (from.equalsIgnoreCase("CENTIMETER") && to.equalsIgnoreCase("METER")) {
            return value * 0.01;
        } else if (from.equalsIgnoreCase("CENTIMETER") && to.equalsIgnoreCase("KILOMETER")) {
            return value * 1e-5;
        } else if (from.equalsIgnoreCase("FOOT") && to.equalsIgnoreCase("INCH")) {
            return value * 12;
        } else if (from.equalsIgnoreCase("FOOT") && to.equalsIgnoreCase("CENTIMETER")) {
            return value * 30.48;
        } else if (from.equalsIgnoreCase("FOOT") && to.equalsIgnoreCase("METER")) {
            return value * 0.3048;
        } else if (from.equalsIgnoreCase("FOOT") && to.equalsIgnoreCase("KILOMETER")) {
            return value * 0.0003048;
        } else if (from.equalsIgnoreCase("METER") && to.equalsIgnoreCase("INCH")) {
            return value * 39.3701;
        } else if (from.equalsIgnoreCase("METER") && to.equalsIgnoreCase("CENTIMETER")) {
            return value * 100;
        } else if (from.equalsIgnoreCase("METER") && to.equalsIgnoreCase("FOOT")) {
            return value * 3.28084;
        } else if (from.equalsIgnoreCase("METER") && to.equalsIgnoreCase("KILOMETER")) {
            return value * 0.001;
        } else if (from.equalsIgnoreCase("KILOMETER") && to.equalsIgnoreCase("INCH")) {
            return value * 39370.1;
        } else if (from.equalsIgnoreCase("KILOMETER") && to.equalsIgnoreCase("CENTIMETER")) {
            return value * 100000;
        } else if (from.equalsIgnoreCase("KILOMETER") && to.equalsIgnoreCase("FOOT")) {
            return value * 3280.84;
        } else if (from.equalsIgnoreCase("KILOMETER") && to.equalsIgnoreCase("METER")) {
            return value * 1000;
        } else {
            return value;
        }
    }

    @Override
    public double addQuantity(double value1, double value2, String from, String to, String forRes) {
        total = value1 + value2;
        if (from.equalsIgnoreCase("Inch") && to.equalsIgnoreCase("Inch")) {
            switch (forRes) {
                case "Inch":
                    res = total;
                    break;
                case "Centimeter":
                    res = (total * 2.54);
                    break;
                case "Foot":
                    res = (total * 0.0833333);
                    break;
                case "Meter":
                    res = (total * 0.0254);
                    break;
                case "Kilometer":
                    res = (total * 2.54e-5);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Inch") && to.equalsIgnoreCase("Centimeter")) {
            total = (value1 * 2.54) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 0.393701);
                    break;
                case "Centimeter":
                    res = (total * 2.54);
                    break;
                case "Foot":
                    res = (total * 0.0833333);
                    break;
                case "Meter":
                    res = (total * 0.0254);
                    break;
                case "Kilometer":
                    res = (total * 2.54e-5);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Inch") && to.equalsIgnoreCase("Foot")) {
            total = (value1 * 0.0833333) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 12);
                    break;
                case "Centimeter":
                    res = (total * 30.48);
                    break;
                case "Foot":
                    res = (total / 12);
                    break;
                case "Meter":
                    res = (total * 0.3048);
                    break;
                case "Kilometer":
                    res = (total * 0.0003048);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Inch") && to.equalsIgnoreCase("Meter")) {
            total = (value1 * 0.0254) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 39.3701);
                    break;
                case "Centimeter":
                    res = (total * 100);
                    break;
                case "Foot":
                    res = (total * 3.28084);
                    break;
                case "Meter":
                    res = (total);
                    break;
                case "Kilometer":
                    res = (total * 2.54e-5);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Inch") && to.equalsIgnoreCase("Kilometer")) {
            total = (value1 * 2.54e-5) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 39370.1);
                    break;
                case "Centimeter":
                    res = (total * 100000);
                    break;
                case "Foot":
                    res = (total * 3280.84);
                    break;
                case "Meter":
                    res = (total * 1000);
                    break;
                case "Kilometer":
                    res = (total);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Centimeter") && to.equalsIgnoreCase("Centimeter")) {
            total = value1 + value2;
            switch (forRes) {
                case "Inch":
                    res = (total * 0.393701);
                    break;
                case "Centimeter":
                    res = (total);
                    break;
                case "Foot":
                    res = (total * 0.0833333);
                    break;
                case "Meter":
                    res = (total * 0.0254);
                    break;
                case "Kilometer":
                    res = (total * 2.54e-5);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Centimeter") && to.equalsIgnoreCase("Inch")) {
            total = (value1 * 0.393701) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total);
                    break;
                case "Centimeter":
                    res = (total * 2.54);
                    break;
                case "Foot":
                    res = (total * 0.0833333);
                    break;
                case "Meter":
                    res = (total * 0.0254);
                    break;
                case "Kilometer":
                    res = (total * 2.54e-5);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Centimeter") && to.equalsIgnoreCase("Foot")) {
            total = (value1 * 0.0328084) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 0.393701);
                    break;
                case "Centimeter":
                    res = (total * 2.54);
                    break;
                case "Foot":
                    res = (total * 0.0328084);
                    break;
                case "Meter":
                    res = (total * 0.01);
                    break;
                case "Kilometer":
                    res = (total * 1e-5);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Centimeter") && to.equalsIgnoreCase("Meter")) {
            total = (value1 * 0.01) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 39.3701);
                    break;
                case "Centimeter":
                    res = (total * 2.54);
                    break;
                case "Foot":
                    res = (total * 0.0328084);
                    break;
                case "Meter":
                    res = (total);
                    break;
                case "Kilometer":
                    res = (total * 1e-5);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Centimeter") && to.equalsIgnoreCase("Kilometer")) {
            total = (value1 * 1e-5) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 0.393701);
                    break;
                case "Centimeter":
                    res = (total * 2.54);
                    break;
                case "Foot":
                    res = (total * 0.0328084);
                    break;
                case "Meter":
                    res = (total * 0.01);
                    break;
                case "Kilometer":
                    res = (total);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Foot") && to.equalsIgnoreCase("Inch")) {
            total = (value1 * 12) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 12);
                    break;
                case "Centimeter":
                    res = (total * 30.48);
                    break;
                case "Foot":
                    res = (total);
                    break;
                case "Meter":
                    res = (total * 0.3048);
                    break;
                case "Kilometer":
                    res = (total * 0.0003048);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Foot") && to.equalsIgnoreCase("Centimeter")) {
            total = (value1 * 30.48) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 12);
                    break;
                case "Centimeter":
                    res = (total * 30.48);
                    break;
                case "Foot":
                    res = (total);
                    break;
                case "Meter":
                    res = (total * 0.3048);
                    break;
                case "Kilometer":
                    res = (total * 0.0003048);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Foot") && to.equalsIgnoreCase("Meter")) {
            total = (value1 * 0.3048) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 12);
                    break;
                case "Centimeter":
                    res = (total * 30.48);
                    break;
                case "Foot":
                    res = (total * 3.28084);
                    break;
                case "Meter":
                    res = (total * 0.3048);
                    break;
                case "Kilometer":
                    res = (total * 0.0003048);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Foot") && to.equalsIgnoreCase("Kilometer")) {
            total = (value1 * 0.0003048) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 39370.1);
                    break;
                case "Centimeter":
                    res = (total * 100000);
                    break;
                case "Foot":
                    res = (total * 3280.84);
                    break;
                case "Meter":
                    res = (total * 1000);
                    break;
                case "Kilometer":
                    res = (total);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Meter") && to.equalsIgnoreCase("Meter")) {
            total = (value1) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 0.393701);
                    break;
                case "Centimeter":
                    res = (total * 100);
                    break;
                case "Foot":
                    res = (total * 3.28084);
                    break;
                case "Meter":
                    res = (total);
                    break;
                case "Kilometer":
                    res = (total * 0.001);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Meter") && to.equalsIgnoreCase("Inch")) {
            total = (value1 * 39.3701) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 0.393701);
                    break;
                case "Centimeter":
                    res = (total * 100);
                    break;
                case "Foot":
                    res = (total * 3.28084);
                    break;
                case "Meter":
                    res = (total);
                    break;
                case "Kilometer":
                    res = (total * 0.001);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Meter") && to.equalsIgnoreCase("Centimeter")) {
            total = (value1 * 100) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 0.393701);
                    break;
                case "Centimeter":
                    res = (total * 100);
                    break;
                case "Foot":
                    res = (total * 3.28084);
                    break;
                case "Meter":
                    res = (total);
                    break;
                case "Kilometer":
                    res = (total * 0.001);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Meter") && to.equalsIgnoreCase("Foot")) {
            total = (value1 * 0.3048) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 0.393701);
                    break;
                case "Centimeter":
                    res = (total * 100);
                    break;
                case "Foot":
                    res = (total * 0.3048);
                    break;
                case "Meter":
                    res = (total);
                    break;
                case "Kilometer":
                    res = (total * 0.001);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Meter") && to.equalsIgnoreCase("Kilometer")) {
            total = (value1 * 0.001) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 39370.1);
                    break;
                case "Centimeter":
                    res = (total * 100000);
                    break;
                case "Foot":
                    res = (total * 3280.84);
                    break;
                case "Meter":
                    res = (total * 1000);
                    break;
                case "Kilometer":
                    res = (total);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Kilometer") && to.equalsIgnoreCase("Kilometer")) {
            total = (value1) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 39370.1);
                    break;
                case "Centimeter":
                    res = (total * 100000);
                    break;
                case "Foot":
                    res = (total * 0.0833333);
                    break;
                case "Meter":
                    res = (total * 1000);
                    break;
                case "Kilometer":
                    res = (total);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Kilometer") && to.equalsIgnoreCase("Inch")) {
            total = (value1 * 39370.1) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 39370.1);
                    break;
                case "Centimeter":
                    res = (total * 100000);
                    break;
                case "Foot":
                    res = (total * 0.0833333);
                    break;
                case "Meter":
                    res = (total * 1000);
                    break;
                case "Kilometer":
                    res = (total);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Kilometer") && to.equalsIgnoreCase("Centimeter")) {
            total = (value1 * 39370.1) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 39370.1);
                    break;
                case "Centimeter":
                    res = (total * 100000);
                    break;
                case "Foot":
                    res = (total * 0.0833333);
                    break;
                case "Meter":
                    res = (total * 1000);
                    break;
                case "Kilometer":
                    res = (total);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Kilometer") && to.equalsIgnoreCase("Foot")) {
            total = (value1 * 3280.84) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 39370.1);
                    break;
                case "Centimeter":
                    res = (total * 100000);
                    break;
                case "Foot":
                    res = (total * 0.0833333);
                    break;
                case "Meter":
                    res = (total * 1000);
                    break;
                case "Kilometer":
                    res = (total);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Kilometer") && to.equalsIgnoreCase("Meter")) {
            total = (value1 * 1000) + (value2);
            switch (forRes) {
                case "Inch":
                    res = (total * 39370.1);
                    break;
                case "Centimeter":
                    res = (total * 100000);
                    break;
                case "Foot":
                    res = (total * 0.0833333);
                    break;
                case "Meter":
                    res = (total * 1000);
                    break;
                case "Kilometer":
                    res = (total);
                    break;
            }
            return res;
        } else {
            return 0;
        }
    }
}

