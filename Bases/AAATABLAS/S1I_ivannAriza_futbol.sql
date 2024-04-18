drop database if exists futbol;
create database futbol;
USE futbol;

DROP TABLE IF EXISTS presidente;
CREATE TABLE presidente(
	DNI_presidente char(9),
    NombrePresi varchar(25),
    Apellidos varchar(25),
    fechaEleccion date,
    fechaNac date,
    check (fechaNac > 01/01/2007),
    constraint PK_DNIPres primary key (DNI_presidente)
    );
 
DROP TABLE IF EXISTS partido;
CREATE TABLE partido(
	CodPartido tinyint,
	Fecha date,
	CodEquipoLocal smallint,
	CodEquipoVisitante smallint,
	constraint PK_CodPar primary key (CodPartido),
    foreign key (CodEquipoLocal) references Equipos(CodEquipo),
    foreign key (CodEquipoVisitante) references Equipos(CodEquipo)
    );
    
DROP TABLE IF EXISTS Estadios;
CREATE TABLE Estadios(
	Estadio char(40),
    Aforo tinyint,
    Ciudad char(25),
	constraint PK_Est primary key (Estadio)
);
    
DROP TABLE IF EXISTS equipo;
CREATE TABLE equipo(
	CodEquipo smallint,
    NombreEqui char(25),
    Estadio char(40),
    DNI_presidente char(9),
	constraint PK_CodEq primary key (CodEquipo),
    foreign key (Equipo) REFERENCES Equipos (Equipo)
);

DROP TABLE IF EXISTS jugador;
CREATE TABLE jugador(
	CodJugador tinyint, 
    NombreJug char(25),
    Posicion enum("portero", "defensa", "centrocampista", "delantero"),
    FechaNac date,
    CodEquipo smallint,
    constraint PK_codJu primary key (CodJugador),
    foreign key (CodEquipo) references Equipos(CodEquipo)
);

DROP TABLE IF EXISTS Goles;
CREATE TABLE Goles(
	CodPartido tinyint,
    CodJugador tinyint,
    Descripción char(70),
    minuto datetime,
    constraint PK_gol primary key (CodPartido, CodJugador),
    foreign key (CodPartido) references Partido(CodPartido),
    foreign key (CodJugador) references Jugador(CodJugador)
);

///
drop database if exists futbol;
create database futbol;
USE futbol;

DROP TABLE IF EXISTS presidente;
CREATE TABLE presidente(
	DNI_presidente char(9),
    NombrePresi varchar(25),
    Apellidos varchar(25),
    fechaEleccion date,
    fechaNac date,
    check (fechaNac > 01/01/2007),
    constraint PK_DNIPres primary key (DNI_presidente)
    );
 
DROP TABLE IF EXISTS partido;
CREATE TABLE partido(
	CodPartido smallint,
	Fecha datetime not null,
	CodEquipoLocal tinyint unsigned,
	CodEquipoVisitante tinyint unsigned,
	constraint PK_CodPar primary key (CodPartido),
    foreign key (CodEquipoLocal) references Equipos(CodEquipo),
    foreign key (CodEquipoVisitante) references Equipos(CodEquipo)
    );
    
DROP TABLE IF EXISTS Estadios;
CREATE TABLE Estadios(
	Estadio char(40),
    Aforo mediumint unsigned,
    Ciudad char(25),
	constraint PK_Est primary key (Estadio)
);
    
DROP TABLE IF EXISTS equipo;
CREATE TABLE equipo(
	CodEquipo tinyint unsigned auto_increment,
    NombreEqui char(25),
    Estadio char(40),
    DNI_presidente char(9),
	constraint PK_CodEq primary key (CodEquipo),
    foreign key (Equipo) REFERENCES Equipos (Equipo)
);

DROP TABLE IF EXISTS jugador;
CREATE TABLE jugador(
	CodJugador smallint unsigned auto_increment, 
    NombreJug char(25),
    Posicion enum("portero", "defensa", "centrocampista", "delantero"),
    FechaNac date,
    CodEquipo smallint,
    constraint PK_codJu primary key (CodJugador),
    foreign key (CodEquipo) references Equipos(CodEquipo)
);

DROP TABLE IF EXISTS Goles;
CREATE TABLE Goles(
	CodPartido tinyint,
    CodJugador tinyint,
    Descripción char(70),
    minuto datetime,
    constraint PK_gol primary key (CodPartido, CodJugador),
    foreign key (CodPartido) references Partido(CodPartido),
    foreign key (CodJugador) references Jugador(CodJugador)
);