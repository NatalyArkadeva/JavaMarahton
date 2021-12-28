package day11.task1;

public class Courier implements Worker{
    private int salary;
    public boolean isPayed;
    Warehouse warehouse;

    public Courier(Warehouse warehouse){
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
        salary += 100;
        warehouse.countDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountDeliveredOrders() >= 10000) {
                System.out.println(salary += 50000);
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
