package net.mrchar.demo.gradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MainTest {
  @Test
  void testMain() {
    assertDoesNotThrow(
        () -> {
          Main.main(null);
        });
  }
}
