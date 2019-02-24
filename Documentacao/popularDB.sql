insert into proprietario values
	('100.100.100-00', 'prop0@hotmail.com', 'Aaron Santos', '99999-0000'),
	('100.100.100-01', 'prop1@hotmail.com', 'Abel Santos', '99999-0001'),
	('100.100.100-02', 'prop2@hotmail.com', 'Abelardo Santos', '99999-0002'),
	('100.100.100-03', 'prop3@hotmail.com', 'Abelino Santos', '99999-0003'),
	('100.100.100-04', 'prop4@hotmail.com', 'Abiezer Santos', '99999-0004'),
	('100.100.100-05', 'prop5@hotmail.com', 'Adalberto Santos', '99999-0005'),
	('100.100.100-06', 'prop6@hotmail.com', 'Adélcio Santos', '99999-0006'),
	('100.100.100-07', 'prop7@hotmail.com', 'Adriano Santos', '99999-0007');

insert into adm values
	('Balbino_Adm', 'adm0@hotmail.com', 'Balbino Ferreira', 'balbino_123', '99999-1000'),
	('Baltazar_Adm', 'adm1@hotmail.com', 'Baltazar Ferreira', 'baltazar_roqueiro', '99999-1001'),
	('Benedito_Adm', 'adm2@hotmail.com', 'Benedito Ferreira', 'benedito_gala', '99999-1002');

insert into corretor values
	('200.200.200-00', null, 'corret0@hotmail.com', 'Cacilda Prado', 'cacildo', '99999-2000'),
	('200.200.200-01', null, 'corret1@hotmail.com', 'Cailane Prado', 'caindo', '99999-2001'),
	('200.200.200-02', null, 'corret2@hotmail.com', 'Camille Prado', 'carinho', '99999-2002'),
	('200.200.200-03', null, 'corret3@hotmail.com', 'Carina Prado', 'corote', '99999-2003'),
	('200.200.200-04', null, 'corret4@hotmail.com', 'Carmela Prado', 'cebola', '99999-2004'),
	('200.200.200-05', null, 'corret5@hotmail.com', 'Carmina Prado', 'cenoura', '99999-2005');

insert into comprador values
	('300.300.300-00', 'comprad0@hotmail.com', 'Dacelina Costa', '99999-3000'),
	('300.300.300-01', 'comprad1@hotmail.com', 'Daci Costa', '99999-3001'),
	('300.300.300-02', 'comprad2@hotmail.com', 'Dafne Costa', '99999-3002'),
	('300.300.300-03', 'comprad3@hotmail.com', 'Daisy Costa', '99999-3003'),
	('300.300.300-04', 'comprad4@hotmail.com', 'Dalinda Costa', '99999-3004');

insert into locatario values
	('400.400.400-00', 'locat0@hotmail.com', 'Ecilia Matos', '99999-4000'),
	('400.400.400-01', 'locat1@hotmail.com', 'Eden Matos', '99999-4001'),
	('400.400.400-02', 'locat2@hotmail.com', 'Edenia Matos', '99999-4002');

insert into tipo_imovel (emcondominio, nome) values
	(TRUE, 'Apartamento'),
	(TRUE, 'Casa'),
	(FALSE, 'Casa'),
	(FALSE, 'Prédio'),
	(FALSE, 'Apartamento'),
	(FALSE, 'Fazenda'),
	(FALSE, 'Ponto comercial');

insert into endereco (cep, uf, bairro, cidade, complemento, logradouro, numero) values
	('49000-001', 'se', 'centro', 'aracaju', 'rua lagarto', null, '236'),
	('49000-002', 'se', 'centro', 'aracaju', 'rua banana', null, '154'),
	('49000-003', 'se', 'centro', 'aracaju', 'rua abacaxi', null, '27'),
	('49000-004', 'se', 'coroa do meio', 'aracaju', 'av riomar', null, '909'),
	('49000-005', 'se', 'coroa do meio', 'aracaju', 'rua limonada', null, '77'),
	('49000-006', 'se', 'coroa do meio', 'aracaju', 'rua chuelo', null, '6'),
	('49000-007', 'se', 'farolandia', 'aracaju', 'rua farol', null, '11'),
	('49000-008', 'se', 'farolandia', 'aracaju', 'rua batata', null, '26'),
	('49000-009', 'se', 'farolandia', 'aracaju', 'rua unit', null, '554'),
	('49000-010', 'se', 'centro', 'nossa senhora das dores', 'rua do circo', 'onde valmir mora', '666'),
	('40000-011', 'ba', 'comercio', 'salvador', 'av pelourinho', null, '77'),
	('40000-012', 'ba', 'centro', 'salvador', 'rua do paraiso', null, '777'),
	('40000-013', 'ba', 'centro', 'salvador', 'rua carlos gomes', null, '98'),
	('40000-014', 'ba', 'centro', 'salvador', 'av joana evangelica', null, '555'),
	('40000-015', 'ba', 'comercio', 'salvador', 'rua estados unidos', null, '198'),
	('40000-016', 'ba', 'comercio', 'salvador', 'av jequiti', null, '25'),
	('40000-017', 'ba', 'centro', 'euclides da cunha', 'rua thome', null, '1'),
	('57000-018', 'al', 'centro', 'maceio', 'rua maceio', null, '888'),
	('57000-019', 'al', 'centro', 'maceio', 'rua mar', null, '288'),
	('57000-020', 'al', 'centro', 'maceio', 'rua ceio', null, '822'),
	('50000-021', 'pe', 'centro', 'recife', 'rua recife', null, '335'),
	('50000-022', 'pe', 'centro', 'recife', 'av pernambuco', null, '37');

insert into imovel (area, descricao, fotos, numbanheiros, numquartos, numsuites, situacao_imovel, vagasgaragem, 
					valoraluguel, valorcompra, adm_login, endereco_idendereco, proprietario_cpf, tipo_imovel_idtipoimovel) values
	(25, 'Comfortavel', null, 2, 2, 1, 5, 2, 500, 180000,'Balbino_Adm',1,'100.100.100-00',2),
	(50, 'Vista da praia', null, 2, 3, 1, 5, 1, 500, 250000,'Balbino_Adm',2, '100.100.100-01',6),
	(15, 'Joinha', null, 1, 1, 0, 1, 1, 250, 0,'Balbino_Adm',3, '100.100.100-01',5),
	(18, 'Bacana', null, 1, 2, 0, 1, 1, 275, 0,'Balbino_Adm',4, '100.100.100-01',5),
	(20, 'Legal', null, 2, 3, 2, 5, 3, 650, 335000,'Balbino_Adm',5, '100.100.100-02',3),
	(25, 'Massa', null, 1, 1, 1, 4, 2, 500, 0,'Balbino_Adm',6, '100.100.100-02',5),
	(30, 'Show', null, 1, 2, 0, 4, 1, 300, 175000,'Balbino_Adm',7, '100.100.100-03',1),
	(28, 'Bom', null, 2, 2, 1, 4, 2, 400, 200000,'Balbino_Adm',8, '100.100.100-03',2),
	(25, 'Ótimo', null, 2, 2, 1, 5, 1, 500, 200000,'Balbino_Adm',9, '100.100.100-03',2),
	(22, 'Perto do movimento', null, 2, 0, 0, 2, 10, 0, 450000,'Balbino_Adm',10, '100.100.100-04',7),
	(22, 'Mobiliada', null, 1, 2, 0, 2, 2, 0, 250000,'Baltazar_Adm',11, '100.100.100-04',3),
	(25, 'Mobiliada', null, 2, 3, 1, 2, 2, 0, 260000,'Baltazar_Adm',12, '100.100.100-04',5),
	(24, 'Bom acesso', null, 2, 2, 1, 2, 2, 500, 200000,'Baltazar_Adm',13, '100.100.100-04',1),
	(32, 'Amplo', null, 2, 2, 1, 2, 2, 0, 230000,'Baltazar_Adm',14, '100.100.100-04',2),
	(16, 'Interessante', null, 1, 1, 1, 3, 1, 300, 150000,'Baltazar_Adm',15, '100.100.100-04',5),
	(25, null, null, 3, 2, 2, 3, 2, 450, 250000,'Benedito_Adm',16, '100.100.100-05',1),
	(16, null, null, 2, 2, 1, 3, 2, 500, 200000,'Benedito_Adm',17, '100.100.100-05',1),
	(32, null, null, 3, 3, 3, 3, 1, 600, 220000,'Benedito_Adm',18, '100.100.100-05',3),
	(25, null, null, 1, 2, 2, 3, 3, 550, 240000,'Benedito_Adm',19, '100.100.100-05',2),
	(22, null, null, 2, 2, 1, 3, 1, 400, 223000,'Benedito_Adm',20, '100.100.100-05',2),
	(18, null, null, 3, 2, 2, 3, 2, 600, 260000,'Benedito_Adm',21, '100.100.100-05',4),
	(25, 'Circo do valmir', null, 0, 0, 0, 5, 0, 0, 0,'Baltazar_Adm',22, '100.100.100-06',7);


insert into contrato_aluguel (datafechamento, datafim, datainicio, descricaoaluguel, valoraluguel, corretor_cpf, imovel_id, locatario_cpf) values
	('24/02/2019','24/04/2020','24/03/2019','Pagamento todo dia 24.',300,'200.200.200-00',7,'400.400.400-00'),
	('20/02/2019','01/03/2020','01/03/2019','Pagamento no primeiro dia do mês',400,'200.200.200-01',8,'400.400.400-01'),
	('05/02/2019','05/12/2019','05/03/2019','Tolerancia de atraso do pagamento: cinco (05) dias.',500,'200.200.200-05',6,'400.400.400-02');

insert into contrato_venda (datafechamento, descricaovenda, valorvenda, comprador_cpf, corretor_cpf, imovel_id) values
	('15/02/2019','Pagamento mensal de parcelas de R$4000',200000,'300.300.300-00','200.200.200-02',9),
	('11/02/2019','Pagamento anual de R$18000',180000,'300.300.300-01','200.200.200-02',1),
	('22/02/2019','Pagamento mensal de R$3600',250000,'300.300.300-02','200.200.200-02',2),
	('11/02/2019','Pagamento anual de R$18000',335000,'300.300.300-03','200.200.200-03',5),
	('30/02/2019','É um circo, com valmir dentro. Pode pegar de graça.',0,'300.300.300-04','200.200.200-04',22);