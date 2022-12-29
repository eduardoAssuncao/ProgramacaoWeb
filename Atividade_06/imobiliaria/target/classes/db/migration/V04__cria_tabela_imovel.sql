    create table imovel (
        id integer not null auto_increment,
        id_locacao integer not null,
        vencimento DATE not null,
        valor_pago DECIMAL not null,
        obs TEXT,

        primary key (id),
        foreign key (id_locacao) references locacao(id_locacao)
    );