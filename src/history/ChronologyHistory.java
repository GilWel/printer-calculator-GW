package history;
import printer.Printer;


import java.util.ArrayList;
import java.util.List;

public class ChronologyHistory implements History {


    private final Printer printer;
    private final List<String> historyList = new ArrayList<>();

    public ChronologyHistory(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void addMathOperation(String mathCalculation) {
        historyList.add(mathCalculation);
        printer.print(historyList);

    }

    @Override
    public String toString() {
        return "ChronologyHistory{" +
                "printer=" + printer +
                ", historyList=" + historyList +
                '}';
    }
}

