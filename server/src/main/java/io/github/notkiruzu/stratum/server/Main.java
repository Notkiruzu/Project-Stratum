package io.github.notkiruzu.stratum.server;

import io.github.notkiruzu.stratum.protocol.MinecraftVersion;

public final class Main {
  private Main() {}

  public static void main(String[] args) {
    System.out.println(
        "Project Stratum targeting Minecraft "
            + MinecraftVersion.NAME
            + " (protocol "
            + MinecraftVersion.PROTOCOL
            + ")");
  }
}
