package reactive;

class Order {
    int id;
    String status;

    Order(int id, String status) {
        this.id = id;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", status='" + status + "'}";
    }
}
