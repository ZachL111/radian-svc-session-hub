# radian-svc-session-hub

`radian-svc-session-hub` is a Kotlin project for Backend services. It turns design a Kotlin verification harness for session systems, covering diagnostic reporting, negative fixtures, and failure-oriented tests into a small local model with readable fixtures and a direct verification command.

## Reading Radian Svc Session Hub

Start with the README, then open `metadata/project.json` to check the constants behind the examples. After that, `fixtures/cases.csv` shows the compact path and `examples/extended_cases.csv` gives a wider look at the same rule.

## What It Does

- Includes extended examples for queue pressure, including `recovery` and `degraded`.
- Documents bounded workers tradeoffs in `docs/operations.md`.
- Runs locally with a single verification command and no external credentials.
- Stores project constants and verification metadata in `metadata/project.json`.
- Adds a repository audit script that checks structure before running the language verifier.

## Purpose

The repository exists to keep a technical idea small enough to reason about. The implementation avoids external dependencies where possible, then uses fixtures to make changes easy to review.

## Files Worth Reading

- `src`: primary implementation
- `tests`: verification harness
- `fixtures`: compact golden scenarios
- `examples`: expanded scenario set
- `metadata`: project constants and verification metadata
- `docs`: operations and extension notes
- `scripts`: local verification and audit commands

## Design Sketch

The design is intentionally direct: parse or construct a signal, score it, classify it, and verify the expected branch. This makes the repository useful for studying backend services behavior without needing a service or database unless the language project itself is SQL. The Kotlin version keeps data classes and model logic close together for a JVM-friendly core.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

This runs the language-level build or test path against the compact fixture set.

## Fixture Notes

`examples/extended_cases.csv` adds six named cases. I kept the names plain so failures are easy to read in a terminal: baseline, pressure, surge, degraded, recovery, and boundary.

## Verification

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/audit.ps1
```

The audit command checks repository structure and README constraints before it delegates to the verifier.

## Limits

The scoring model is simple by design. More domain-specific behavior should be added through explicit adapters or extra fixture classes rather than hidden constants.

## Next Directions

- Split the scoring constants into a typed configuration object and validate it before use.
- Add a comparison mode that shows how decisions change when one signal is adjusted.
- Add a loader for `examples/extended_cases.csv` and promote selected cases into the language test suite.
- Add one more backend services fixture that focuses on a malformed or borderline input.

## Setup

Clone the repository, enter the directory, and run the verifier. No database server, cloud account, or token is required.
