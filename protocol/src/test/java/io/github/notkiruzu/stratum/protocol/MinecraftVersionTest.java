package io.github.notkiruzu.stratum.protocol;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinecraftVersionTest {
  @Test
  void targetsPinnedRelease() {
    assertEquals("26.3", MinecraftVersion.NAME);
    assertEquals(777, MinecraftVersion.PROTOCOL);
  }
}
