package aoc21.days.day2;

import aoc.days.Day;

import java.util.ArrayList;
import java.util.List;

public class Day2 extends Day {
    private List<Instruction> instructions;

    @Override
    public long part1() {
        Submarine submarine = new Submarine(new Engine1());
        for (Instruction instruction : instructions) {
            submarine.move(instruction);
        }
        return submarine.getDepth() * submarine.getHorizontalPosition();
    }

    @Override
    public long part2() {
        Submarine submarine = new Submarine(new Engine2());
        for (Instruction instruction : instructions) {
            submarine.move(instruction);
        }
        return submarine.getDepth() * submarine.getHorizontalPosition();
    }

    @Override
    public void setup() {
        instructions = new ArrayList<>();
        for (String line : lines) {
            String[] tokens = line.split(" ");
            Direction direction;
            switch (tokens[0]) {
                case "forward" -> direction = Direction.FORWARD;
                case "up" -> direction = Direction.UP;
                case "down" -> direction = Direction.DOWN;
                default -> throw new IllegalArgumentException();
            }
            int distance = Integer.parseInt(tokens[1]);
            instructions.add(new Instruction(direction, distance));
        }
    }
}
