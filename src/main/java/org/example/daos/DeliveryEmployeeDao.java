package org.example.daos;

import org.example.models.DeliveryEmployeeRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeliveryEmployeeDao {
    public int createDeliveryEmployee(final DeliveryEmployeeRequest deliveryEmployeeRequest) throws SQLException {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String insertStatement = "INSERT INTO `delivery_employee` (name, salary, bank_account_number, national_insurance_number) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, deliveryEmployeeRequest.getName());
            preparedStatement.setDouble(2, deliveryEmployeeRequest.getSalary());
            preparedStatement.setString(3, deliveryEmployeeRequest.getBankAccount());
            preparedStatement.setString(4, deliveryEmployeeRequest.getNationalInsuranceNumber());

            preparedStatement.executeUpdate();

            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }

            return -1;
        }
    }
}
