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

## Esempio di programma scritto in Sigma

```
@ FUNC greet( STRING who ) {
    ret STRING : "Hello, " + who + "!";
}
@ MAIN {

    // dichiarazioni base
    @ FLOAT  a   : input();
    @ FLOAT  b   : 2;
    @ STRING s   : greet("Sigma");
    print(s);                   // → Hello, Sigma!

    // espressioni aritmetiche + funzione float to string
    @ FLOAT ss  : a / b + a * b;
    print("calc=" + {ss});             // { … } = str(float)

    //if / else con confronto numerico
    if (ss > 20) {
        print("big");
    } else {
        print("small");
    }

    /* ── array literal + ridefinizione elemento ───────── */
    @ ARRAY ~ FLOAT arr : [1 ~ 2 ~ 3];
    arr[1] : 42;                        // redichiaro con indice costante
    print("arr1=" + {arr[1]});         // → arr1=42

    /* ── for range (0 .. 2)  ──────────────────────────── */
    for i in (0 ~ 3) {                  // stampa 0,1,2
        print("loop=" + {i});
    }

    /* ── while con assegnazione interna ───────────────── */
    @ FLOAT n : 0;
    while(n < 3) {
        print("n=" + {n});
        n : n + 1;
    }

    /* ── non-determinismo semplice ────────────────────── */
    { print("Heads"); } ND { print("Tails"); }

    /* ── Brain-F***: stampa 'A' (65) ──────────────────── */
    sly{
        +++++++[>++++++++<-]>+.
    }arnold
}
```

---
---
