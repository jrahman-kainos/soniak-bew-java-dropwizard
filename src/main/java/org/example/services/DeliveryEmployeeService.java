package org.example.services;

import org.example.daos.DeliveryEmployeeDao;
import org.example.models.DeliveryEmployeeRequest;

import javax.swing.text.html.parser.Entity;
import java.sql.SQLException;
import java.util.List;

public class DeliveryEmployeeService {

    DeliveryEmployeeDao deliveryEmployeeDao;

    public DeliveryEmployeeService(final DeliveryEmployeeDao deliveryEmployeeDao) {
        this.deliveryEmployeeDao = deliveryEmployeeDao;
    }

    public int createDeliveryEmployee(
            final DeliveryEmployeeRequest deliveryEmployeeRequest)
            throws FailedToCreateException,
            SQLException {
        int id = deliveryEmployeeDao.createDeliveryEmployee(deliveryEmployeeRequest);
        if (id == -1) {
            throw new FailedToCreateException(Entity.DELIVERYEMPLOYEE);
        }
        return id;
    }

    public List<DeliveryEmployeeResponse> getAllDeliveryEmployees() throws SQLException {
        return DeliveryEmployeeMapper.mapDeliveryEmployeeListToDeliveryEmployeeResponseList(
                deliveryEmployeeDao.getAllDeliveryEmployees());
    }
}
