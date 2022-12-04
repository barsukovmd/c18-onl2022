package test3.interfaces;

public interface Stable {
    int CLOSED = 0;
    int OPEN = 1;

    void checkPipe(int n);
}
