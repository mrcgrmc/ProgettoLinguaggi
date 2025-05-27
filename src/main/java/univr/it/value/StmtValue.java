package univr.it.value;

public class StmtValue extends Value{
    public static final StmtValue INSTANCE = new StmtValue();

    private StmtValue(){}

    @Override
    public boolean equals(Object o) {
        return o instanceof StmtValue;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
