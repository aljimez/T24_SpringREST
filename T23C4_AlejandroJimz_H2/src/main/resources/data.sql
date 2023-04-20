
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
    trabajo enum ('gestor','administrador','operario'),
       salario int,
       fecha date
);

insert into empleado(nombre, trabajo,salario,fecha)values('Jose','gestor',1500,CURDATE());
insert into empleado(nombre,trabajo,salario,fecha) values ('Alberto','operario',20000,CURDATE());
insert into empleado(nombre,trabajo,salario,fecha) values ('Juan','administrador',20000,CURDATE());