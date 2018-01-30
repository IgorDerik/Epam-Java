USE labor_sql;
#1-1
SELECT maker, type FROM product
ORDER BY maker;

#1-2-1
SELECT model, ram, screen, price FROM laptop
WHERE price > 1000
ORDER BY ram;

#1-2-2
SELECT model, ram, screen, price FROM laptop
WHERE price > 1000
ORDER BY price DESC;

#1-3
SELECT * FROM printer
WHERE color = 'y'
ORDER BY price DESC;

#1-4
SELECT model, speed, hd, cd, price FROM pc
WHERE (cd = '12x' OR cd ='24x') AND price < 600
ORDER BY speed DESC;

#1-5
SELECT name, class FROM ships
ORDER BY name;