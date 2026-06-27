-- Enable output
SET SERVEROUTPUT ON;
-- CREATE TABLES

-- Accounts Table
CREATE TABLE Accounts (
    account_id NUMBER PRIMARY KEY,
    account_type VARCHAR2(20),
    balance NUMBER
);

-- Employees Table
CREATE TABLE Employees (
    emp_id NUMBER PRIMARY KEY,
    department_id NUMBER,
    salary NUMBER
);


-- INSERT SAMPLE DATA


-- Accounts Data
INSERT INTO Accounts VALUES (1, 'SAVINGS', 10000);
INSERT INTO Accounts VALUES (2, 'SAVINGS', 20000);
INSERT INTO Accounts VALUES (3, 'CURRENT', 15000);

-- Employees Data
INSERT INTO Employees VALUES (101, 10, 50000);
INSERT INTO Employees VALUES (102, 10, 60000);
INSERT INTO Employees VALUES (103, 20, 55000);

COMMIT;


-- DISPLAY INITIAL DATA

BEGIN
    DBMS_OUTPUT.PUT_LINE('Initial Accounts Data:');
END;
/

SELECT * FROM Accounts;

BEGIN
    DBMS_OUTPUT.PUT_LINE('Initial Employees Data:');
END;
/

SELECT * FROM Employees;


-- PROCEDURE 1: ProcessMonthlyInterest


CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'SAVINGS';

    DBMS_OUTPUT.PUT_LINE('Interest applied successfully.');
END;
/


-- PROCEDURE 1 EXECUTED

BEGIN
    ProcessMonthlyInterest;
END;
/

SELECT * FROM Accounts;


-- PROCEDURE 2: UpdateEmployeeBonus


CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    dept_id IN NUMBER,
    bonus_percent IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET salary = salary + (salary * bonus_percent / 100)
    WHERE department_id = dept_id;

    DBMS_OUTPUT.PUT_LINE('Bonus updated successfully.');
END;
/


-- EXECUTED PROCEDURE 2

BEGIN
    UpdateEmployeeBonus(10, 10); -- 10% bonus
END;
/

SELECT * FROM Employees;


-- PROCEDURE 3: TransferFunds


CREATE OR REPLACE PROCEDURE TransferFunds (
    from_acc IN NUMBER,
    to_acc IN NUMBER,
    amount IN NUMBER
) IS
    source_balance NUMBER;
BEGIN
    SELECT balance INTO source_balance
    FROM Accounts
    WHERE account_id = from_acc;

    IF source_balance >= amount THEN

        UPDATE Accounts
        SET balance = balance - amount
        WHERE account_id = from_acc;

        UPDATE Accounts
        SET balance = balance + amount
        WHERE account_id = to_acc;

        DBMS_OUTPUT.PUT_LINE('Transfer successful.');

    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance.');
    END IF;

END;
/


-- EXECUTED PROCEDURE 3

BEGIN
    TransferFunds(1, 2, 5000);
END;
/

SELECT * FROM Accounts;

