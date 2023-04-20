
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
    trabajo varchar (255),
       salario double,
       fecha date
);

insert into empleado(nombre, trabajo,salario,fecha)values('Jose','gestor',1.500,CURDATE());
insert into empleado(nombre,trabajo,salario,fecha) values ('Alberto','operario',20.000,CURDATE());
insert into empleado(nombre,trabajo,salario,fecha) values ('Juan','administrador',20.000,CURDATE());