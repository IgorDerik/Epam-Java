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

#1-6 
SELECT * FROM pc
WHERE speed >= 500 AND price < 800 
ORDER BY price DESC;

#1-8
SELECT model, speed FROM pc
WHERE speed >= 400 AND speed <= 600 
ORDER BY hd;


#1-10
SELECT model, speed, hd, price FROM laptop 
WHERE screen >= 12
ORDER BY price DESC;

#1-11
SELECT model, type, price FROM printer 
WHERE price < 300 
ORDER BY type DESC;

#1-12
SELECT model, ram, price FROM laptop 
WHERE ram = 64 
ORDER BY screen;

#1-13
SELECT model, ram, price FROM pc
WHERE ram > 64 
ORDER BY hd;

#1-17
SELECT * FROM income 
WHERE point = 1 
ORDER BY inc;

#2-1
SELECT model FROM pc
WHERE model LIKE '%1%1%';

#2-4
SELECT name FROM ships 
WHERE name LIKE 'W%n';

#2-5
SELECT name	FROM ships 
WHERE name LIKE '%e%e%';

#2-10
SELECT date FROM pass_in_trip 
WHERE place LIKE '1%';

#2-11
SELECT date FROM pass_in_trip 
WHERE place LIKE '%c';