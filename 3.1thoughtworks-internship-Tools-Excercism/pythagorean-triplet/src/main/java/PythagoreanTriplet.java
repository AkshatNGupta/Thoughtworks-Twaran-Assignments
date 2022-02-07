import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
public final class PythagoreanTriplet {
  static class Builder {
      private int limit;
      private List<PythagoreanTriplet> triplets = new ArrayList<>();
      private Predicate<PythagoreanTriplet> filter =  pt -> true;
 
      public Builder withFactorsLessThanOrEqualTo(int limit) {
       if ( limit < 1) 
            throw new IllegalArgumentException("Given parameter must be > 1");
        this.limit = limit;
        return this;
      }
      public Builder thatSumTo(int sum) {
       if ( sum < 1) 
            throw new IllegalArgumentException("Given parameter must be > 0");
        this.filter =  pt -> pt.compareSum(sum) == 0;
        return this;
      }
     
      void compute(Consumer<PythagoreanTriplet> consumer) {
        for(int a = 1; a < limit; a++) { 
            for(int b = a; b < limit; b++) {
                int h2 = a * a + b * b;
                int c = (int) Math.sqrt(h2);
                if (h2 == c * c) {
                    consumer.accept(new PythagoreanTriplet(a,b,c));
                }
            }
        }
      }
      void addToListIfMatch(PythagoreanTriplet pt) {
        if (filter.test(pt)) 
          triplets.add(pt);
      }
      public List<PythagoreanTriplet> build() {
        compute(this::addToListIfMatch);
        return triplets;
      }
  }
  public static Builder makeTripletsList() {
    return new Builder();
  }
  private final int a;
  private final int b;
  private final int c;
  private final int abcSum;
  PythagoreanTriplet(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.abcSum =  a + b + c;
  }
  public int compareSum(int value) {
     return abcSum - value;
  }
  @Override
  public boolean equals(Object o) {
    if (o instanceof PythagoreanTriplet) {
        PythagoreanTriplet pt = (PythagoreanTriplet) o;
        return pt.a == a && pt.b == b && pt.c == c; 
    }
    return false;
  }
  @Override
  public final int hashCode() {
    return Objects.hash(a, b, c);
  }
  @Override
  public final String toString() {
    return "("+a+", "+b+", "+c+")";
  }
}