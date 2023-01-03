package task2;

import java.io.Serializable;

public class General<T extends Comparable, V extends Serializable, K extends Number> {
    T t;
    V v;
    K k;

    public General(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getClassT() {
        return t;
    }

    public V getClassV() {
        return v;
    }

    public K getClassK() {
        return k;
    }
}
