-- Table: Weather

-- +---------------+---------+
-- | Column Name   | Type    |
-- +---------------+---------+
-- | id            | int     |
-- | recordDate    | date    |
-- | temperature   | int     |
-- +---------------+---------+
-- id is the primary key for this table.
-- This table contains information about the temperature on a certain day.
-- Write an SQL query to find all dates' Id with higher temperatures compared to its previous dates (yesterday).
-- Return the result table in any order.

SELECT W1.id
FROM Weather AS W1, Weather AS W2
WHERE datediff(W1.recordDate, W2.recordDate) = 1 AND W1.temperature > W2.temperature;
