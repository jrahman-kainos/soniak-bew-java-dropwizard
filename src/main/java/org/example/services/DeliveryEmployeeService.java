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
        int id = deliveryEmployeeDao.createDeliveryEmployee(
                deliveryEmployeeRequest);
        if (id == -1) {
            throw new FailedToCreateException(Entity.DELIVERY_EMPLOYEE);
        }
        return id;
    }

}
