package univr.it.value;

public abstract class NumValue<N extends Number> extends ExpValue<N>{

    NumValue(N value) {
        super(value);
    }

    public String toString(){
        return getValue().toString();
    }
}
