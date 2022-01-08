package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    static final int WORK_SALARY = 80;
    static final int BONUS = 70000;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", PicketOrders=" + warehouse.getCountPickedOrders() +
                '}';
    }

    @Override
    public void doWork() {
        salary += WORK_SALARY;
        warehouse.incrementPickedOrders();

    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountPickedOrders() >= ORDERS_FOR_BONUS) {
                System.out.println(salary += BONUS);
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }
}
