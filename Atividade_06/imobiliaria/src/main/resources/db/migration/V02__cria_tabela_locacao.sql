    create table locacao (
        id integer not null auto_increment,
        id_imovel integer not null,
        id_inquilino integer not null,
        ativo TINYINT,
        fim DATE not null,
        inicio DATE not null,
        vencimento int not null,
        perc_multa DECIMAL not null,
        valor_aluguel DECIMAL not null,
        obs TEXT,

        primary key(id),
        foreign key (id_inquilino) references cliente(id_inquilino),
        foreign key (id_imovel) references imovel(id_imovel)
    );