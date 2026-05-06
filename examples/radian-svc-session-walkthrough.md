# Radian Svc Session Hub Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 182 | ship |
| stress | retry load | 172 | ship |
| edge | worker slack | 113 | watch |
| recovery | session drift | 139 | watch |
| stale | queue pressure | 131 | watch |

Start with `baseline` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `queue pressure` against `worker slack`, not the raw score alone.
