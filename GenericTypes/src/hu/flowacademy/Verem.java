package hu.flowacademy;

import java.util.Arrays;
import java.util.stream.Stream;

public class Verem<E> {
    public E[] list;
    private int  pointer;

    public Verem(int length){
        this.list = (E[])new Object[length];
        this.pointer = 0;
    }

    public void pushValue(E value) throws OverflowExc{
            if(this.pointer == list.length) throw new OverflowExc("Overflow");
            list[this.pointer] = value;
            this.pointer++;
    }

    public E popValue() throws UnderflowExc{
            if(this.pointer == 0) throw new UnderflowExc("Underflow");
            this.pointer--;
            return list[pointer];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack: [");
        for (int i = 0; i < pointer ; i++) {
            sb.append(list[i]);
            sb.append(' ');
        }
        sb.append(']');
        return sb.toString();
    }
}

class ZacskoException extends Exception{
    public ZacskoException(String message) {
        super(message);
    }
}
