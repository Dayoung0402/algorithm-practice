# Write your MySQL query statement below
SELECT MAX(T1.salary) AS SecondHighestSalary 
FROM (
    SELECT DISTINCT salary 
    FROM Employee
    ORDER BY salary DESC
    LIMIT 1 OFFSET 1
) AS T1;