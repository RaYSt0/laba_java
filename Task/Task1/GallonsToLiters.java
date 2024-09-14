1. package Task.Task1;
public class GallonsToLiters {
    public static void main(String[] args) {
        System.out.println(convert(5)); 
        System.out.println(convert(3)); 
        System.out.println(convert(8));
    }

    public static double convert(int gallons) {
        final double GALLON_TO_LITER = 3.78541;
        return gallons * GALLON_TO_LITER;
    }
}

2 .public class FitnessCalculator {
    public static void main(String[] args) {
        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2)); 
        System.out.println(fitCalc(41, 3)); 
    }

    public static int fitCalc(int minutes, int intensity) {
        final int LOW_INTENSITY = 1;
        final int MEDIUM_INTENSITY = 2;
        final int HIGH_INTENSITY = 3;

        int caloriesBurned = minutes * intensity;

        return caloriesBurned;
    }
}

3.public class Warehouse {
    public static void main(String[] args) {
        System.out.println(containers(3, 4, 2)); 
        System.out.println(containers(5, 0, 2)); 
        System.out.println(containers(4, 1, 4)); 
    }

    public static int containers(int boxes, int bags, int barrels) {
        final int BOX_CAPACITY = 20;
        final int BAG_CAPACITY = 50;
        final int BARREL_CAPACITY = 100;

        int totalItems = (boxes * BOX_CAPACITY) + (bags * BAG_CAPACITY) + (barrels * BARREL_CAPACITY);

        return totalItems;
    }
}

4. public class TriangleType {
    public static void main(String[] args) {
        System.out.println(triangleType(5, 5, 5)); 
        System.out.println(triangleType(5, 4, 5)); 
        System.out.println(triangleType(3, 4, 5)); 
        System.out.println(triangleType(5, 1, 1)); 
    }

    public static String triangleType(int x, int y, int z) {
        if (x == y && y == z) {
            return "equilateral";
        }
        else if (x == y || y == z || x == z) {
            return "isosceles";
        }
        else if (x + y > z && y + z > x && x + z > y) {
            return "different-sided";
        }
        else {
            return "not a triangle";
        }
    }
}

5. public class TernaryEvaluation {
    public static void main(String[] args) {
        System.out.println(ternaryEvaluation(8, 4)); 
        System.out.println(ternaryEvaluation(1, 11)); 
        System.out.println(ternaryEvaluation(5, 9)); 
    }

    public static int ternaryEvaluation(int a, int b) {
        return a > b ? a : b;
    }
}

6. public class FabricCalculator {
    public static void main(String[] args) {
        System.out.println(howManyItems(22, 1.4, 2));
        System.out.println(howManyItems(45, 1.8, 1.9)); 
        System.out.println(howManyItems(100, 2, 2)); 
    }

    public static int howManyItems(double fabricLength, double width, double height) {
        double totalFabricArea = fabricLength * 2;

        double itemArea = width * height;

        int numberOfItems = (int) (totalFabricArea / itemArea);

        return numberOfItems;
    }
}

7. public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println(factorial(3)); 
        System.out.println(factorial(5)); 
        System.out.println(factorial(7)); 
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел.");
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

8. public class GCDCalculator {
    public static void main(String[] args) {
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8)); 
        System.out.println(gcd(259, 28)); 
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

9. public class TicketSaler {
    public static void main(String[] args) {
        // Тестирование метода ticketSaler
        System.out.println(ticketSaler(70, 1500)); 
        System.out.println(ticketSaler(24, 950)); 
        System.out.println(ticketSaler(53, 1250)); 
    }

    public static int ticketSaler(int tickets, int pricePerTicket) {
        final double COMMISSION = 0.04; // 4% комиссия

        double totalRevenue = tickets * pricePerTicket;

        totalRevenue -= totalRevenue * COMMISSION;

        return (int) totalRevenue;
    }
}

    public static void main(String[] args) {
        System.out.println(tables(5, 2)); 
        System.out.println(tables(31, 20)); 
        System.out.println(tables(123, 58)); 
    }

    public static int tables(int students, int tables) {
        int requiredTables = (students + 1) / 2; 
        int missingTables = requiredTables - tables;

        return missingTables > 0 ? missingTables : 0;
    }
}
