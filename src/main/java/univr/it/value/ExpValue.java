package univr.it.value;

import java.util.Objects;

public abstract class ExpValue<T> extends Value{
    private final T value;

    ExpValue(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o){
        if (o == null || o.getClass() != getClass()) return false;
        else return o == this.value;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(this.value);
    }
}