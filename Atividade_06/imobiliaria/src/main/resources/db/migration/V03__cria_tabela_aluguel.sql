    create table aluguel (
        id integer not null auto_increment,
        tipo varchar(50) not null,
        endereco varchar(255) not null,
        cep varchar(10) not null,
        dormitorios int not null,
        banheiros int not null,
        suites int not null,
        metragem int not null,
        valor_aluguel_sug DECIMAL not null,
        obs TEXT,

        primary key (id)
    );