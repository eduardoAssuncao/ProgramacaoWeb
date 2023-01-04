insert into cliente(nome, cpf, telefone, email, nascimento) values('Eduardo', '77893324212', '98987337489', 'eduardo@gmail.com', '2001-07-13');

insert into imovel(tipo, endereco, cep, dormitorios, banheiros, suites, metragem, valor_aluguel_sug, obs) values('T2', 'Av Esperança', '65069790', 2, 2, 1, 50, 250.00, 'Imovel teste');

insert into locacao(id_imovel, id_inquilino, ativo, fim, inicio, vencimento, perc_multa, valor_aluguel, obs) values(1, 1, 1, '2023-02-10', '2022-12-01', 10, 0.4, 240.00, 'Locação teste');

insert into aluguel(id_locacao, vencimento, valor_pago, obs) values(1, '2023-02-10', 240.00, 'Aluguel teste');

