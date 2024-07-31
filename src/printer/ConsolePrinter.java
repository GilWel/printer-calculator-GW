package printer;

import java.util.HashMap;
import java.util.List;

public class ConsolePrinter implements Printer{
    @Override
    public void print(List<String> result) {
        System.out.printf("Ваш результат равен: %.2f", result);


        }

    @Override
    public void print(double result) {
        System.out.println(result);
    }

}

