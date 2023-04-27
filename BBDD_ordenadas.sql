CREATE TABLE pokedex (
num_pokedex DECIMAL(5) PRIMARY KEY,
nombre_pokemon VARCHAR(20) NOT NULL,
tipo1 VARCHAR(15) NOT NULL,
tipo2 VARCHAR(15) NOT NULL,
img_frente VARCHAR(200),
img_espaldas VARCHAR(200),
sonido VARCHAR(200)
);
CREATE TABLE entrenador (
id_entrenador DECIMAL(3) PRIMARY KEY,
nombre VARCHAR(30) NOT NULL,
pokedollars INTEGER(11) NOT NULL
);
CREATE TABLE objeto(
id_objeto DECIMAL(5) PRIMARY KEY,
nombre_objeto VARCHAR(15),
precio DECIMAL,
estadistica_mejora VARCHAR(30)
);
CREATE TABLE mochila(
id_entrenador DECIMAL(3),
id_objeto DECIMAL(5),
cant_objeto DECIMAL(2)
);
CREATE TABLE pokemon (
id_pokemon DECIMAL(5) PRIMARY KEY,
id_entrenador DECIMAL(5),
CONSTRAINT entrenador_fk FOREIGN KEY (id_entrenador) REFERENCES pokemon (id_pokemon), 
nombre_pokemon VARCHAR(20),
num_pokedex DECIMAL(3),
mote VARCHAR(30),
sexo VARCHAR(1),
nivel DECIMAL(3),
vitalidad INTEGER(3),
ataque INTEGER(3),
defensa INTEGER(3),
ata_especial INTEGER(3),
def_especial INTEGER(3),
velocidad INTEGER(3),
estamina INTEGER(3),
fertilidad INTEGER(1),
experiencia INTEGER(4),
id_objeto DECIMAL(5),
CONSTRAINT objeto_fk FOREIGN KEY (id_objeto) REFERENCES objeto (id_objeto)
);
CREATE TABLE movimiento(
id_movimiento DECIMAL(5) PRIMARY KEY,
nombre_movimiento VARCHAR(20) NOT NULL,
nivel_aprendizaje INTEGER(3) NOT NULL,
potencia INTEGER(3) NOT NULL,
nombre_estado VARCHAR(15) NOT NULL,
turnos_estado INTEGER(1) NOT NULL,
nombre_mejora VARCHAR(15) NOT NULL,
turnos_mejora INTEGER(1) NOT NULL
);
CREATE TABLE poke_movi(
id_pokemon DECIMAL(5),
id_movimiento DECIMAL(5),
CONSTRAINT poke_fk FOREIGN KEY (id_pokemon) REFERENCES pokemon (id_pokemon) 
);
