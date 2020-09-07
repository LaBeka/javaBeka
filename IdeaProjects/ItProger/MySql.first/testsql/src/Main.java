import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        DB db = new DB();

        try {
            db.getOrders("orders");
            //db.getUsers("users");
           // db.getOrders("items");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
