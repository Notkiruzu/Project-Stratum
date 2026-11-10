# Devlog

A dated entry per session: what I built, what broke, what fixed it.

## 2026-11-10: Repository setup

**Done**
- Created the repository with an Apache 2.0 license, README and CONTRIBUTING.
- Pinned the target: Minecraft Java Edition 26.3, protocol 777, Java 25.
- Set up a multi-module Gradle build (`protocol`, `server`) with the wrapper, JUnit, and Spotless formatting.
- Added CI on every push and pull request, Dependabot, and branch protection on `main`.
- Turned the roadmap into 5 milestones and 22 issues.

**What went wrong**
- Windows picked the Oracle JDK 21 ahead of Temurin 25 on the PATH. The system PATH wins over the user PATH, so the fix was reordering the system entries.
- The `protocol` module's build file was a copy of the `server` one, which made it depend on itself and produced a circular dependency error.


**Next**
- Finish Stage 0: run the vanilla reference server and capture its handshake and login packets.