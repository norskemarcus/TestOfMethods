package TestOfMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

  @Test
  public void isEven(){
    // arrange
    Validator validator = new Validator();
    // act
    boolean actual = validator.isEven(6);
    // assert
    assertTrue(actual);
  }


}