package TestOfMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

  @Test
  public void test_isEven_with_evenNumber(){
    // arrange
    Validator validator = new Validator();
    // act
    boolean actual = validator.isEven(6);
    // assert
    assertTrue(actual);
  }


  @Test
  public void test_isEven_with_oddNumber(){
    // arrange
    Validator validator = new Validator();
    // act
    boolean actual = validator.isEven(7);
    // assert
    assertFalse(actual);
  }


}