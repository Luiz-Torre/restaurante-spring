create table prato(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    preco decimal not null,
    descricao varchar(100),

    primary key (id)
)