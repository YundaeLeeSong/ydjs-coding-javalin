SELECT e.Name AS name, l.City AS city
FROM Employee e INNER JOIN Location l ON e.Location_id = l.ID
WHERE l.City = 'Reston';
