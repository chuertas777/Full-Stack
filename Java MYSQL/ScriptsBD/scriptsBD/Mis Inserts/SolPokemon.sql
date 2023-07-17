#A continuación, se deben realizar las siguientes consultas:
use pokemondb;
#1. Mostrar el nombre de todos los pokemon.
select nombre 
from pokemon; 
#2. Mostrar los pokemon que pesen menos de 10k.
select * 
from pokemon
where peso < 10; 
#3. Mostrar los pokemon de tipo agua.
select p.nombre as 'nombre Pokemon', t.nombre as Tipo 
from pokemon p, tipo t 
where t.nombre="agua";
#4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
select p.nombre as 'nombre Pokemon', t.nombre as Tipo 
from pokemon p, tipo t 
where t.nombre="agua" 
or t.nombre = "fuego" 
or t.nombre = "tierra"
order by t.nombre;
#5. Mostrar los pokemon que son de tipo fuego y volador.
select p.nombre as 'nombre Pokemon', t.nombre as Tipo 
from pokemon p, tipo t 
where t.nombre="fuego" 
or t.nombre="volador"
order by p.nombre;
#6. Mostrar los pokemon con una estadística base de ps mayor que 200.
select p.nombre as 'nombre Pokemon', e.ps as Resistencia 
from pokemon p, estadisticas_base e 
where e.ps > 200;
#7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
select nombre, peso, altura 
from pokemon
where nombre = 'Ekans';
#8. Mostrar aquellos pokemon que evolucionan por intercambio.
select p.nombre, t.tipo_evolucion as 'Tipo evolución' 
from pokemon p, tipo_evolucion t
where t.tipo_evolucion = 'Intercambio';
#9. Mostrar el nombre del movimiento con más prioridad
select nombre, prioridad
from movimiento
order by prioridad
desc limit 1; 

select nombre, prioridad
from movimiento
where prioridad = (select MAX(prioridad) from movimiento);

#10. Mostrar el pokemon más pesado.
select nombre, peso
from pokemon
where peso = (select MAX(peso) from pokemon);

#11. Mostrar el nombre y tipo del ataque con más potencia.
select t.tipo as Nombre, e.ataque  
from tipo_ataque t, estadisticas_base e
where e.ataque = (select MAX(ataque) from estadisticas_base);
#12. Mostrar el número de movimientos de cada tipo.
SELECT m.id_tipo, t.nombre, COUNT(*) AS numero_movimientos
FROM movimiento m
INNER JOIN tipo t ON m.id_tipo = t.id_tipo
GROUP BY m.id_tipo, t.nombre;

#13. Mostrar todos los movimientos que puedan envenenar.
SELECT m.id_tipo, t.nombre, COUNT(*) AS numero_movimientos
FROM movimiento m
INNER JOIN tipo t ON m.id_tipo = t.id_tipo
where t.nombre = 'Veneno'
GROUP BY m.id_tipo, t.nombre;

#14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
SELECT *
FROM movimiento 
where descripcion like 'Causa daño%'
order by nombre;

#15. Mostrar todos los movimientos que aprende pikachu.
select distinct m.nombre
from movimiento m
INNER JOIN pokemon_movimiento_forma pf ON pf.id_movimiento = m.id_movimiento
where pf.numero_pokedex = 25; 
 
#16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
select distinct m.nombre
from movimiento m
INNER JOIN pokemon_movimiento_forma pf 
ON pf.id_movimiento = m.id_movimiento 
JOIN forma_aprendizaje fa 
ON fa.id_forma_aprendizaje = pf.id_forma_aprendizaje
where pf.numero_pokedex = 25 
and fa.id_tipo_aprendizaje = 1; 

#17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
select m.nombre
from movimiento m
INNER JOIN pokemon_movimiento_forma pf 
ON pf.id_movimiento = m.id_movimiento
JOIN forma_aprendizaje fa 
ON fa.id_forma_aprendizaje = pf.id_forma_aprendizaje
JOIN tipo t 
ON t.id_tipo = m.id_tipo
where pf.numero_pokedex = 25 
and t.nombre = 'normal' 
and id_tipo_aprendizaje = 3;

#18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.
select m.nombre, me.probabilidad
from movimiento m
INNER JOIN movimiento_efecto_secundario me 
ON m.id_movimiento = me.id_movimiento
where me.probabilidad > 30; 

#19. Mostrar todos los pokemon que evolucionan por piedra. 

20. Mostrar todos los pokemon que no pueden evolucionar. 
21. Mostrar la cantidad de los pokemon de cada tipo. 
