#1. Obtener los datos completos de los empleados.
USE personal;
SELECT * FROM empleados;
#2. Obtener los datos completos de los departamentos.
SELECT * FROM departamentos;
#3. Listar el nombre de los departamentos.
SELECT nombre_depto from departamentos;
#4. Obtener el nombre y salario de todos los empleados.
select nombre, sal_emp from empleados;
#5. Listar todas las comisiones.
select comision_emp from empleados;
#6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
SELECT * FROM empleados WHERE cargo_emp = 'secretaria';
#7. Obtener los datos de los empleados vendedores, ordenados por nombre
#alfabéticamente.
select * from empleados WHERE cargo_emp ='vendedor' ORDER BY nombre ASC;
#8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a
#mayor.
select nombre, cargo_emp from empleados order by sal_emp asc;
#9. Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad
#“Ciudad Real”
select nombre_jefe_depto from departamentos where ciudad = 'ciudad real';
#10. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las 
#respectivas tablas de empleados.
select nombre AS Nombre, cargo_emp AS Cargo from empleados;
#11. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado 
#por comisión de menor a mayor 
select sal_emp, comision_emp from empleados where id_depto = 2000 order by comision_emp asc;
#12. Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta 
#de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del 
#empleado y el total a pagar, en orden alfabético. 
SELECT nombre, (sal_emp + comision_emp + 500) as salTotal FROM empleados where id_depto = 3000 order by nombre asc;
#13. Muestra los empleados cuyo nombre empiece con la letra J
select nombre from empleados where nombre like 'j%';
#14. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos 
#empleados que tienen comisión superior a 1000. - Revisar
select nombre, sal_emp, comision_emp, (sal_emp + comision_emp) as SalarioTotal from empleados where comision_emp > 1000;
#15. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen 
#comisión.
select nombre, sal_emp, comision_emp, (sal_emp + comision_emp) as SalarioTotal from empleados where comision_emp = 0;
#16. Obtener la lista de los empleados que ganan una comisión superior a su sueldo
SELECT * FROM empleados where comision_emp > sal_emp;
#17. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo
select * from empleados where comision_emp <= (sal_emp*0.3);
#18. Hallar los empleados cuyo nombre no contiene la cadena “MA”
select nombre from empleados where nombre not like '%ma%';
#19. Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o
#‘Mantenimiento
select nombre_depto from departamentos where nombre_depto IN('ventas','investigación','mantenimiento');
#20. Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni 
#“Investigación” ni ‘Mantenimiento.
select nombre_depto from departamentos where nombre_depto NOT IN('ventas','investigación','mantenimiento');
#21. Mostrar el salario más alto de la empresa.
select MAX(sal_emp) from empleados; 
#22. Mostrar el nombre del último empleado de la lista por orden alfabético.
select MAX(nombre) 
from empleados 
order by nombre asc;
#23. Hallar el salario más alto, el más bajo y la diferencia entre ellos - no me funciona
select MAX(sal_emp) AS SalarioAlto, MIN(sal_emp) AS SalarioBajo, MAX(sal_emp)-MIN(sal_emp) AS Diferencia 
from empleados;
#24. Hallar el salario promedio por departamento.
select id_depto, avg(sal_emp) as Promedio 
from empleados 
group by id_depto;
#-------------------------------Consultas Having----------------------------------- 

#25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de 
#empleados de esos departamentos.
select count(id_emp) as NumeroEmpleados, id_depto 
from empleados 
group by id_depto 
having count(id_emp) > 3; 

#26. Hallar los departamentos que no tienen empleados
select count(id_emp) as NumeroEmpleados, id_depto 
from empleados 
group by id_depto 
having count(id_emp) = 0; 
#--------------------------------Consultas JOIN ------------------------------------
#27. Mostrar la lista de empleados, con su respectivo departamento y el jefe de cada departamento.
select nombre,nombre_depto, nombre_jefe_depto 
from empleados 
join departamentos 
ON empleados.id_depto = departamentos.id_depto;

#28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la 
#empresa. Ordenarlo por departamento.
select nombre, sal_emp 
from empleados 
inner join departamentos 
ON empleados.id_depto = departamentos.id_depto 
where sal_emp > (select avg(sal_emp) 
from empleados) 
order by nombre_depto asc; 