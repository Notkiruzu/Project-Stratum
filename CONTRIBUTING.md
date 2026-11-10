# Contributing to Project Stratum

Thanks for your interest in contributing.

## Setup

1. Install JDK 25 (Temurin recommended).
2. Fork and clone the repository.
3. Run `./gradlew build` to confirm everything works before you change anything.

## Workflow

1. Create a branch from `main`, named `feat/short-description` or `fix/short-description`.
2. Make your change, with tests where it makes sense.
3. Run `./gradlew spotlessApply build` before pushing.
4. Open a pull request against `main`. CI must pass.

## Commit messages

We use [Conventional Commits](https://www.conventionalcommits.org/). Each message looks like this:

```
type: short description
```

Common types: `feat`, `fix`, `docs`, `build`, `ci`, `test`, `refactor`, `chore`.

## Code style

Formatting is automatic. Spotless applies Google Java Format, and CI fails on unformatted code. Compiler warnings are treated as errors.

## Licensing

By submitting a contribution, you agree that it is licensed under the Apache License 2.0, the same license as the project.