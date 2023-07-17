#CANDADO A
#Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
#siguiente/s consulta/s:

#Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
#Este resultado nos dará la posición del candado (1, 2, 3 o 4)
select count(*)
from estadisticas e
group by e.Asistencias_por_partido
order by e.Asistencias_por_partido desc
limit 1;

#Posicion -- 2
#Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
#datos:
#Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
#centro o esté comprendida en otras posiciones.
select SUM(j.peso) as Peso
from jugadores j
join equipos e
ON e.Nombre = j.Nombre_equipo
where e.Conferencia = "East" and j.Posicion like "%C%";

###clave ---- 14043 
#CANDADO B
#Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
#siguiente/s consulta/s:
#Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
#jugadores que tiene el equipo Heat.
#Este resultado nos dará la posición del candado (1, 2, 3 o 4)
SELECT count(jugador) as Jugadores_con_mas_asistencias
FROM estadisticas e
JOIN jugadores j ON e.jugador = j.codigo
WHERE e.Asistencias_por_partido > (SELECT COUNT(Nombre) FROM jugadores WHERE Nombre_equipo = 'Heat');

####Posicion-- 3
#Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
#datos:
#La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.
SELECT count(temporada) FROM partidos
WHERE temporada LIKE '%99%';
-- CANDADO B
-- La posiciom es 3
-- La clave es 3480

#CANDADO C
#Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
#siguiente/s consulta/s:
#La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
#parte de equipos de la conferencia oeste.
#Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
#195, y a eso le vamos a sumar 0.9945.
#Este resultado nos dará la posición del candado (1, 2, 3 o 4)
SELECT count(*) /
(select count(*) from jugadores ju where ju.Peso >= 195) + 0.9945 as Cantidad_Jugadores
FROM jugadores j
JOIN equipos e 
ON e.Nombre = j.Nombre_equipo 
WHERE e.Nombre = 'Michigan' AND e.Conferencia ='West';

##Posicion 1
#Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
#datos:
#Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
#sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
#tapones por partido. Además, este resultado debe ser, donde la división sea central.

SELECT floor(avg(est.Puntos_por_partido)+count(est.asistencias_por_partido)+sum(est.tapones_por_partido)) 
FROM estadisticas est 
JOIN jugadores j 
ON est.jugador=j.codigo
JOIN equipos eq 
ON j.Nombre_equipo=eq.Nombre
WHERE eq.Division='Central';


-- CANDADO C
-- La posicion es 1
-- La clave es 631

#CANDADO D
#Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
#siguiente/s consulta/s:
#Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
#resultado debe ser redondeado. Nota: el resultado debe estar redondeado
#Este resultado nos dará la posición del candado (1, 2, 3 o 4)

select round(es.Tapones_por_partido) as Tapones_Partido
from estadisticas es
join jugadores j 
on j.codigo = es.jugador 
where j.Nombre = "Corey Maggette" and es.temporada = '00/01';

#Clave: La clave del candado D estará conformada por la/s siguientes consulta/s a la base de
#datos:
#Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
#de todos los jugadores de procedencia argentina.
SELECT floor(Sum(e.puntos_por_partido))
FROM estadisticas e JOIN jugadores j ON e.jugador=j.codigo
WHERE Procedencia="Argentina";
-- CANDADO D
-- La posicion es 4
-- La clave es 191

