public class Main {
    public static void main(String[] args) {
        LazyNumberDetails lnd = new LazyNumberDetails(23);

        lnd.updateNumber(10); // (2)  **none (lazy eval.)**    -> no user action
        lnd.updateNumber(17); // (3)  **none (lazy eval.)**    -> no user action
        lnd.isPrime();        // (4)  !!intensiveComputation!! -> prime algorithm for 17
        lnd.isPrime();        // (5)  **cached**               -> saved result from prime alg
        lnd.isPrime();        // (6)  **cached**               -> saved result from prime alg
        lnd.isPrime();        // (7)  **cached**               -> saved result from prime alg
        lnd.isPerfect();      // (8)  !!intensiveComputation!! -> perfect algorithm for 17
        lnd.isMagic();        // (9)  !!intensiveComputation!! -> magic algorithm for 17
        lnd.isPerfect();      // (10) **cached**               -> saved result from perfect alg
        lnd.updateNumber(28); // (11) **none (lazy eval.)**    -> no user action
        lnd.isPerfect();      // (12) !!intensiveComputation!! -> perfect algorithm for 28
        lnd.isPrime();        // (13) !!intensiveComputation!! -> prime algorithm for 28
        lnd.isPerfect();      // (14) **cached**               -> saved result from perfect alg
        lnd.isMagic();        // (15) !!intensiveComputation!! -> magic algorithm for 28
        lnd.isMagic();        // (16) **cached**               -> saved result from magic alg
        lnd.isPrime();        // (17) **cached**               -> saved result from prime alg
        lnd.updateNumber(12); // (18) **none (lazy eval.)**    -> no user action
        lnd.isMagic();        // (19) !!intensiveComputation!! -> magic algorithm for 12
        lnd.isMagic();        // (20) **cached**               -> saved result from magic alg
        lnd.isMagic();        // (21) **cached**               -> saved result from magic alg
        lnd.isPrime();        // (22) !!intensiveComputation!! -> prime algorithm for 12
        lnd.isPerfect();      // (23) !!intensiveComputation!! -> perfect algorithm for 12
        lnd.isPrime();        // (24) **cached**               -> saved result from prime alg
        lnd.isPerfect();      // (25) **cached**               -> saved result from perfect alg
        lnd.isMagic();        // (26) **cached**               -> saved result from magic alg
    }
}