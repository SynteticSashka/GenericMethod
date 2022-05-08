package edu.phoenix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplyTest {

  @Test
  void longTest() {
    Long l = 100L;
    var result = Application.multuply(l);
    assertEquals(l, result);
  }

  @Test
  void shortTest() {
    short s = 100;
    var result = (short) Application.multuply(s);
    assertEquals(s, result);
  }

  @Test
  void byteTest() {
    byte b = 100;
    var result = (byte) Application.multuply(b);
    assertEquals(b, result);
  }

  @Test
  void doubleTest() {
    double d = 10.1;
    var result = (double) Application.multuply(d);
    assertEquals((int) d, result);
  }
}
