package com.javafortesters.chapter16randomdata.examples;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RandomData {
    @Test
    public void randomNumber() {
        double rnd = Math.random();
        System.out.println(String.format("generated %f as random number", rnd));
        assertThat(rnd < 1.0d, is(true));
        assertThat(rnd >= 0.0d, is(true));
        Random generate = new Random();
        boolean randomBoolean = generate.nextBoolean();
        int randomInt = generate.nextInt();
        int randomntRange = generate.nextInt(12);
        long randomLong = generate.nextLong();
        double randomDouble = generate.nextDouble();
        byte[] bytes = new byte[generate.nextInt(100)];
        double randomGaussian = generate.nextGaussian();
        System.out.println(randomGaussian);

        int gausianInRangeCounter = 0;
        int limit = 100000000;
        for (int i = 0; i < limit; i++) {
            double v = new Random().nextGaussian();
            if (v >= -1.0 && v <= 1) {
                gausianInRangeCounter++;
            }
        }
        System.out.println(String.format("%.2f percent", (double) gausianInRangeCounter / limit * 100));

    }

    @Test
    public void exampleRandomDataTests() {
        int limit = 1000;
        Random generate = new Random();
        for (int i = 0; i < limit; i++) {
            int randomInt = generate.nextInt();
            assertThat(Integer.MAX_VALUE > randomInt && Integer.MIN_VALUE < randomInt, is(true));
            System.out.println(randomInt);
            boolean condition = generate.nextBoolean();
            assertThat(condition == true || condition == false, is(true));

        }
        int minValue = 15;
        int maxValue = 20;
        int randomIntRange = generate.nextInt(maxValue - minValue + 1) + minValue;
        assertThat(randomIntRange < maxValue, is(true));
        assertThat(randomIntRange > minValue, is(true));
    }
}
