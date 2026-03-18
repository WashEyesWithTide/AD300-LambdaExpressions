import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
        System.out.println("Division: " + division.operate(10, 5));

        //Sort String List
        List<String> strings = new ArrayList<>();
        strings.add("Banana");
        strings.add("Apple");
        strings.add("Cherry");
        strings.add("Mango");
        strings.add("Blueberry");

        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted Strings: " + strings);

        //Filter int List
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println("Odd Numbers: " + oddNumbers);

        //Predicate
        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println("Is empty string: " + isEmpty.test(""));
        System.out.println("Is empty string: " + isEmpty.test("Hello"));

        //Function
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.apply("hello world"));

        //Compose Functions
        Function<Integer, Integer> addOne = x -> x + 1;
        Function<Integer, Integer> multiplyByTen = x -> x * 10;

        Function<Integer, Integer> composedFunction = addOne.andThen(multiplyByTen);
        System.out.println("Composed Function Result: " + composedFunction.apply(5)); // should return 60

        //String Operation
        StringOperation concatenate = (s1, s2) -> s1 + s2;
        StringOperation findLonger = (s1, s2) -> s1.length() > s2.length() ? s1 : s2;

        System.out.println("Concatenation: " + concatenate.apply("Hello, ", "World!"));
        System.out.println("Longer String: " + findLonger.apply("Hello", "World!"));
    }
}