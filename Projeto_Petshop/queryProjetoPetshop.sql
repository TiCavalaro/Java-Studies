CREATE TABLE cliente (
    idCliente SERIAL,
    nomeCliente VARCHAR(50),
    cpfCliente VARCHAR(14) UNIQUE,
    telefoneCliente VARCHAR(15),
    rua VARCHAR(50),
    numero INTEGER,
    bairro VARCHAR(30),
    cidade VARCHAR(30),
    estado VARCHAR(2),
    cep VARCHAR(9),
    CONSTRAINT cliente_pkey PRIMARY KEY (idCliente)
);

CREATE TABLE animal (
    idAnimal SERIAL,
    nomeAnimal VARCHAR(30),
    sexoAnimal VARCHAR(15),
    racaAnimal VARCHAR(20),
    idCliente INTEGER,
    CONSTRAINT animal_pkey PRIMARY KEY (idAnimal),
    CONSTRAINT animal_idCliente_fkey FOREIGN KEY (idCliente) REFERENCES cliente (idCliente)
);

CREATE TABLE venda (
    idVenda SERIAL,
    valorVenda DOUBLE PRECISION,
    dataVenda DATE,
    idCliente INTEGER,
    CONSTRAINT venda_pkey PRIMARY KEY (idVenda),
    CONSTRAINT venda_idCliente_fkey FOREIGN KEY (idCliente) REFERENCES cliente (idCliente)
);

CREATE TABLE servico (
    idServico SERIAL,
    tituloServico VARCHAR(50),
    valorServico DOUBLE PRECISION,
    CONSTRAINT servico_pkey PRIMARY KEY (idServico)
);

CREATE TABLE servicoVenda (
    idServico INTEGER,
    idVenda INTEGER,
    idAnimal INTEGER,
    valorServico DOUBLE PRECISION,
    CONSTRAINT servicoVenda_idServico_fkey FOREIGN KEY (idServico) REFERENCES servico (idServico),
    CONSTRAINT servicoVenda_idVenda_fkey FOREIGN KEY (idVenda) REFERENCES venda (idVenda),
    CONSTRAINT servicoVenda_idAnimal_fkey FOREIGN KEY (idAnimal) REFERENCES animal (idAnimal)
);