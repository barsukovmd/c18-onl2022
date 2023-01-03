package task3;

import lombok.Getter;
import lombok.NonNull;

import java.util.Arrays;

@Getter
@NonNull
public class MinMax<V> {
    V[] arrayOfNumbers;

    public MinMax(V[] numbers) {
        if (numbers.length != 0) {
            this.arrayOfNumbers = numbers;
        } else {
            throw new RuntimeException("Your array is empty");
        }
    }

    public V getMin() {
        Arrays.sort(arrayOfNumbers);
        return arrayOfNumbers[0];
        //подскажите плиз как сделать, чтобы ошибку не выдавало
        //return Arrays.stream(arrayOfNumbers).min(V);
        //или так не нужно делать?
    }

    public V getMax() {
        Arrays.sort(arrayOfNumbers);
        return arrayOfNumbers[arrayOfNumbers.length - 1];
//        return Arrays.stream(arrayOfNumbers).max(V);
    }
}
