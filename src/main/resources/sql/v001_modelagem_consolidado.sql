-- show databases;

-- use db_defensiuum;

-- show tables;

drop table if exists tb_credencial cascade;
drop table if exists tb_categoria_credencial cascade;
drop table if exists tb_pessoa cascade;

create table if not exists tb_categoria_credencial (
	codigo bigint not null auto_increment,
  descricao varchar (100) not null unique,
  constraint pk_categoria_credencial primary key (codigo)
);

create table if not exists tb_pessoa (
	codigo bigint not null auto_increment,
  nome varchar (200) not null unique,
  constraint pk_pessoa primary key (codigo)
);

create table if not exists tb_credencial (
	codigo bigint not null auto_increment,
  id_categoria_credencial bigint not null,
  id_pessoa bigint not null,
  identificador varchar (100) not null unique,
  senha varchar (100) not null,
  url varchar (255) not null,
  descricao_sistema varchar (255) null,
  data_criacao date not null default current_date,
  data_atualizacao date null,
  ativo boolean not null,
  constraint pk_credencial primary key (codigo),
  constraint fk_categoria_credencial foreign key (id_categoria_credencial) references tb_categoria_credencial (codigo),
  constraint fk_pessoa foreign key (id_pessoa) references tb_pessoa (codigo)
);