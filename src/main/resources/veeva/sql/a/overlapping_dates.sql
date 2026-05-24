SELECT s1.sub_id AS sub_id_1, s2.sub_id AS sub_id_2
FROM Subscriptions s1
JOIN Subscriptions s2 ON s1.user_id = s2.user_id
WHERE s1.sub_id < s2.sub_id
  AND s1.start_date <= s2.end_date
  AND s1.end_date >= s2.start_date;