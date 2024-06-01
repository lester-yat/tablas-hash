package com.lester.geohash.util;

public class TimeMeasure {
    long startTime = System.currentTimeMillis();
    // Perform the search
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
}
