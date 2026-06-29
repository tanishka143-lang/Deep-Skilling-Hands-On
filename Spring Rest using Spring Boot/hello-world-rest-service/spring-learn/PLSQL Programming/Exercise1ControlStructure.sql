-- Exercise 1: Control Structures

-- Step 1: Create Tables
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE
);

-- Step 2: Insert Data
INSERT INTO Customers VALUES (1, 'Rahul', 65, 15000, 'FALSE');
INSERT INTO Customers VALUES (2, 'Anita', 45, 8000, 'FALSE');

INSERT INTO Loans VALUES (101, 1, 8.5, SYSDATE + 20);
INSERT INTO Loans VALUES (102, 2, 9.0, SYSDATE + 40);

COMMIT;

-- Step 3: Enable Output
SET SERVEROUTPUT ON;

-- Step 4: Scenario 1 (Discount)
BEGIN
    FOR rec IN (
        SELECT c.CustomerID, c.Age, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
    )
    LOOP
        IF rec.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;

            DBMS_OUTPUT.PUT_LINE('Discount applied to Loan ID: ' || rec.LoanID);
        END IF;
    END LOOP;
    COMMIT;
END;
/

-- Step 5: Scenario 2 (VIP)
BEGIN
    FOR rec IN (SELECT CustomerID, Balance FROM Customers)
    LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Customer ' || rec.CustomerID || ' is now VIP');
        END IF;
    END LOOP;
    COMMIT;
END;
/

-- Step 6: Scenario 3 (Reminder)
BEGIN
    FOR rec IN (
        SELECT LoanID, CustomerID, DueDate
        FROM Loans
        WHERE DueDate <= SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ' || rec.LoanID ||
            ' for Customer ' || rec.CustomerID ||
            ' is due soon'
        );
    END LOOP;
END;
/