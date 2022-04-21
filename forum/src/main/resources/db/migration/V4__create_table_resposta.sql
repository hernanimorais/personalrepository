create table resposta(
    id bigint not null auto_increment,
    mensagem varchar(300) not null,
    data_Criacao datetime not null,
    topico_id bigint not null,
    autor_id bigint not null,
    solucao int(1) not null,
    foreign key(topico_id) references topico(id),
    foreign key(autor_id) references usuario(id),
    primary key(id)
);