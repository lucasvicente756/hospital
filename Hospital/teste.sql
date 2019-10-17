use hospitallucas;

create table Medico (
id int AUTO_INCREMENT,
nome varchar(50),
cpf varchar(50),
idade int,
tipoSanguineo varchar(50),
sexo varchar(50),
statusPessoa varchar(300), 
login varchar(50),
senha varchar(50),
statusUsuario varchar(300),
numeroRegistro int,
especialidade varchar(50),
constraint PK_Medico primary key(id)
);

create table Enfermeiro (
id int AUTO_INCREMENT,
nome varchar(50) ,
cpf varchar(50) ,
idade int ,
tipoSanguineo varchar(50) ,
sexo varchar(50) ,
statusPessoa varchar(300), 
login varchar(50) ,
senha varchar(50) ,
statusUsuario varchar(300),
numeroRegistro varchar(50),
constraint PK_Enfermeiro primary key(id)
);

create table Gerente (
id int AUTO_INCREMENT,
nome varchar(50) ,
cpf varchar(50) ,
idade int ,
tipoSanguineo varchar(50) ,
sexo varchar(50) ,
statusPessoa varchar(300), 
login varchar(50) ,
senha varchar(50) ,
statusUsuario varchar(300),
cargo varchar(50),
constraint PK_Gerente primary key(id)
);

create table Paciente (
id int AUTO_INCREMENT,
nome varchar(50) ,
cpf varchar(50) ,
idade int ,
tipoSanguineo varchar(50) ,
sexo varchar(50) ,
statusPessoa varchar(300) ,
doenca varchar (100) ,
historico varchar (500),
constraint PK_Paciente primary key(id));

create table EnfermidadePessoal (
id int AUTO_INCREMENT,
comentario varchar(300) ,
statusEnfermeiro varchar(100) ,
constraint PK_EnfermidadePessoal primary key (id)
);

create table Enfermidade(
id int AUTO_INCREMENT,
nome varchar(50) ,
tipo varchar(50) ,
descricao varchar(400) ,
constraint PK_Enfermidade primary key (id)
);

create table Entrada (
id int AUTO_INCREMENT,
dataEntrada date ,
dataSaida date ,
statusEntrada varchar(50) ,
situacaoPaciente varchar(400),
constraint PK_Entrada primary key (id)
);

create table Atendimento (
id int AUTO_INCREMENT,
comentarioEnfermeiro varchar(100) ,
comentarioMedico varchar(100) ,
altura float ,
peso float ,
datanasc date ,
doenca varchar(100) ,
constraint PK_Atendimento primary key (id)
);

create table Funcionario (
id int not null AUTO_INCREMENT,
login varchar(10) ,
senha varchar(10) ,
statusUsuario varchar(50) ,
constraint PK_Funcionario primary key (id));

select * from funcionario;
select * from enfermidade;
select * from enfermidadePessoal;