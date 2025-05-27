package univr.it.value;

import java.util.List;

public class ArrayValue extends ExpValue<List<ExpValue<?>>>{


    public ArrayValue(List<ExpValue<?>> value) {
        super(value);
    }

    public void set(int index, ExpValue<?> exp) {
        if (index >= getValue().size())
            for (int i = getValue().size(); i <= index; ++i)
                getValue().add(null);

        getValue().set(index, exp);
    }

    public ExpValue<?> get(int index) {
        return getValue().get(index);
    }
}
