# Write your MySQL query statement below
select name as Customers from Customers LEFT JOIN Orders ON Customers.id = Orders.customerId
WHERE Orders.customerId IS NULL;