use b2zdiqr32w5nlicn4lna;

create table Partido(
	id int auto_increment primary key,
	equipoLocal varchar(50) not null,
    equipoVisitante varchar(50) not null,
    cestasLocal int not null,
    cestasVisitante int not null,
    estado enum("Activo", "Finalizado") not null,
    fechaPartido date not null
);

create table Liga(
	id_partido int,
    jornada int not null,
    foreign key (id_partido) references Partido(id),
    primary key (id_partido)
);

create table PlayOffs(
	id_partido int,
    ronda enum("Octavos","Cuartos","Final"),
    foreign key (id_partido) references Partido(id),
    primary key (id_partido)
);


