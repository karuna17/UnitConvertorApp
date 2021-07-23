package com.example.unitconvertor.service;

public class WeightDemo extends Units {
    double res, total;

    @Override
    public double convert(double value, String from, String to) {
        if (from.equalsIgnoreCase("Kilogram") && to.equalsIgnoreCase("Gram")) {
            return value * 1000;
        } else if (from.equalsIgnoreCase("Kilogram") && to.equalsIgnoreCase("Miligram")) {
            return value * 1000000;
        } else if (from.equalsIgnoreCase("Gram") && to.equalsIgnoreCase("Kilogram")) {
            return value * 0.001;
        } else if (from.equalsIgnoreCase("Gram") && to.equalsIgnoreCase("Miligram")) {
            return value * 1000;
        } else if (from.equalsIgnoreCase("Miligram") && to.equalsIgnoreCase("Gram")) {
            return value * 0.001;
        } else if (from.equalsIgnoreCase("Miligram") && to.equalsIgnoreCase("Kilogram")) {
            return value * 0.000001;
        } else {
            return 0;
        }
    }

    @Override
    public double addQuantity(double value1, double value2, String from, String to, String forRes) {

        if (from.equalsIgnoreCase("Kilogram") && to.equalsIgnoreCase("Kilogram")) {
            total = (value1) + (value2);
            switch (forRes) {
                case "Gram":
                    res = (total * 1000);
                    break;
                case "Kilogram":
                    res = (total);
                    break;
                case "Miligram":
                    res = (total * 1e+6);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Kilogram") && to.equalsIgnoreCase("Gram")) {
            total = (value1 * 1000) + (value2);
            switch (forRes) {
                case "Gram":
                    res = (total * 1000);
                    break;
                case "Kilogram":
                    res = (total);
                    break;
                case "Miligram":
                    res = (total * 1000000);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Kilogram") && to.equalsIgnoreCase("Miligram")) {
            total = (value1 * 1000000) + (value2);
            switch (forRes) {
                case "Gram":
                    res = (total * 1000);
                    break;
                case "Kilogram":
                    res = (total);
                    break;
                case "Miligram":
                    res = (total * 1000000);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Gram") && to.equalsIgnoreCase("Gram")) {
            total = (value1) + (value2);
            switch (forRes) {
                case "Gram":
                    res = (total);
                    break;
                case "Kilogram":
                    res = (total * 0.001);
                    break;
                case "Miligram":
                    res = (total * 1000);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Gram") && to.equalsIgnoreCase("Kilogram")) {
            total = (value1 * 0.001) + (value2);
            switch (forRes) {
                case "Gram":
                    res = (total * 1000);
                    break;
                case "Kilogram":
                    res = (total * 0.001);
                    break;
                case "Miligram":
                    res = (total * 1000000);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Gram") && to.equalsIgnoreCase("Miligram")) {
            total = (value1 * 1000) + (value2);
            switch (forRes) {
                case "Gram":
                    res = (total);
                    break;
                case "Kilogram":
                    res = (total * 0.001);
                    break;
                case "Miligram":
                    res = (total * 1000);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Miligram") && to.equalsIgnoreCase("Miligram")) {
            total = (value1) + (value2);
            switch (forRes) {
                case "Gram":
                    res = (total * 0.001);
                    break;
                case "Kilogram":
                    res = (total * 0.000001);
                    break;
                case "Miligram":
                    res = (total);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Miligram") && to.equalsIgnoreCase("Gram")) {
            total = (value1 * 0.001) + (value2);
            switch (forRes) {
                case "Gram":
                    res = (total);
                    break;
                case "Kilogram":
                    res = (total * 1e-6);
                    break;
                case "Miligram":
                    res = (total * 0.000001);
                    break;
            }
            return res;
        } else if (from.equalsIgnoreCase("Miligram") && to.equalsIgnoreCase("Kilogram")) {
            total = (value1 * 0.000001) + (value2);
            switch (forRes) {
                case "Gram":
                    res = (total * 0.001);
                    break;
                case "Kilogram":
                    res = (total);
                    break;
                case "Miligram":
                    res = (total * 0.000001);
                    break;
            }
            return res;
        } else {
            return 0;
        }
    }
}
