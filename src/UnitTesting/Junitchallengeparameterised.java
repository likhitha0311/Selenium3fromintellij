package UnitTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Junitchallengeparameterised
{
    private JunitChallenge junitChallenge;
    @BeforeEach
    public void setUp()
    {
        junitChallenge = new JunitChallenge();
        System.out.println("Set Up method");
    }

    public static Stream<Arguments> testConditions() {
        return Stream.of(
                Arguments.of( "AABBCCDDEF","ABCDEF"),
                Arguments.of( "ACVVVYYRRTDSSF","ACVYRTDSF"),
                Arguments.of( "A","A"),
                Arguments.of( "112233445566","123456")

        );
    }
    @ParameterizedTest(name = "Run {index}: s={0},expected={1}")
    @MethodSource("testConditions")
    public void removePairs(String s,String expected)
    {
        assertEquals(expected,junitChallenge.removePairs(s));
    }
}