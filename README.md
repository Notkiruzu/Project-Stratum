# Project Stratum

[![CI](https://github.com/Notkiruzu/Project-Stratum/actions/workflows/ci.yml/badge.svg)](https://github.com/Notkiruzu/Project-Stratum/actions/workflows/ci.yml)
[![License: Apache 2.0](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](LICENSE)

A from-scratch, region-sharded Minecraft: Java Edition server designed to scale horizontally.

> **Status: early development.** Nothing here is usable yet. Expect breaking changes.

> Project Stratum is not affiliated with, endorsed by, or associated with Mojang Studios or Microsoft. "Minecraft" is a trademark of Mojang Studios.

## Target version

|  Item| Value|
|---|---|
| Minecraft: Java Edition | 26.3 |
| Protocol version | 777 |
| Data version | 5023 |
| Java | 25 |

The target version is pinned on purpose and will not change during early development.

## Project layout

| Module | Purpose |
|---|---|
| `protocol` | Protocol constants, and later packet definitions and codecs |
| `server` | Server entry point |

More modules will be added as the project grows.

## Building

Requirements: JDK 25. You do not need to install Gradle, because the repository includes the Gradle wrapper.

```
./gradlew build          # compile, test, check formatting
./gradlew :server:run    # run the server
./gradlew spotlessApply  # auto-format the code
```

On Windows, use `gradlew` instead of `./gradlew`.

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md).

## License

Licensed under the [Apache License 2.0](LICENSE).