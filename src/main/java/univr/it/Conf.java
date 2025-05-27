package univr.it;

import univr.it.value.ExpValue;

import java.util.HashMap;
import java.util.Map;

public class Conf {
    private final Map<String, ExpValue<?>> map;

    public Conf(){
        map = new HashMap<>();
    }
    public Conf(Conf c){
        this.map = c.map;
    }

    public ExpValue<?> get(String id){
        return map.get(id);
    }

    public void put(String id, ExpValue<?> val){
        map.put(id,val);
    }

    public void delete(String id){
        map.remove(id);
    }
}
