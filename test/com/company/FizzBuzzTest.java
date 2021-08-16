package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
@Test
    void test1(){
    String expected = "1";
    String actual = FizzBuzz.showFizzBuzz(1);
    assertEquals(expected,actual);
}
@Test
    void test2(){
    String expected = FizzBuzz.FIZZ;
    String actual = FizzBuzz.showFizzBuzz(3);
    assertEquals(expected,actual);
}
@Test
    void test3(){
    String expected = "4";
    String actual = FizzBuzz.showFizzBuzz(4);
    assertEquals(expected,actual);
}
@Test
    void test4(){
    String expected = "BUZZ";
    String actual = FizzBuzz.showFizzBuzz(5);
    assertEquals(expected,actual);
}
@Test
    void test5(){
    String expected = "FIZZBUZZ";
    String actual = FizzBuzz.showFizzBuzz(30);
    assertEquals(expected,actual);
}
}