create table pessoa (
id bigint not null auto_increment,
nome varchar(50) not null,
cpf varchar(14) not null,
primary key (id),
unique key cpf_pessoa (cpf)
)