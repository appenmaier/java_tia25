# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is the lecture repository for the course _Programmieren mit Java_ (TIA25) — a Java programming course taught in German. It contains runnable demo programs that accompany each lecture session. The course documentation lives at [jappuccini.github.io/java-docs](https://jappuccini.github.io/java-docs/production/).

## Build and Run

This is a Maven project targeting Java 21.

```bash
# Compile
mvn compile

# Run a specific demo (example)
mvn exec:java -Dexec.mainClass="main.D01_JavaBasics"
mvn exec:java -Dexec.mainClass="main.D02_ObjectOrientedProgramming"

# Run tests
mvn test

# Run a single test class
mvn test -Dtest=SomeTestClass

# Package
mvn package
```

## Code Architecture

### Package Structure

- **`main`** — Demo entry points, one per lecture (`D01_JavaBasics`, `D02_ObjectOrientedProgramming`, …). Each `main` method is a self-contained walkthrough of the lecture topic, executed top to bottom.
- **`model`** — Domain classes used by the demos. Currently uses plain public fields (no encapsulation enforced yet) for pedagogical simplicity; later demos introduce getters/setters and access modifiers.
- **`utility`** — Static helper classes (e.g., `StringArrayHelper`) used to contrast procedural-style helpers against OOP-style instance methods before the course moves fully to OOP.

### Lecture–Demo Mapping

Each lecture in `skript/lectureNN.md` links directly to the demo class it covers. New demos are added as `D0N_<TopicName>.java` in `main`, with supporting model/utility classes alongside.

### Pedagogical Progression

The demos deliberately evolve Java idioms across lectures:

1. **D01** — imperative basics: primitives, `Scanner`, `if`/`switch`, loops, arrays (all public fields and procedural style).
2. **D02** — OOP introduction: classes with public fields (`FlightConnection`, `Flight`), static utility helpers (`StringArrayHelper`) vs. instance methods (`StringArray`), then encapsulation via getters/setters (`LightBulb`, `TableLight`).

Later demos will introduce Lombok annotations, JUnit 5 tests, Mockito, and JavaFX (all already on the classpath via `pom.xml`).
