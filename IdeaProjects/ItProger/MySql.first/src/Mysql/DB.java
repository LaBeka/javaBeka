package Mysql;

import java.sql.Connection;//eto dlya sozdat obekt dlya podkluchenia k base dannih
import java.sql.SQLException;// obrabotka ralichnih oshibok
import java.sql.DriverManager;// vipolnit class connection.

public class DB {

        private final String HOST = "localhost";
        private final String PORT = "3306";
        private final String BD_NAME = "java_bd";
        private final String LOGIN = "root";
        private final String PASS = "root";

        private Connection dbConn = null;

        public Connection getDbConnection() throws ClassNotFoundException, SQLException {// vipolnit podkluchenie k BD kotori dostupen vnutri etogo class
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
}
