# Write your MySQL query statement below
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m 
  ON e.managerId = m.id
WHERE e.salary > m.salary;

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna