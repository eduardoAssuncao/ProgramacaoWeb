alter table locacao add foreign key (id_inquilino) references cliente (id);
alter table locacao add foreign key (id_imovel) references imovel (id);
alter table aluguel add foreign key (id_locacao) references locacao(id);