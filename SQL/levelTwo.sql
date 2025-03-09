/* Contains solution to all the queries from bronze level - 2 stars*/
-- Weather Observation Station 4
select count(city)-count(distinct city) from station;
-- Weather Observation Station 5
select city,length(city) from station order By length(city) asc, city asc limit 1;
select distinct(city),length(city) from station order by length(city) desc, city asc limit 1;
-- Weather Observation Station 6
select distinct city from station where city regexp '^[aeiou]';
-- Weather Observation Station 7
select distinct city from station where city regexp '[aeiou]$';
-- Weather Observation Station 8
select distinct city from station where city regexp '^[aeiou]' and city regexp '[aeiou]$';
-- Weather Observation Station 9
select distinct city from station where not city regexp '^[aeiou]';
-- Weather Observation Station 10
select distinct city from station where not city regexp '[aeiou]$';