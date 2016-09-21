package trabalhoDandoDeDados;

import java.util.ArrayList;

public class ArrayListAnySize<E> extends ArrayList<E>{
    public void add(String index, E element){
        if(Integer.parseInt(index) >= 0 && Integer.parseInt(index) <= size()){
            super.add(Integer.parseInt(index), element);
            return;
        }
        int insertNulls = Integer.parseInt(index) - size();
        for(int i = 0; i < insertNulls; i++){
            super.add(null);
        }
        super.add(element);
    }
}