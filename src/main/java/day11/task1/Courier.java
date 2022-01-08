package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    static final int WORK_SALARY = 100;
    static final int BONUS = 50000;

    public Courier(Warehouse warehouse) {
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
        return "Courier{" +
                "salary=" + salary +
                ", DeliveredOrders=" + warehouse.getCountDeliveredOrders() +
                '}';
    }

    @Override
    public void doWork() {
        salary += WORK_SALARY;
        warehouse.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountDeliveredOrders() >= ORDERS_FOR_BONUS) {
                System.out.println(salary += BONUS);
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
