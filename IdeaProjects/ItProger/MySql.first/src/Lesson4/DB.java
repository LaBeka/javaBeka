package Lesson4;


/*import java.sql.*;

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

    public void insertArticle(String title, String text, String date, String author) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO `articles` (title, text, date, author) VALUES (?, ?, ?, ?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(sql);
        prSt.setString(1, title);
        prSt.setString(2, text);
        prSt.setString(3, date);
        prSt.setString(4, author);

        prSt.executeUpdate();

    }

    public void getArticles(String table) throws  SQLException, ClassNotFoundException{
        //String sql = "SELECT * FROM " + table;
        //String sql = "SELECT 'title', 'text' FROM " + table;// po title i text poluchit dannie
        //String sql = "SELECT * FROM " + table + " WHERE 'id > 2'";
        //String sql = "SELECT * FROM " + table + " WHERE 'title' != 2";// 'id' != 2|| 'id' <> 2"||
        String sql = "SELECT * FROM " + table + " WHERE 'title' LIKE '%New%'";
        //String sql = "SELECT * FROM " + table + " WHERE 'title' LIKE '%Post%'";
        //String sql = "SELECT * FROM " + table + " WHERE 'title' LIKE '%Post%' AND 'id' < 4";
        //* + " WHERE 'title' LIKE '%Post%'";

        Statement statement = getDbConnection().createStatement();
        ResultSet ress = statement.executeQuery(sql);// vipolnt i poluchim dannie is samoi tablichki

        while (ress.next()) {
            System.out.println(ress.getString("text"));
            //System.out.println(ress.getString("text"));

        }
    }


}*/


import java.sql.*;

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
    }//

    public void insertArticle(String title, String text, String date, String author) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO `articles` (title, text, date, author) VALUES (?, ?, ?, ?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(sql);
        prSt.setString(1, title);
        prSt.setString(2, text);
        prSt.setString(3, date);
        prSt.setString(4, author);

        prSt.executeUpdate();
    }

    public void getArticles(String table) throws SQLException, ClassNotFoundException {
        //String sql = "SELECT * FROM " + table;// + " WHERE `title` LIKE '%Post%' OR `id` = 4 ORDER BY `date` ASC LIMIT 1 OFFSET 2";
        //String sql = "SELECT 'title', 'text' FROM " + table;// po title i text poluchit dannie
        //String sql = "SELECT * FROM " + table + " WHERE 'id > 2'";
        //String sql = "SELECT * FROM " + table + " WHERE `title` != 2";// 'id' != 2|| 'id' <> 2"||
        String sql = "SELECT * FROM " + table + " WHERE `title` LIKE '%New%'";
        //String sql = "SELECT * FROM " + table + " WHERE `title` LIKE '%Post%'";
        //String sql = "SELECT * FROM " + table + " WHERE `title` LIKE '%Post%' AND 'id' < 4";


        Statement statement = getDbConnection().createStatement();
        ResultSet res = statement.executeQuery(sql);
        while (res.next()) {
            System.out.println(res.getString("title")); // -> "1", -> 1
            System.out.println(res.getString("text"));
        }
    }
}
