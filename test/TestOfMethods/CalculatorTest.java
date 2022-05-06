package TestOfMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void sumPositiveNumbers() {
    // arrange
    Calculator calculator = new Calculator();
    // act
    int actual = calculator.sum(1, 2);
    // assert
    int expected = 3;
    assertEquals(expected, actual); // bruge assert indebygde funktioner

  }

    @Test
    void sumNegativeNumbers() {
      // arrange
      Calculator calculator = new Calculator();
      // act
      int actual = calculator.sum(-1,2);
      // assert
      int expected = 1;
      assertEquals(expected, actual); // bruge assert indebygde funktioner

  }

  @Test
  void sumVeryLargeNumbers() {
    // arrange
    Calculator calculator = new Calculator();
    // act
    assertThrows(IllegalArgumentException.class, () -> { // Jeg forventer en exception
      calculator.sum(Integer.MAX_VALUE, Integer.MAX_VALUE);
    });

    // assert
    //int expected = -3;
    // assertEquals(expected, actual); // bruge assert indebygde funktioner

  }


  @Test
  void sumTooLargeNumbers() {
    // arrange
    Calculator calculator = new Calculator();
    // act
    assertThrows(IllegalArgumentException.class, () -> { // Når jeg forventer en exception, kan man teste det
      calculator.sum(101, 101);
    });

    // assert
    //int expected = -3;
    // assertEquals(expected, actual); // bruge assert sine indebygde funktioner i stedet for if-sætninger!

  }



}