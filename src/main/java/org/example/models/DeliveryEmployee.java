package org.example.models;

/**
 * Represents a delivery employee in the system.
 */
public class DeliveryEmployee {
    private int id;
    private String fName;
    private String mName;
    private String lName;
    private double salary;
    private String bankAccount;
    private String nationalInsuranceNumber;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
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

    public void setNationalInsuranceNumber(
            final String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public DeliveryEmployee(final int id,
                            final String fName,
                            final String mName,
                            final String lName,
                            final double salary,
                            final String bankAccount,
                            final String nationalInsuranceNumber) {
        this.id = id;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.salary = salary;
        this.bankAccount = bankAccount;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}
