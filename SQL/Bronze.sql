/* Contains solution to all the queries from bronze level - 1 star*/
-- Revising the Select Query I
select * from city where population > 100000 having CountryCode='USA';
-- Revising the Select Query II
select name from city where population>120000 and CountryCode='USA';
-- Select All
select * from city 
-- Select By ID
select * from city where id=1661;
-- Japanese Cities' Attribute
select * from city where countrycode='JPN';
-- Japanese Cities' Names
select name from city where countrycode = 'JPN';
-- Weather Observation Station 1
select city, state from station;
-- Weather Observation Station 3
select city from station 
where id%2=0
group by city;
