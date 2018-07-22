-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 24-Jun-2018 às 01:14
-- Versão do servidor: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `padariaana`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `nome` varchar(100) NOT NULL,
  `codigo_funcionario` int(11) NOT NULL,
  `data` varchar(100) NOT NULL,
  `telefone` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `cpf` varchar(50) NOT NULL,
  `sexo` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`nome`, `codigo_funcionario`, `data`, `telefone`, `email`, `cpf`, `sexo`) VALUES
('lucia', 18, '18/05/89 ', 2, 'l', '3  .   .   -  ', 'Selecione'),
('b', 17, ' 17/2/3', 33, 'b', '222.222.222-22', 'Selecione'),
('lucia', 3, '18/05/89 ', 2, 'l', '333.333.333-33', 'Feminino'),
('joana', 10, ' 17/05/89', 2, 'j', '2  .   .   -  ', 'Selecione'),
('maria', 5, ' 19/03/85', 6, 'm', '444.444.444-44', 'Selecione'),
('ana', 16, '17/05/89 ', 1, 'a', '1  .   .   -  ', 'Selecione'),
('mirian', 7, ' ', 1, 'k', '111.111.111-11', 'Masculino'),
('KAIO', 8, ' 18/05/86', 5, 'K', '555.555.555-55', 'Selecione'),
('helena', 9, ' ', 4, 'H', '555.555.555-55', 'Selecione'),
('fernanda', 11, ' 21/04/49', 2, 'f', '6  .   .   -  ', 'Selecione'),
('felipe', 12, ' 23/06/2018', 31235689, 'felipe@', '777.777.777-77', 'Masculino'),
('joana', 13, ' 17/05/89', 2, 'j', '2  .   .   -  ', 'Selecione'),
('felipe', 14, ' 23/06/2018', 31235689, 'felipe@', '12 .   .   -  ', 'Selecione'),
('ana', 15, '17/05/89 ', 1, 'a', '1  .   .   -  ', 'Selecione'),
('lucia', 19, '18/05/89 ', 2, 'l', '18 .   .   -  ', 'Selecione'),
('lucia', 20, '18/05/89 ', 2, 'l', '18 .   .   -  ', 'Selecione'),
('bkkk', 21, ' 17/2/3', 33, 'b', '17 .   .   -  ', 'Selecione'),
('bkkk', 22, ' 17/2/3', 33, 'b', '21 .   .   -  ', 'Selecione'),
('lucas', 23, '', 1, 'l', '   .   .   -  ', 'Selecione'),
('lucas', 24, '', 1, 'l', '23 .   .   -  ', 'Selecione'),
('lucia', 25, '18/05/89 ', 2, 'l', '18 .   .   -  ', 'Selecione'),
('helena', 26, ' ', 4, 'H', '9  .   .   -  ', 'Selecione'),
('lucia', 27, '18/05/89 ', 2, 'l', '18 .   .   -  ', 'Selecione'),
('bkkk', 28, ' 17/2/3', 33, 'b', '22 .   .   -  ', 'Selecione'),
('helena', 29, ' ', 4, 'H', '9  .   .   -  ', 'Feminino'),
('lucia', 30, '18/05/89 ', 2, 'l', '3  .   .   -  ', 'Selecione'),
('felipe', 31, ' 23/06/2018', 31235689, 'felipe@', '14 .   .   -  ', 'Selecione'),
('maria', 32, ' 19/03/85', 6, 'm', '5  .   .   -  ', 'Selecione'),
('KAIO', 33, ' 18/05/86', 5, 'K', '8  .   .   -  ', 'Selecione'),
('lucia', 34, '18/05/89 ', 2, 'l', '3  .   .   -  ', 'Selecione'),
('helena', 35, ' ', 4, 'H', '26 .   .   -  ', 'Selecione'),
('lucia', 36, '18/05/89 ', 2, 'l', '18 .   .   -  ', 'Selecione'),
('helena', 37, ' ', 4, 'H', '9  .   .   -  ', 'Selecione'),
('felipe', 38, ' 23/06/2018', 31235689, 'felipe@', '31 .   .   -  ', 'Selecione'),
('ana', 39, '17/05/89 ', 1, 'a', '16 .   .   -  ', 'Selecione'),
('lucia', 40, '18/05/89 ', 2, 'l', '18 .   .   -  ', 'Selecione'),
('felipe', 41, ' 23/06/2018', 31235689, 'felipe@', '38 .   .   -  ', 'Selecione');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

CREATE TABLE `fornecedor` (
  `id_fornecedor` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `cnpj_fornecedor` varchar(50) NOT NULL,
  `telefone` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id_fornecedor`, `nome`, `endereco`, `cidade`, `cnpj_fornecedor`, `telefone`) VALUES
(16, 'juliofernagggg', 'caratinha', '', '', ''),
(13, 'juliofernagggg', 'caratinha', '', '', ''),
(5, 'ANAlu', 'CAFE', '', '', '123'),
(6, 'mariah', 'marechal hermes', '', '', '123'),
(7, 'maria', 'GALOO', '', '', '123'),
(8, 'julio', 'caratinh', '', '', '5678'),
(11, '7', '123', '', '', 'maria'),
(15, 'analu', 'gutierrezKKKK', '', '', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `codigo_prod` int(11) NOT NULL,
  `qtd` int(11) NOT NULL,
  `descricao_prod` varchar(100) NOT NULL,
  `preco_un_prod` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`codigo_prod`, `qtd`, `descricao_prod`, `preco_un_prod`) VALUES
(6, 1, 'leite com cafezinhohhhhhh', 1),
(8, 5, 'BOLOBROA', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codigo_funcionario`);

--
-- Indexes for table `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`);

--
-- Indexes for table `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`codigo_prod`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `codigo_funcionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;
--
-- AUTO_INCREMENT for table `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `produtos`
--
ALTER TABLE `produtos`
  MODIFY `codigo_prod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
