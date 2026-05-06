# Review Journal

The repository goal stays the same: design a Kotlin verification harness for session systems, covering diagnostic reporting, negative fixtures, and failure-oriented tests. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its backend services focus without claiming live deployment or external usage.

## Cases

- `baseline`: `queue pressure`, score 182, lane `ship`
- `stress`: `retry load`, score 172, lane `ship`
- `edge`: `worker slack`, score 113, lane `watch`
- `recovery`: `session drift`, score 139, lane `watch`
- `stale`: `queue pressure`, score 131, lane `watch`

## Note

A future change should add new cases before it changes the scoring rule.
