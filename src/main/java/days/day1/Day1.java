package days.day1;

import aoc.days.Day;
import aoc.parsing.ParsingUtils;

import java.util.List;

public class Day1 extends Day {
    private List<Integer> depths;

    public static void main(String[] args) {
        new Day1();
    }

    @Override
    public long part1() {
        int nIncreases = 0;
        for (int i = 1; i < depths.size(); i++) {
            if (depths.get(i) > depths.get(i - 1)) {
                nIncreases++;
            }
        }
        return nIncreases;
    }

    @Override
    public long part2() {
        return 0;
    }

    @Override
    public void setup() {
        depths = ParsingUtils.stringsToIntegers(lines);
    }
}
