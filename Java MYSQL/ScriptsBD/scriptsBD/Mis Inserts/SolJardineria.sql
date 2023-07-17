#1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
select codigo_oficina, ciudad 
from oficina;
#2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
select ciudad, telefono 
from oficina 
where pais = 'España'; 
#3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un
#código de jefe igual a 7.
select nombre, apellido1, apellido2, email 
from empleado 
where codigo_jefe = 7;
#4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
select nombre, apellido1, apellido2, email, puesto 
from empleado 
where codigo_empleado = 1;
#5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean
#representantes de ventas.
select nombre, apellido1, apellido2, puesto 
from empleado 
where puesto <> 'Representante Ventas';
#6. Devuelve un listado con el nombre de los todos los clientes españoles.
select nombre_cliente 
from cliente 
where pais = 'Spain';
#7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
select distinct estado 
from pedido;
#8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago
#en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan
#repetidos. Resuelva la consulta:
#o Utilizando la función YEAR de MySQL.
#o Utilizando la función DATE_FORMAT de MySQL.
#o Sin utilizar ninguna de las funciones anteriores.
select distinct codigo_cliente, fecha_pago 
from pago 
#where year(fecha_pago) = 2008; 
where DATE_FORMAT(fecha_pago, '%Y') = 2008;

#9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
#entrega de los pedidos que no han sido entregados a tiempo.
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega 
from pedido
where fecha_entrega > fecha_esperada; 

#10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
#entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha
#esperada.
#o Utilizando la función ADDDATE de MySQL.
#o Utilizando la función DATEDIFF de MySQL.
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega 
from pedido
where fecha_entrega <= adddate(fecha_esperada, interval -2 day); 

#11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
select * from pedido 
where estado = 'Rechazado' 
AND year(fecha_pedido) = 2009;

#12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de
#cualquier año.
select * from pedido
where DATE_FORMAT(fecha_entrega, '%m') = 01;

#13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
#Ordene el resultado de mayor a menor.
select * from pago 
where forma_pago = 'Paypal' 
AND year(fecha_pago) = 2008
order by total desc;

#14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en
#cuenta que no deben aparecer formas de pago repetidas.
select distinct forma_pago from pago;

#15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que
#tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de
#venta, mostrando en primer lugar los de mayor precio.
select * from producto
where gama = 'Ornamentales'
AND cantidad_en_stock > 100
order by precio_venta desc; 

#16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo
#representante de ventas tenga el código de empleado 11 o 30.
select * from cliente
where ciudad = 'Madrid'
AND codigo_empleado_rep_ventas IN(11,30);




###############################Consultas multitabla (Composición interna)
#Las consultas se deben resolver con INNER JOIN.

#1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante
#de ventas.
select c.nombre_cliente, e.nombre, e.apellido1, e.apellido2 
from cliente c
inner join empleado e
ON e.codigo_empleado = c.codigo_empleado_rep_ventas;

#2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus
#representantes de ventas.
select c.nombre_cliente, e.nombre, e.apellido1, e.apellido2 
from cliente c
inner join empleado e
ON e.codigo_empleado = c.codigo_empleado_rep_ventas
inner join pago p
ON c.codigo_cliente = p.codigo_cliente
where p.total > 0;

#3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de
#sus representantes de ventas.
select c.nombre_cliente, e.nombre, e.apellido1, e.apellido2 
from cliente c
inner join empleado e
ON e.codigo_empleado = c.codigo_empleado_rep_ventas
inner join pago p
ON c.codigo_cliente = p.codigo_cliente
where p.total = 0;

#4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes
#junto con la ciudad de la oficina a la que pertenece el representante.
select c.nombre_cliente, e.nombre, e.apellido1, e.apellido2, o.ciudad 
from cliente c
inner join empleado e
ON e.codigo_empleado = c.codigo_empleado_rep_ventas
inner join pago p
ON c.codigo_cliente = p.codigo_cliente
inner join oficina o
on e.codigo_oficina = o.codigo_oficina;

#5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus
#representantes junto con la ciudad de la oficina a la que pertenece el representante.
select c.nombre_cliente, e.nombre, e.apellido1, e.apellido2, o.ciudad 
from cliente c
inner join empleado e
ON e.codigo_empleado = c.codigo_empleado_rep_ventas
inner join pago p
ON c.codigo_cliente = p.codigo_cliente
inner join oficina o
on e.codigo_oficina = o.codigo_oficina
where p.total is null;