-- Table Employee
-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | id          | int     |
-- | name        | varchar |
-- | salary      | int     |
-- | managerId   | int     |
-- +-------------+---------+
-- id is the primary key column for this table.
-- Each row of this table indicates the ID of an employee, their name, salary, and the ID of their manager.
--
-- Write an SQL query to find the employees who earn more than their managers.
-- Return the result table in any order.
-- The query result format is in the following example.
--
-- I will assume that we will compare with there direct manager, not manager of manager

-- Default implementation with join
SELECT
    E.name AS 'Employee'
FROM Employee AS E
INNER JOIN Employee as M
ON E.managerId = M.id AND E.salary > M.salary;

-- Fastest implementation from online
SELECT e1.Name as 'Employee'
FROM Employee as e1, Employee as e2
WHERE e1.managerId = e2.id AND e1.salary > e2.salary;
