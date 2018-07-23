SELECT name, customers_number from lawyers WHERE customers_number = (SELECT max(customers_number) from lawyers)
UNION ALL
SELECT name, customers_number from lawyers WHERE customers_number = (SELECT min(customers_number) from lawyers)
UNION ALL
SELECT 'Average', round(avg(customers_number)) as customers_number from lawyers