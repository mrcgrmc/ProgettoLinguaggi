package univr.it;

import univr.it.value.ExpValue;
import univr.it.value.Value;

import java.util.HashMap;
import java.util.Map;

public class Conf {
    private final Map<String, Value> map;

    public Conf(){
        map = new HashMap<>();
    }
    public Conf(Conf c){
        if (c == null) this.map = new HashMap<>();
        else this.map = c.map;
    }

    public Value get(String id){
        return map.get(id);
    }

    public void put(String id, Value val){
        map.put(id,val);
    }

    public void delete(String id){
        map.remove(id);
    }
}
