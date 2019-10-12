package com.speedment.example.solution;

import com.speedment.example.unit.Unit3Terminal;
import org.junit.jupiter.api.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

import static com.speedment.example.solution.TestUtil.tester;
import static java.util.stream.Collectors.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
final class Unit3MyTerminalTest {

    private static final List<String> ABC = Arrays.asList("A", "B", "C");
    private static final List<String> THE_RAIN_IN_SPAIN = Arrays.asList("The", "rain", "in", "Spain", "stays");
    private static final List<String> BEATLES_AND_ABBA = Arrays.asList("Beatles", "Abba");

    private final Unit3Terminal instance = new Unit3MyTerminal();

    @Test
    @Order(0)
    void addToSet() {
        final Set<String> actual = new HashSet<>();
        instance.addToSet(ABC.stream(), actual);
        tester(new HashSet<>(ABC), actual);
    }

    @Test
    @Order(1)
    void addToList() {
        final List<String> actual = new ArrayList<>();
        instance.addToListInOrder(ABC.stream(), actual);
        tester(ABC, actual);
    }

    @Test
    @Order(2)
    void collectToSet() {
        tester(new HashSet<>(ABC), instance.collectToSet(ABC.stream()));
    }

    @Test
    @Order(3)
    void collectToList() {
        tester(new ArrayList<>(ABC), instance.collectToList(ABC.stream()));
    }

    @Test
    @Order(4)
    void collectJoining() {
        final List<String> text = Arrays.asList("Edit", "Search", "Search and Replace");
        tester(String.join("->", text), instance.collectJoining(text.stream()));
    }

    @Test
    @Order(5)
    void toArray() {
        tester(ABC.toArray(new String[0]), instance.toArray(ABC.stream()), Assertions::assertArrayEquals);
    }

    @Test
    @Order(6)
    void collectToMap() {
        tester(BEATLES_AND_ABBA.stream().collect(toMap(Function.identity(), String::length)), instance.collectToMap(BEATLES_AND_ABBA.stream()));
    }

    @Test
    @Order(7)
    void countCharacters() {
        tester(THE_RAIN_IN_SPAIN.stream().mapToInt(String::length).sum(), instance.countCharacters(THE_RAIN_IN_SPAIN.stream()));
    }

    @Test
    @Order(8)
    void maxWordLen() {
        tester(THE_RAIN_IN_SPAIN.stream().mapToInt(String::length).max().orElse(0), instance.maxWordLen(THE_RAIN_IN_SPAIN.stream()));
        tester(0, instance.maxWordLen(Stream.empty()));
    }

    @Test
    @Order(9)
    void statistics() {
        tester(THE_RAIN_IN_SPAIN.stream().mapToInt(String::length).summaryStatistics(), instance.statistics(THE_RAIN_IN_SPAIN.stream()), Unit3MyTerminalTest::assertIntSummaryStatisticsEquals);
    }

    @Test
    @Order(10)
    void findLongestString() {
        tester(THE_RAIN_IN_SPAIN.stream().reduce((a, b) -> a.length() >= b.length() ? a : b), instance.findLongestString(THE_RAIN_IN_SPAIN.stream()));
        tester(Optional.empty(), instance.findLongestString(Stream.empty()));
    }

    @Test
    @Order(11)
    void wordsGroupedByLength() {
        tester(THE_RAIN_IN_SPAIN.stream().collect(groupingBy(String::length)), instance.wordsGroupedByLength(THE_RAIN_IN_SPAIN.stream()));
    }

    @Test
    @Order(12)
    void wordsGroupedByLengthCounted() {
        tester(THE_RAIN_IN_SPAIN.stream().collect(groupingBy(String::length, counting())), instance.wordsGroupedByLengthCounted(THE_RAIN_IN_SPAIN.stream()));
    }

    static void assertIntSummaryStatisticsEquals(IntSummaryStatistics a, IntSummaryStatistics b) {
        if (a.getCount() == b.getCount()) {
            return;
        }
        if (a.getSum() == b.getSum()) {
            return;
        }
        if (a.getMin() == b.getMin()) {
            return;
        }
        if (a.getMax() == b.getMax()) {
            return;
        }
        if (a.getAverage() == b.getAverage()) {
            return;
        };
        Assertions.assertEquals(a, b);
    }


}