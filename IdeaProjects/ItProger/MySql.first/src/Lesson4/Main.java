package Lesson4;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        DB bd = new DB();

        try {
            bd.getArticles("articles");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
