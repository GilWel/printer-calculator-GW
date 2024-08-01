package printer;

import java.util.List;

public interface Printer {

    void  print(List<String> result);

    default void print(double result) {

    }
}
