package UnitTesting;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class JunitChallengeTest {
    private JunitChallenge junitChallenge;
    @BeforeEach
    public void setUp()
    {
        junitChallenge = new JunitChallenge();
        System.out.println("Set Up method");
    }
    @Before
    public void setUpMethod()
    {
        junitChallenge = new JunitChallenge();
        System.out.println("Set Up method of Before");
    }
    public static Stream<Arguments> testConditions() {
        return Stream.of(
                Arguments.of( "AABBCCDDEF","ABCDEF")
          ,
                Arguments.of( "ACVVVYYRRTDSSF","ACVYRTDSF"),
                Arguments.of( "ACV V VY YRRTDSSF","ACVYRTDSF")

        );
    }
    @ParameterizedTest(name = "Run {index}: s={0},expected={1}")
    @MethodSource("testConditions")
    public void removePairs(String s,String expected)
    {
        assertEquals(expected,junitChallenge.removePairs(s));
    }
    @Test
    public void removePairsNegative()
    {
        assertEquals(null,junitChallenge.removePairs(null));
        assertEquals("A",junitChallenge.removePairs("A"));

    }
    @Test
 public   void converter() {
        int output= junitChallenge.converter(10,5);
        assertEquals(300,output);
    }

    @Test(expected= ArithmeticException.class)
    public   void converter_exception() {
        //int output= junitChallenge.converter(10,0);
        int outpu2= junitChallenge.converter(10,1);

    }



    @Test
   public void nullifoddlength() {
       String result = junitChallenge.nullifoddlength("APPLE");
       assertEquals(null,result);
        String result1 = junitChallenge.nullifoddlength("APPLEs");
        assertEquals("APPLEs",result1);
    }
}