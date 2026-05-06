# radian-svc-session-hub

`radian-svc-session-hub` explores backend services with a small Kotlin codebase and local fixtures. The technical goal is to design a Kotlin verification harness for session systems, covering diagnostic reporting, negative fixtures, and failure-oriented tests.

## Why It Exists

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Radian Svc Session Hub Review Notes

`baseline` and `edge` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Features

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/radian-svc-session-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `queue pressure` and `worker slack`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture Notes

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `queue pressure`, `retry load`, `worker slack`, and `session drift`.

The Kotlin code keeps the review rule close to the tests.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The verifier is intentionally local. It should fail if the fixture score math, lane assignment, or language-specific test drifts.

## Limitations And Roadmap

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
