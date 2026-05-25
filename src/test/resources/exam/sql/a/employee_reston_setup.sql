CREATE TABLE location( id INTEGER PRIMARY KEY, city VARCHAR(20) );
CREATE TABLE employee( id INTEGER PRIMARY KEY, name VARCHAR(30), salary NUMERIC(10,2), location_id INTEGER REFERENCES location(id) );
INSERT INTO location VALUES (1, 'Reston'), (2, 'Arlington'), (3, 'Los Angeles');
INSERT INTO employee VALUES (1,'Sophie', 67890.00,1), (2, 'Ava', 176345.00,1), (3, 'Kieran', 124563.00,3), (4, 'Landon', 53465.00,2), (5, 'Xander', 67893.00,2);
