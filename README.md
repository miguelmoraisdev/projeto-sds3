# Aplicação web com dashboard de vendas

Frontend hospedado no Netlify: https://miguelm-sdsvendas.netlify.app e backend hospedado no Heroku.

O projeto consiste em uma aplicação web que mostra um dashboard de vendas :bar_chart: utilizando 5 ferramentas principais: Spring, React, Bootstrap, PostgreSQL e Postman.

O backend da aplicação foi estruturado no padrão camadas da segunte forma: 

:black_circle: Entidades e Camada de Acesso a Dados;

:black_circle: Camada de Serviços :heavy_plus_sign: DTO(Data Transfer Objects);

:black_circle: Controladores Rest;

:black_circle: Frontend(app).

O framework Spring foi utilzado para o desenvolvimento do backend da aplicação com as ferramentas:

:heavy_check_mark: Spring JPA para mapeamento de objeto relacional;

:heavy_check_mark: Spring Secutiry para os recursos de segurança da aplicação;

:heavy_check_mark: Spring H2 Database para simular banco de dados relacional durante o desenvolvimento;

O Postman foi utilizado para testar as consultas paginada de vendas e consultas agrupada utilizadas nos gráficos do dashboard.

O PostgreSQL foi o banco relacional utilizado pela aplicação.

O React foi utilizado para contrução do frontend da aplicação junto com o Bootstrap para facilitar o desenvolvimento de um layout responsivo.
