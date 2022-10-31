public class Task8 {
    public static void main(String[] args) {
        var totalHours = 640;
        var everyEmployeeHours = 8;
        var employeesNumber = totalHours / everyEmployeeHours;
        System.out.println("Всего работников в компании - " + employeesNumber + " человек");
        employeesNumber = employeesNumber + 94;
        totalHours = employeesNumber * everyEmployeeHours;
        System.out.println("Если в компании работает " + employeesNumber + " человека, то всего " + totalHours + " часа работы может быть поделено между сотрудниками");
    }
}
