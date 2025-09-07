CREATE DATABASE IF NOT EXISTS gestor_projetos;
USE gestor_projetos;

CREATE TABLE usuario (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(150) NOT NULL,
  cpf VARCHAR(14) UNIQUE NOT NULL,
  email VARCHAR(150) UNIQUE NOT NULL,
  cargo VARCHAR(100),
  login VARCHAR(50) UNIQUE NOT NULL,
  senha_hash VARCHAR(255) NOT NULL,
  perfil ENUM('ADMIN','GERENTE','COLABORADOR') NOT NULL);

CREATE TABLE projeto (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(200) NOT NULL,
  descricao TEXT,
  data_inicio DATE,
  data_termino_prevista DATE,
  status ENUM('PLANEJADO','EM_ANDAMENTO','CONCLUIDO','CANCELADO') DEFAULT 'PLANEJADO',
  gerente_id INT,
  FOREIGN KEY (gerente_id) REFERENCES usuario(id) ON DELETE SET NULL
);

-- Equipes
CREATE TABLE equipe (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(150) NOT NULL,
  descricao TEXT
);

CREATE TABLE equipe_membro (
  equipe_id INT,
  usuario_id INT,
  PRIMARY KEY (equipe_id, usuario_id),
  FOREIGN KEY (equipe_id) REFERENCES equipe(id) ON DELETE CASCADE,
  FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE CASCADE
);

CREATE TABLE equipe_projeto (
  equipe_id INT,
  projeto_id INT,
  data_alocacao DATE DEFAULT CURRENT_DATE,
  PRIMARY KEY (equipe_id, projeto_id),
  FOREIGN KEY (equipe_id) REFERENCES equipe(id) ON DELETE CASCADE,
  FOREIGN KEY (projeto_id) REFERENCES projeto(id) ON DELETE CASCADE
);

CREATE TABLE tarefa (
  id INT AUTO_INCREMENT PRIMARY KEY,
  titulo VARCHAR(250) NOT NULL,
  descricao TEXT,
  projeto_id INT NOT NULL,
  responsavel_id INT,
  status ENUM('PENDENTE','EM_EXECUCAO','CONCLUIDA') DEFAULT 'PENDENTE',
  data_inicio_prevista DATE,
  data_fim_prevista DATE,
  data_inicio_real DATE,
  data_fim_real DATE,
  FOREIGN KEY (projeto_id) REFERENCES projeto(id) ON DELETE CASCADE,
  FOREIGN KEY (responsavel_id) REFERENCES usuario(id) ON DELETE SET NULL
);
