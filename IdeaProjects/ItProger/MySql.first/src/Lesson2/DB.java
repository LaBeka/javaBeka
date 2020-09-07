/*
package Lesson2;

import java.sql.Connection;//eto dlya sozdat obekt dlya podkluchenia k base dannih
import java.sql.SQLException;// obrabotka ralichnih oshibok
import java.sql.DriverManager;// vipolnit class connection.
import java.sql.Statement;

public class DB {

    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String BD_NAME = "java_bd";
    private final String LOGIN = "root";
    private final String PASS = "root";

    private Connection dbConn = null;

    private Connection getDbConnection() throws ClassNotFoundException, SQLException {// vipolnit podkluchenie k BD kotori dostupen vnutri etogo class
        String connStr = "jdbc:mysql://" + HOST + ":" +
                PORT + "/" + BD_NAME;// JDBC eto tehnologiya kot slujit dlya podkluchenia k base dannih
        //unrecognized or represents more that one time zone
        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConn = DriverManager.getConnection(connStr, LOGIN, PASS);
        return dbConn;
    }

    public void isConnected() throws SQLException, ClassNotFoundException {
        dbConn = getDbConnection();
        System.out.println(dbConn.isValid(1000));//eta odna secunda
    }

    public void createTable(String tableName) throws SQLException, ClassNotFoundException{
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName +"(id INT AUTO_INCREMET PRIMARY KEY, name VARCHAR(50), password VARCHAR(100)) ENGINE=MYISAM;"; // nujno pisat zaglavnimi bukvami dlya vse SQL commands are written with upper cases.

        Statement statement = getDbConnection().createStatement();
        statement.executeUpdate(sql);

    }
}
*//*


package Lesson2;

        import java.sql.Connection;
        import java.sql.SQLException;
        import java.sql.DriverManager;
        import java.sql.Statement;

public class DB {

    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "java_bd";
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

    public void createTable(String tableName) throws SQLException, ClassNotFoundException {
        String sql = "CREATE TABLE IF NOT EXISTS " + tableName
                + " (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), password VARCHAR(100))"
                + " ENGINE=MYISAM;";

        Statement statement = getDbConnection().createStatement();
        statement.executeUpdate(sql);
    }

}


*/
