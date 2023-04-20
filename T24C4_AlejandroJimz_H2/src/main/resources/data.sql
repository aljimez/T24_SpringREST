
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
    trabajo enum ('gestor','administrador','operario'),
       salario int
);

insert into empleado(nombre, trabajo,salario)values('Jose','gestor',1500);
insert into empleado(nombre,trabajo,salario) values ('Alberto','operario',20000);
insert into empleado(nombre,trabajo,salario) values ('Juan','administrador',20000);