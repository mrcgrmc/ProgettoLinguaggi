package univr.it;

import univr.it.sigma.SigmaBaseVisitor;
import univr.it.sigma.SigmaParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.util.Arrays;

public final class IntBrainFuck extends SigmaBaseVisitor<Void> {
    private byte[] tape = new byte[30000];
    private int    ptr  = 0;

    private final InputStream in;
    private final PrintStream out;

    public IntBrainFuck() {
        this(System.in, System.out);
    }
    public IntBrainFuck(InputStream in, PrintStream out) {
        this.in  = in;
        this.out = out;
    }

    public static void run(SigmaParser.BfCommContext tree) {
        new IntBrainFuck().visit(tree);
    }

    @Override public Void visitLt   (SigmaParser.LtContext    ctx){ decPtr(); visit(ctx.bfComm()); return null; }
    @Override public Void visitGt   (SigmaParser.GtContext    ctx){ incPtr(); visit(ctx.bfComm()); return null; }
    @Override public Void visitPlus (SigmaParser.PlusContext  ctx){ tape[ptr]++;  visit(ctx.bfComm()); return null; }
    @Override public Void visitMinus(SigmaParser.MinusContext ctx){ tape[ptr]--;  visit(ctx.bfComm()); return null; }

    @Override public Void visitDot  (SigmaParser.DotContext   ctx){
        out.print((char)(tape[ptr] & 0xFF));
        visit(ctx.bfComm()); return null;
    }

    @Override public Void visitComma(SigmaParser.CommaContext ctx){
        try {
            int r = in.read();
            tape[ptr] = (byte) (r == -1 ? 0 : r);
        } catch (IOException e) { throw new UncheckedIOException(e); }
        visit(ctx.bfComm()); return null;
    }

    @Override public Void visitLoop (SigmaParser.LoopContext  ctx){
        while ((tape[ptr] & 0xFF) != 0) {
            visit(ctx.bfComm(0));
        }
        visit(ctx.bfComm(1));
        return null;
    }

    @Override public Void visitNil  (SigmaParser.NilContext   ctx){ return null; }

    private void incPtr(){
        ++ptr;
        if (ptr == tape.length) tape = Arrays.copyOf(tape, tape.length * 2);
    }
    private void decPtr(){
        if (ptr == 0) throw new IllegalStateException("Pointer < 0");
        --ptr;
    }
}
