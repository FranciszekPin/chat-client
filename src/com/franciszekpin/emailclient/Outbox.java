package com.franciszekpin.emailclient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Outbox {
    public void send(Message message) {
        System.out.println("Send message with content " + message.getContent());

        String sqlCommand = "INSERT INTO messages(user_id, date, content)" +
                            "VALUES (?, ?, ?)";

        try (Connection connection = MySQLJBDCUtil.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(sqlCommand, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setInt(1, message.getUserId());
            preparedStatement.setDate(2, message.getDate());
            preparedStatement.setString(3, message.getContent());

            int rowAffected = preparedStatement.executeUpdate();

            if (rowAffected != 1)
                System.out.println("Something has fucked up...");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
