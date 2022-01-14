package Assignment3;

import java.util.ArrayList;

public class Marketing {



        // Data Fields
        String employeeName;
        String productName;
        double salesAmount;

        // Constructor

        public Marketing(String employeeName, String productName, double salesAmount) {
            this.employeeName = employeeName;
            this.productName = productName;
            this.salesAmount = salesAmount;
        }

        @Override
        public String toString() {
            return
                    "employeeName= " + employeeName + " " +
                            ", productName= " + productName + " " +
                            ", salesAmount= " + salesAmount;
        }

        public static void main(String[] args) {
            ArrayList<Marketing> marketlist = new ArrayList<>();

            Marketing mk1 = new Marketing("Alex", "Computer", 20000);
            Marketing mk2 = new Marketing("Jhon","Software", 60000);
            Marketing mk3 = new Marketing("Martha", "Laptop", 50000);
            Marketing mk4 = new Marketing("Daniel","Book",12000);

            // Adding objects to the Marketing
            marketlist.add(mk1);
            marketlist.add(mk2);
            marketlist.add(mk3);
            marketlist.add(mk4);
            System.out.println(marketlist);
            // Get the size of the list
            System.out.println("The size of the list is: " +marketlist.size());
            // Delete objects from Marketing
            marketlist.remove(mk4);
            System.out.println(marketlist);

            // Modify some objects using set() method

            marketlist.set(2,mk4);
            System.out.println(marketlist);

            // The total sales of the market
            double total = 0;

            total += mk1.salesAmount + mk2.salesAmount + mk3.salesAmount + mk4.salesAmount;

            System.out.println("Total selling amount of the market is  : $" + total);

            // The get method
            System.out.println(marketlist.get(2));

            // The clear method
            marketlist.clear();
            System.out.println(marketlist);
        }
    }

