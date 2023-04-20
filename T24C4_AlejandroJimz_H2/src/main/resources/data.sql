
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
        apellido varchar(255),
	trabajo varchar(250),
	dni integer,
    salario integer 
);

insert into empleado (nombre, apellido,trabajo,dni)values('Jose','Marin','calle imaginaria 1',123456789);
insert into empleado (nombre, apellido,trabajo,dni)values('Juan','Lopez','calle imaginaria 2',122222222);
insert into empleado (nombre, apellido,trabajo,dni)values('Pedro','Guillem','calle imaginaria 3',123333333);
insert into empleado (nombre, apellido,trabajo,dni)values('Jordi','Martin','calle imaginaria 4',123444444);
insert into empleado (nombre, apellido,trabajo,dni)values('Jonatan','Vicente','calle imaginaria 5',123455555);