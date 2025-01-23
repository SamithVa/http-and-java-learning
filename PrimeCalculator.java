import java.util.ArrayList;
class PrimeCalculator {

    int nth(int nth) {
        ArrayList<Integer> primes = new ArrayList<>();
        int firstPrime = 2;
        if (nth < 1) {
            throw new IllegalArgumentException("Input must be greater than 0");
        }
        int current = firstPrime;
        while(primes.size() < nth){
            primes.add(current);
            for (int j = 0; j < primes.size() - 1; j++) {
                if (current % primes.get(j) == 0) {
                    primes.removeLast();
                    break;
                }
            }
            current++;
        }
        return primes.get(nth - 1);
    }

}


