SELECT name, cast( date_part('DAY', payday) AS integer) as day
FROM loan