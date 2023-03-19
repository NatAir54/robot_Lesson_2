package com.ua.robot.hw19;

import java.util.*;

public class MySet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        NavigableSet<Integer> treeSet = new TreeSet<>();

        RandomGenerator randomGenerator = new RandomGenerator();
        for (Integer randomValue : randomGenerator) {
            hashSet.add(randomValue);
            linkedHashSet.add(randomValue);
            treeSet.add(randomValue);
        }
        System.out.println("HashSet: ");
        System.out.println(hashSet);
        System.out.println("LinkedHashSet: ");
        System.out.println(linkedHashSet);
        System.out.println("TreeSet: ");
        System.out.println(treeSet);
    }
}

class RandomGenerator implements Iterable<Integer> {
    private static final Random RANDOM = new Random();

    int generate() {
        return RANDOM.nextInt(1, 51);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Integer> {
        private int maxIteration = 1000;
        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < maxIteration;
        }

        @Override
        public Integer next() {
            count++;
            return generate();
        }
    }

}
