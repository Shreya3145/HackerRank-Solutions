/* Contains solution to all the queries from silver level - 3 stars - MySQL*/
-- Weather Observation Station 11
select distinct city from station where city not regexp '^[aeiouAEIOU]' or city not regexp '[aeiouAEIOU]$';
-- Weather Observation Station 12
select distinct city from station where city not regexp '^[aeiouAEIOU]' and city not regexp '[aeiouAEIOU]$';
-- Higher than 75 Marks
