# SDS Vendas Dashboard 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/miguelmoraisdev/projeto-sds3/blob/master/LICENSE) 

# Sobre o projeto

https://miguelm-sdsvendas.netlify.app

 O SDS Vendas Dashboard é um aplicação full stack web responsiva construída durante a 3ª edição da **Semana DevSuperior** (#sds3), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em um dashboard de vendas com gráficos e uma tabela paginada detalhando todas as vendas e valores fechadas pelos vendedores.

## Layout web
![Web 1](https://github.com/miguelmoraisdev/projeto-sds3/blob/master/_assets/index.png)

![Web 2](https://github.com/miguelmoraisdev/projeto-sds3/blob/master/_assets/dashboard.png)

![Web 2](https://github.com/miguelmoraisdev/projeto-sds3/blob/master/_assets/tabela.png)

## Modelo conceitual
![Modelo Conceitual](https://github.com/miguelmoraisdev/projeto-sds3/blob/master/_assets/sds3-mc.png)

## Padrão Camadas
![Padrão Camadas](https://github.com/miguelmoraisdev/projeto-sds3/blob/master/_assets/camadas.png)
- Usamos o padrão camadas separando a aplicação backend em três camadas: Controladores Rest, Camada de Serviços e Camada de Acesso aos Dados (+ Entidades).

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2 database
- Postman (Teste de Requisições)
## Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- Apex Charts
- Expo
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/miguelmoraisdev/projeto-sds3

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/miguelmoraisdev/projeto-sds3

# entrar na pasta do projeto front end web
cd frontend

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Miguel Augusto de Morais Junior

https://www.linkedin.com/in/miguel-morais-04a9ab1b0/

