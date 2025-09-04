package org.example.services;

import org.example.Exceptions.Entity;
import org.example.Exceptions.FailedToCreateException;
import org.example.daos.DeliveryEmployeeDao;
import org.example.models.DeliveryEmployeeRequest;


import java.sql.SQLException;

public class DeliveryEmployeeService {

    DeliveryEmployeeDao deliveryEmployeeDao;

    public DeliveryEmployeeService(
            final DeliveryEmployeeDao deliveryEmployeeDao) {
        this.deliveryEmployeeDao = deliveryEmployeeDao;
    }

    public int createDeliveryEmployee(
            final DeliveryEmployeeRequest deliveryEmployeeRequest)
            throws FailedToCreateException,
            SQLException {

        if (!deliveryEmployeeRequest.getUsername().equals("HR")) {
            System.out.println("Only HR can create Delivery Employees");
            return -1;
        }
        if (!deliveryEmployeeRequest.getPassword().equals(
                System.getenv().get("HR_PASSWORD"))) {
            System.out.println("HR password wrong!");
            return -1;
        }
        int id = deliveryEmployeeDao.createDeliveryEmployee(
                deliveryEmployeeRequest);
        if (id == -1) {
            throw new FailedToCreateException(Entity.DELIVERY_EMPLOYEE);
        }
        return id;
    }

}
