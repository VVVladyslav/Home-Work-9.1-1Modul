import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    int index = 2;

    List<Object> list = new ArrayList<>();


    public void add(Object value){
        list.add(value);
    }

    public void remove(int index){
        list.remove(index);
    }

    public void clear(){
        list.clear();
    }

    public int size(){
        return list.size();
    }

    public Object get(int index){
        return list.get(index);
    }

//    public <Object> java.lang.Object get(int index){
//        return list.get(index);
//    }
}
