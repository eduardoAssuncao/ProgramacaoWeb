    create table locacao (
        id integer not null auto_increment,
        id_imovel int not null,
        id_inquilino int not null,
        ativo TINYINT,
        fim DATE not null,
        inicio DATE not null,
        vencimento int not null,
        perc_multa DECIMAL not null,
        valor_aluguel DECIMAL not null,
        obs TEXT,

        primary key(id),
        foreign key (id_inquilino) references cliente (id),
        foreign key (id_imovel) references imovel (id)
    );

    --alter table locacao add constraint fk_locacao_cliente foreign key (id_inquilino) references cliente (id);
    --alter table locacao add constraint fk_locacao_imovel foreign key (id_imovel) references imovel (id);