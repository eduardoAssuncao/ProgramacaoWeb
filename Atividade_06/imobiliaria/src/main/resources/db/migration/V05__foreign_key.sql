alter table locacao add constraint fk_locacao_cliente foreign key (id_inquilino) references cliente (id);
alter table locacao add constraint fk_locacao_imovel foreign key (id_imovel) references imovel (id);
alter table aluguel add constraint fk_aluguel_locacao foreign key (id_locacao) references locacao(id);