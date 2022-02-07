public class Factorial {
    private int number;

    public Factorial(int number){
        this.number = number;
    }

    public int find() {
        if(number <0)
            return -1;
        if(number ==0)
            return 1;
        return number-- * find();
    }
}
