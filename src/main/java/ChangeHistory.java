import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;


    //     public ChangeHistory() creates an empty ChangeHistory object.
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    //
    //    public void add(double status) adds provided status as the latest amount to remember in the change history.
    public void add(double status) {
        this.history.add(status);
    }
    //
    //    public void clear() empties the history.
    public void clear() {
        this.history.clear();
    }
    //
    //    public String toString() returns the string representation of the change history.
    //    The string representation provided by the ArrayList class is sufficient.
    public String toString() {
        return this.history.toString();
    }

    //     public double maxValue() returns the largest value in the change history.
    //     If the history is empty, the method should return zero.
    public double maxValue() {
        double maxValue = 0.0;
        for (double value : this.history) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    //
    //    public double minValue() returns the smallest value in the change history.
    //    If the history is empty, the method should return zero.
    public double minValue() {
        double minValue = this.maxValue();
        for (double value : this.history) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
    //    public double average() returns the average of the values in the change history.
    //    If the history is empty, the method should return zero.
    public double average() {
        int i = 0;
        double average = 0.0;
        for (double value : this.history) {
            i++;
            average += value;
        }
        if (average == 0) {
            return average;
        }
        average = average / i;
        return average;
    }




}
