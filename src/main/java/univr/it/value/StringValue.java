package univr.it.value;

public class StringValue extends ExpValue<String>{

    public StringValue(String value) {
        super(value);
    }

    @Override
    public boolean equals(Object o){
        if (o == null || o.getClass() != getClass()) return false;
        else return this.getValue().compareTo((String) o) == 0;
    }
}
