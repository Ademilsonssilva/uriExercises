select name, round(((math*2) + (specific*3) + (project_plan*5))/10, 2) as avg
FROM candidate c
INNER JOIN score s ON c.id = s.candidate_id
order by avg desc