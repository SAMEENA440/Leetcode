# Write your MySQL query statement below
select name from Employee where id in (select managerId from Employee group by managerId having count(*)>4);


-- SELECT name
-- FROM Employee 
-- WHERE id IN (
--     SELECT managerId
--     FROM Employee
--     GROUP BY managerId
--     HAVING COUNT(*) > 4
-- );