package SoloLearn.Array;

public class Revenue {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        //your code goes here
        // calculate the sum of all monthly revenues
        double sum = 0.0;
        for (double monthlyRevenue : revenue) {
            sum += monthlyRevenue;
        }

        // calculate the average montly revenue
        double averagerRevenue = sum / revenue.length;

        // Output the result as a double
        System.out.println(averagerRevenue);
    }
}
