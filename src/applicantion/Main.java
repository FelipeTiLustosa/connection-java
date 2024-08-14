package src.applicantion;

import src.db.DB;

import java.sql.Connection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        System.out.println("Conexão bem-sucedida!");
        DB.closeConnection();
    }
}
