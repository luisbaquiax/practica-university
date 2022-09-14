CREATE DATABASE universidad;
USE universidad;

CREATE TABLE IF NOT EXISTS estudiante(
    carne VARCHAR(9) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    edad INT NOT NULL,
    PRIMARY KEY (carne)
);

CREATE TABLE IF NOT EXISTS curso(
    codigo VARCHAR(100) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    creditos INT NOT NULL,
    PRIMARY KEY (codigo)
);

CREATE TABLE IF NOT EXISTS asignacion(
    id INT AUTO_INCREMENT NOT NULL,
    carne VARCHAR(9) NOT NULL,
    curso VARCHAR(100) NOT NULL,
    fecha DATE NOT NULL,
    nota INT NOT NULL,
    estado BOOLEAN NOT NULL,
    oportunidad INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (carne) REFERENCES estudiante(carne),
    FOREIGN KEY (curso) REFERENCES curso(codigo)
);

CREATE TABLE IF NOT EXISTS profesor(
    colegiado VARCHAR(100) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    carne VARCHAR(100) NOT NULL,
    titulo VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY (colegiado)
);

CREATE TABLE IF NOT EXISTS administrador(
    codigo VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY (codigo)
);
