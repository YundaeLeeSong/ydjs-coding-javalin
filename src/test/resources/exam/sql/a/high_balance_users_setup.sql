CREATE TABLE users(id INTEGER PRIMARY KEY,first_name TEXT,last_name TEXT);
CREATE TABLE accounts(id INTEGER PRIMARY KEY,user_id INTEGER REFERENCES users(id),account_type TEXT,balance INTEGER);
INSERT INTO users VALUES(1,'Carl','Smith'),(2,'Stacy','Jenkins'),(3,'Greg','Marco'),(4,'Barbara','Stanley');
INSERT INTO accounts VALUES(1,1,'Checking',1050),(2,1,'Savings',900),(3,2,'Checking',200),(4,2,'Savings',300),(5,3,'Checking',12500),(6,3,'Savings',900),(7,4,'Checking',20),(8,4,'Savings',500);
