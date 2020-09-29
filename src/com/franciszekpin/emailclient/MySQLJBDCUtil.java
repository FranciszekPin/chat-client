package com.franciszekpin.emailclient;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLJBDCUtil {
    public static Connection getConnection() throws SQLException {
        Connection connection = null;

        String propertiesFileName = "/home/franciszek/IdeaProjects/email-client/src/com/franciszekpin/emailclient/db.properties";
        try (FileInputStream fileInputStream = new FileInputStream(propertiesFileName)) {
            Properties properties = new Properties();
            properties.load(fileInputStream);

            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");

            connection = DriverManager.getConnection(url, user, password);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return connection;
    }

}
