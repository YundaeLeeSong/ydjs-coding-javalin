CREATE TABLE Subscriptions (
    sub_id INT PRIMARY KEY,
    user_id INT,
    start_date DATE,
    end_date DATE
);

INSERT INTO Subscriptions (sub_id, user_id, start_date, end_date) VALUES (1, 1, '2023-01-01', '2023-01-31');
INSERT INTO Subscriptions (sub_id, user_id, start_date, end_date) VALUES (2, 1, '2023-01-15', '2023-02-15');
INSERT INTO Subscriptions (sub_id, user_id, start_date, end_date) VALUES (3, 2, '2023-01-01', '2023-01-31');
INSERT INTO Subscriptions (sub_id, user_id, start_date, end_date) VALUES (4, 2, '2023-02-01', '2023-02-28');
