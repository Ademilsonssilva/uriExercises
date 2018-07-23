(SELECT 'Podium: ' || team as name FROM league limit 3)
UNION ALL
(SELECT 'Demoted: ' || team as name FROM league WHERE position >= ( SELECT max(position) FROM league) - 1)
