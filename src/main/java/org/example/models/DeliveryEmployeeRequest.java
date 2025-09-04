package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a request to create a delivery employee in the system.
 */
public class DeliveryEmployeeRequest {
    private String name;
    private double salary;
    private String bankAccount;
    private String nationalInsuranceNumber;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(final String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(final String nationalInsuranceNo) {
        this.nationalInsuranceNumber = nationalInsuranceNo;
    }

    @JsonCreator
    public DeliveryEmployeeRequest(
            @JsonProperty("name") final String name,
            @JsonProperty("salary") final double salary,
            @JsonProperty("bankAccount") final String bankAccount,
            @JsonProperty("nationalInsuranceNumber")
            final String nationalInsuranceNumber) {
        this.name = name;
        this.salary = salary;
        this.bankAccount = bankAccount;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}
