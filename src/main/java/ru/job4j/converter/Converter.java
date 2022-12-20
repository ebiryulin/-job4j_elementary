package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 65;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        in = 195;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("195 rubles are 3 dollars. Test result : " + passed);
    }
}
