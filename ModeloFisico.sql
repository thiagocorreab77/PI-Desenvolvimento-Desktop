create database dbFabioIldefonso;
use dbFabioIldefonso;

-- Criar tabela Cliente
CREATE TABLE Cliente (
    CNPJ VARCHAR(20) PRIMARY KEY,
    Nome VARCHAR(100),
    Cidade VARCHAR(100),
	Telefone VARCHAR(100),
	email VARCHAR(100)
);

-- Criar tabela Equipamento
CREATE TABLE Equipamento (
    TAG VARCHAR(10) PRIMARY KEY,
    Maquina VARCHAR(100),
    Valor_minimo_servico DECIMAL(10, 2)
);

-- Criar tabela Manutenção
CREATE TABLE Manutencao (
    ID VARCHAR(10) PRIMARY KEY,
    Planejamento VARCHAR(50),
    Manutencao VARCHAR(50)
);

-- Criar tabela Serviço
CREATE TABLE Servico (
    ID_Servico INT AUTO_INCREMENT PRIMARY KEY,
    CNPJ VARCHAR(20),
    TAG VARCHAR(10),
    ID_Manutencao VARCHAR(10),
    FOREIGN KEY (CNPJ) REFERENCES Cliente(CNPJ),
    FOREIGN KEY (TAG) REFERENCES Equipamento(TAG),
    FOREIGN KEY (ID_Manutencao) REFERENCES Manutencao(ID)
);

-- Definir os dados dos clientes
INSERT INTO Cliente (CNPJ, Nome, Cidade)
VALUES ('12.345.678/0001-90', 'Padaria do João', 'Vitória');

INSERT INTO Cliente (CNPJ, Nome, Cidade)
VALUES ('98.765.432/0001-55', 'Restaurante Filete', 'São João da Boa Vista');

INSERT INTO Cliente (CNPJ, Nome, Cidade)
VALUES ('45.678.901/0001-23', 'Açougue Vila the Boy', 'Pinhal');

INSERT INTO Cliente (CNPJ, Nome, Cidade)
VALUES ('33.222.111/0001-87', 'Açougue Vila nova', 'São João da Boa Vista');

INSERT INTO Cliente (CNPJ, Nome, Cidade)
VALUES ('78.901.234/0001-56', 'Padaria Rei luz', 'Pinhal');

INSERT INTO Cliente (CNPJ, Nome, Cidade)
VALUES ('87.654.321/0001-09', 'Dona Maria Paradia', 'Mogi Guaçu');

INSERT INTO Cliente (CNPJ, Nome, Cidade)
VALUES ('23.456.789/0001-34', 'Dias Mercado', 'Mogi Guaçu');

-- Definir Nome do equipamento e o valor de sua manutençao
INSERT INTO Equipamento (TAG, Maquina, Valor_minimo_servico)
VALUES ('MV', 'Máquina a Vácuo', 150.00);

INSERT INTO Equipamento (TAG, Maquina, Valor_minimo_servico)
VALUES ('AF', 'Assadeira de frango ', 210.00);

INSERT INTO Equipamento (TAG, Maquina, Valor_minimo_servico)
VALUES ('MC', 'Moedor de carne', 130.00);

INSERT INTO Equipamento (TAG, Maquina, Valor_minimo_servico)
VALUES ('FF', 'Fatiador de frios', 120.00);

INSERT INTO Equipamento (TAG, Maquina, Valor_minimo_servico)
VALUES ('SF', 'Serra de fita', 105.00);

INSERT INTO Equipamento (TAG, Maquina, Valor_minimo_servico)
VALUES ('BB', 'Batedor bife', 105.00);

INSERT INTO Equipamento (TAG, Maquina, Valor_minimo_servico)
VALUES ('FP', 'Forno de padaria', 220.00);

INSERT INTO Equipamento (TAG, Maquina, Valor_minimo_servico)
VALUES ('MM', 'Masseira', 120.00);

INSERT INTO Equipamento (TAG, Maquina, Valor_minimo_servico)
VALUES ('CC', 'Câmara Climática', 250.00);

INSERT INTO Equipamento (TAG, Maquina, Valor_minimo_servico)
VALUES ('MG', 'Máquinas em geral !!!', 105.00);


-- Definir Tipo de Manutençoes

INSERT INTO Manutencao (ID, Planejamento, Manutencao)
VALUES ('PVM', 'Preventiva', 'Mecânica');

INSERT INTO Manutencao (ID, Planejamento, Manutencao)
VALUES ('CRM', 'Corretiva', 'Mecânica');

INSERT INTO Manutencao (ID, Planejamento, Manutencao)
VALUES ('PVE', 'Preventiva', 'Elétrica');

INSERT INTO Manutencao (ID, Planejamento, Manutencao)
VALUES ('CRE', 'Corretiva', 'Elétrica');


-- Definir Serviço

INSERT INTO Servico (CNPJ, TAG, ID_Manutencao)
VALUES ('12.345.678/0001-90', 'MV', 'PVM');


-- Mostrar dados da tabela
SELECT * FROM Cliente;

SELECT Nome, Cidade FROM Cliente WHERE Cidade = 'Vitória';

SELECT s.ID_Servico, c.Nome, e.Maquina, m.Planejamento
FROM Servico s
JOIN Cliente c ON s.CNPJ = c.CNPJ
JOIN Equipamento e ON s.TAG = e.TAG
JOIN Manutencao m ON s.ID_Manutencao = m.ID;
  
  -- Mostrar todas as tabelas
  show tables;

-- Deletar 
delete from servico
where TAG = 'MV';
  
  -- Alterar uma informaçao no cadastro
  update Cliente
  set Cidade = 'São João da Boa Vista'
  where  CNPJ = '12.345.678/0001-90';
  
  -- Adicionar uma nova coluna a tabela
  alter table Cliente
  add column Telefone varchar(50) after Cidade;
  
  alter table Cliente
  add column Email varchar(50) after Telefone;
  
