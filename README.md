Un interprete per il linguaggio **Sigma**, implementato in Java e basato su ANTLR4.

---

## 🔍 Descrizione del progetto

Questo progetto fornisce:

- **Parser** e **Lexer** generati da ANTLR4 a partire dalla grammatica `Sigma.g4`.
- Un **albero di analisi sintattica** (AST) altamente modulare.
- Un **interprete** in Java capace di eseguire programmi scritti in Sigma.
- Supporto per:
  - Tipi primitivi: **STRING**, **FLOAT**, **ARRAY**
  - Espressioni aritmetiche e boolean
  - Costrutti di controllo: `if/else`, `while`, `for … in`
  - Definizione e chiamata di funzioni
  - Input/Output (`print`, `input`)
  - Operazioni speciali “BF” con `sly { … } arnold`
  - Espressioni nondeterministiche con `ND`

---
