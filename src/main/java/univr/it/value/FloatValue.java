package univr.it.value;

public class FloatValue extends NumValue<Float>{

    public FloatValue(Float value) {
        super(value);
    }
    public IntValue toInt(){
        int v = Math.round(getValue());
        return new IntValue(v);
    }
}
