import java.sql.*;

public class DB {

    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "blog";
    private final String LOGIN = "root";
    private final String PASS = "root";

    private Connection dbConn = null;

    private Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connStr = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB_NAME;
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConn = DriverManager.getConnection(connStr, LOGIN, PASS);
        return dbConn;
    }

    public void isConnected() throws SQLException, ClassNotFoundException {
        dbConn = getDbConnection();
        System.out.println(dbConn.isValid(1000));
    }

    /*public void insertItems(int id, String title, int price, String category) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO `items` (id, title, price, category) VALUES (?, ?, ?, ?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(sql);
        prSt.setInt(1, id);
        prSt.setString(2, title);
        prSt.setInt(3, price);
        prSt.setString(4, category);

        prSt.executeUpdate();
    }*/

    /*public void insertOrders(int users_id, int items_id) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO `orders` (users_id, items_id) VALUES (?, ?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(sql);
        prSt.setInt(1);
        prSt.setInt(3);

        prSt.executeUpdate();
    }*/

    public void getOrders(String table) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM " + table;

        Statement statement = getDbConnection().createStatement();
        ResultSet res = statement.executeQuery(sql);
        while (res.next()) {
            System.out.println(res.getString("title"));
        }
    }

    /*public void getUsers(String table) throws SQLException, ClassNotFoundException {
        //String sql = "SELECT * FROM " + table + " WHERE `login` LIKE '%john%'";
        String sql = "SELECT * FROM " + table;

        Statement statement = getDbConnection().createStatement();
        ResultSet res = statement.executeQuery(sql);
        while (res.next()) {
            System.out.println(res.getString("login"));
            System.out.println(" - ");
        }
    }*/
}
