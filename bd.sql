/* Lógico_1: */

CREATE TABLE usuarios (
    cod_usuario INT auto_increment PRIMARY KEY,
    nome VARCHAR(50),
    logradouro VARCHAR(50),
    numero smallint,
    bairro VARCHAR(50),
    cidade VARCHAR(50),
    cep INT,
    telefone VARCHAR(20),
    email VARCHAR(50),
    perfil VARCHAR(20)
);

CREATE TABLE contas (
    cod_conta int auto_increment PRIMARY KEY,
    data_leitura date,
    valor decimal(8,2),
    consumo decimal(8,2),
    cod_usuario INT
);

CREATE TABLE dispositivos (
    cod_dispositivo INT auto_increment PRIMARY KEY,
    nome VARCHAR(20),
    mac VARCHAR(20),
    status_rede VARCHAR(20),
    cod_usuario INT
);
 
ALTER TABLE contas ADD CONSTRAINT FK_contas_2
    FOREIGN KEY (cod_usuario)
    REFERENCES usuarios (cod_usuario)
    ON DELETE CASCADE;
 
ALTER TABLE dispositivos ADD CONSTRAINT FK_dispositivos_2
    FOREIGN KEY (cod_usuario)
    REFERENCES usuarios (cod_usuario)
    ON DELETE CASCADE;
