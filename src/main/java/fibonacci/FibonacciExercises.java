package fibonacci;

import io.reactivex.Observable;

import java.util.Arrays;

public class FibonacciExercises {

    public Observable<Integer> fibonacci(int n) {
        return Observable.just(0)
                .repeat(n - 1)
                .scan(Arrays.asList(0, 1), (a, b) -> Arrays.asList(a.get(1), a.get(0) + a.get(1)))
                .map(integers -> integers.get(0));

    }
}
