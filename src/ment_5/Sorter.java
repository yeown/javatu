package ment_5;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sorter {
    private Comparable compare;
    public Sorter(Comparable compare) {
        this.compare = compare;
    }
    public void setComparable(Comparable comparable){
        this.compare = comparable;
    }
    public void bubbleSort(Object[] data) {
        for(int i = 0; i < data.length - 1; i++){
            for(int j = 0; j < data.length - i - 1; j++){
                if(compare.compareTo(data[j],data[j+1]) > 0){
                    Object temp;
                    temp = data[j] ;
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}
