package printer;

import java.util.HashMap;
import java.util.List;

public class ConsolePrinter implements Printer{
    @Override
    public void print(List<String> historyList) {
        System.out.printf(String.valueOf(historyList));
        }

    @Override
    public void print(double result) {
        System.out.println("Результат равен  " +  result);
    }

}

