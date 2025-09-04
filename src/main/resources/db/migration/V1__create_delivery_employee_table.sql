CREATE TABLE delivery_employee (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(64) NOT NULL CHECK (name <> ""),
    salary DECIMAL(16, 2) NOT NULL CHECK (salary >= 0),
    bank_account_number VARCHAR(32) NOT NULL UNIQUE CHECK (bank_account_number <> ""),
    national_insurance_number VARCHAR(32) NOT NULL UNIQUE CHECK (national_insurance_number <> "")
);