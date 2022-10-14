import java.util.Scanner;

public class Day01 {
    private static int move(char c) {
        switch (c) {
            case '(':
                return 1;
            case ')':
                return -1;
            default:
                return 0;
        }
    }

    private static int part1(String input) {
        int floor = 0;
        for (char c : input.toCharArray()) {
            floor += move(c);
        }
        return floor;
    }

    private static int part2(String input) {
        int floor = 0;
        int position = 0;
        while (true) {
            floor += move(input.charAt(position));
            position++;
            if (floor == -1)
                return position;
        }
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine();

        System.out.println("Part 1: " + part1(input));
        System.out.println("Part 2: " + part2(input));

        scanner.close();
    }

}