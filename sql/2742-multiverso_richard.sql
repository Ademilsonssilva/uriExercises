SELECT l.name, round((omega * 1.618), 3) AS "Fator N" 
FROM dimensions d
INNER JOIN life_registry l ON d.id = l.dimensions_id
WHERE d.name IN ('C875', 'C774')
AND l.name like '%Richard%'