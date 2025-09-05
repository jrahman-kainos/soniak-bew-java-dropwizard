package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a request to create a delivery employee in the system.
 */
public class DeliveryEmployeeRequest {
    private String fName;
    private String mName;
    private String lName;
    private double salary;
    private String bankAccount;
    private String nationalInsuranceNumber;
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(final String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(final String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(final String lName) {
        this.lName = lName;
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

    @SuppressWarnings("checkstyle:ParameterNumber")
    @JsonCreator
    public DeliveryEmployeeRequest(
            @JsonProperty("fName") final String fName,
            @JsonProperty("mName") final String mName,
            @JsonProperty("lName") final String lName,
            @JsonProperty("salary") final double salary,
            @JsonProperty("bankAccount") final String bankAccount,
            @JsonProperty("nationalInsuranceNumber")
            final String nationalInsuranceNumber,
            @JsonProperty("username") final String username,
            @JsonProperty("password") final String password

    ) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.salary = salary;
        this.bankAccount = bankAccount;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.username = username;
        this.password = password;
    }
}
