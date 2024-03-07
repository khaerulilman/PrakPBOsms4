class Relational {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = 5;
        float f0 = 0.0F;
        float f1 = -0.0F;
        float f2 = 5.0F;

        // Relational operators
        System.out.println();
        System.out.println("Relational operators:");
        System.out.println("---------------------");
        System.out.println("Less than: 5 < 6 \t\t " + (x < y));
        System.out.println("Less than or equal to: 5 <= 5 \t " + (x <= z));
        System.out.println("Greater than: 5 > 6 \t\t " + (x > y));
        System.out.println("Greater than or equal to: 5 >= 5 \t " + (x >= z));
        System.out.println();
        System.out.println("\t Less than: -0.0 < 0.0 \t\t " + (f1 < f0));
        System.out.println("\t Less than or equal to: -0.0 <= 0.0 \t " + (f1 <= f0));
        System.out.println("\t Greater than: 5 > NaN \t\t " + (x > (f0/f1)));
    }
}
