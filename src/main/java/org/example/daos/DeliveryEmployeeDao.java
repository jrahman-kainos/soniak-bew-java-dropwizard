package org.example.daos;

import org.example.models.DeliveryEmployeeRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeliveryEmployeeDao {
    @SuppressWarnings("checkstyle:MagicNumber")
    public int createDeliveryEmployee(
            final DeliveryEmployeeRequest deliveryEmployeeRequest)
            throws SQLException {
        try (Connection connection = DatabaseConnector.getConnection()) {

            String insertStatement =
                    "INSERT INTO `delivery_employee` (f_name, m_name, l_name, salary, bank_account_number, national_insurance_number) VALUES (?,?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(
                    insertStatement, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(
                    1, deliveryEmployeeRequest.getfName());
            preparedStatement.setString(
                    2, deliveryEmployeeRequest.getmName());
            preparedStatement.setString(
                    3, deliveryEmployeeRequest.getlName());
            preparedStatement.setDouble(
                    4, deliveryEmployeeRequest.getSalary());
            preparedStatement.setString(
                    5, deliveryEmployeeRequest.getBankAccount());
            preparedStatement.setString(
                    6, deliveryEmployeeRequest.
                            getNationalInsuranceNumber());

            preparedStatement.executeUpdate();

            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }

            return -1;
        }
    catch (Exception e) {
        System.out.println(e.getMessage());
        return -1;
    }

    }
}
