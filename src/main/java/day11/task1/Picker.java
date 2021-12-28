package day11.task1;

public class Picker implements Worker {
    private int salary;
    public boolean isPayed;
    Warehouse warehouse;

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
        salary += 80;
        warehouse.countPickedOrders();

    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountPickedOrders() >= 10000) {
                System.out.println(salary += 70000);
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }
}
