CREATE TABLE delivery_employee (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    f_name VARCHAR(32) NOT NULL CHECK (f_name <> ""),
    m_name VARCHAR(32) NOT NULL CHECK (m_name <> ""),
    l_name VARCHAR(32) NOT NULL CHECK (l_name <> ""),
    salary DECIMAL(16, 2) NOT NULL CHECK (salary >= 0),
    bank_account_number VARCHAR(32) NOT NULL UNIQUE CHECK (bank_account_number <> ""),
    national_insurance_number VARCHAR(32) NOT NULL UNIQUE CHECK (national_insurance_number <> "")
);