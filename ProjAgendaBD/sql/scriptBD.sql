CREATE TABLE IF NOT EXISTS Socio(
	cpf int,
	nome text,
	data_adm text
);

CREATE TABLE IF NOT EXISTS Dependente(
	id serial,
	nome text,
	idade int
);