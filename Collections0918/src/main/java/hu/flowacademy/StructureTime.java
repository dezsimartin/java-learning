package hu.flowacademy;

import java.util.*;

/*public class StructureTime {
    private double[] numbers = new double[]{
            Math.pow(10, 0),
            Math.pow(10, 1),
            Math.pow(10, 2),
            Math.pow(10, 3),
            Math.pow(10, 4),
            Math.pow(10, 5),
            Math.pow(10, 6),
            *//* Math.pow(10, 7),*//*
            *//*Math.pow(10, 8)*//*
    };

    List<Integer> stash;
    Set<Integer> stashSet;
    private double start;
    private double end;
    private double elapsedTime;
    private double[][] timing = new double[2][7];
    private double[][] testHashSet = new double[2][7];

    public double[][] timeOfMyLife() {

        for (int i = 0; i < numbers.length; i++) {
            stash = new List<Integer>();
            start = (double) System.currentTimeMillis();
            for (int j = 0; j < numbers[i]; j++) {
                Integer rng = new Random().nextInt();
                stash.add(rng);
            }
            end = (double) System.currentTimeMillis();
            elapsedTime = end - start;
            timing[1][i] = elapsedTime;
            timing[0][i] = numbers[i];
            *//*System.out.println(timing[0][i] + " " + timing[1][i]);
            System.out.println(contains(6, stash));*//*
        }
        return timing;
    }

    public boolean contains(Integer value, List arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == value) {
                return true;
            }
        }
        return false;
    }

    public double[][] timeForFourFor() {
        for (int i = 0; i < numbers.length; i++) {
            stashSet = new HashSet<>();
            start = (double) System.currentTimeMillis();
            for (int j = 0; j < numbers[i]; j++) {
                Integer rng = new Random().nextInt();
                stashSet.add(rng);
            }
            end = (double) System.currentTimeMillis();
            elapsedTime = end - start;
            testHashSet[1][i] = elapsedTime;
            testHashSet[0][i] = numbers[i];
          *//*  System.out.println(timing[2][i] + " " + timing[3][i]);*//*
        }

        return testHashSet;
    }*/



