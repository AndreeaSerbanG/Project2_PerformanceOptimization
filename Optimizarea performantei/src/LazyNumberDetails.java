public class LazyNumberDetails {
    //starea obiectului
    private int number;
    private boolean isPrime;
    private boolean isPrimeCalled;
    private boolean isPerfect;
    private boolean isPerfectCalled;
    private boolean isMagic;
    private boolean isMagicCalled;
    private int isPrimeCalledCnt = 0;
    private int isPerfectCalledCnt = 0;
    private int isMagicCalledCnt = 0;

    //comportamentul obiectului
    public LazyNumberDetails(int number){
        this.number = number;
    }
    public void updateNumber(int number){
        this.number = number;
        isPrime = false;
        isPerfect = false;
        isMagic = false;
        isPrimeCalled = false;
        isMagicCalled = false;
        isPerfectCalled = false;
        isPrimeCalledCnt = 0;
        isPerfectCalledCnt = 0;
        isMagicCalledCnt = 0;
        System.out.println("\n ~ S-a realizat un update la numarul: " + number + "\n");
    }

    //metoda care verifica daca numarul este prim si a mai fost afisat
    public boolean isPrime(){
        if (isPrimeCalled){
            isPrimeCalledCnt++;
            isPrimeCalled();
        }else {
            isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Numarul " + number + " este prim.");
                isPrimeCalledCnt++;
            }else{
                System.out.println("Numarul " + number + " nu este prim.");
                isPrimeCalledCnt++;
            }
            isPrimeCalled = true;
        }
        return isPrime;
    }
    public void isPrimeCalled(){
        if(isPrime){
            System.out.println("-> Afisarea " + isPrimeCalledCnt + ". Numarul " + number + " este prim.");
        }else{
            System.out.println("-> Afisarea " + isPrimeCalledCnt + ". Numarul " + number + " nu este prim.");
        }
    }
    //metoda care verifica daca numarul este perfect si a mai fost afisat
    public boolean isPerfect(){
        if(isPerfectCalled){
            isPerfectCalledCnt++;
            isPerfecCalled();
        }else {
            if (Algorithms.sumDiv(number) == number) {
                isPerfect = true;
            }
            if (isPerfect) {
                System.out.println("Numarul " + number + " este perfect.");
                isPerfectCalledCnt++;
            }else{
                System.out.println("Numarul " + number + " nu este perfect.");
                isPerfectCalledCnt++;
            }
            isPerfectCalled = true;
        }
        return isPerfect;
    }

    public void isPerfecCalled(){
        if(isPerfect){
            System.out.println("-> Afisarea " + isPerfectCalledCnt + ". Numarul " + number + " este perfect.");
        }else{
            System.out.println("-> Afisarea " + isPerfectCalledCnt + ". Numarul " + number + " nu este perfect.");
        }
    }

    public boolean isMagic(){
        if( isMagicCalled){
            isMagicCalledCnt++;
            isMagicCalled();
        }else {
            if ((Algorithms.reduceNumber(number) == 3) ||
                    (Algorithms.reduceNumber(number) == 7) ||
                    (Algorithms.reduceNumber(number) == 9)) {
                isMagic = true;
            }
            if (isMagic) {
                System.out.println("Numarul " + number + " este magic.");
                isMagicCalledCnt++;
            } else {
                System.out.println("Numarul " + number + " nu este magic.");
                isMagicCalledCnt++;
            }
            isMagicCalled = true;
        }
        return isMagic;
    }
    public void isMagicCalled(){
        if(isMagic){
            System.out.println("-> Afisarea " + isMagicCalledCnt + ". Numarul " + number + " este magic.");
        }else{
            System.out.println("-> Afisarea " + isMagicCalledCnt + ". Numarul " + number + " nu este magic.");
        }
    }
}
