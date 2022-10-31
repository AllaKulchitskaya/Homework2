public class Task7 {
    public static void main(String[] args) {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе двух боксёров равна " + weightDifference + " кг");
        weightDifference = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе двух боксёров равна " + weightDifference + " кг");
    }
}
