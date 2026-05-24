SELECT u.first_name, u.last_name
FROM users u JOIN accounts a ON u.id = a.user_id
WHERE a.balance > 1000;
