// package powerpackage;

public class PowerFinder {
    public static int of(int base, int exponent) {
        int originalBase = base;
        while (--exponent > 0){
            base*=originalBase;
        }
        return base;
    }
    public static void main (String CMD[]){
       PowerFinder obj = new PowerFinder();
       System.out.println (of (2, 3)); 
    }
}
