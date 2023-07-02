## Microserviço de Envio de E-mails
O Microserviço de Envio de E-mails é uma aplicação que segue boas práticas e princípios de design de microserviços. Ele é responsável por enviar e-mails e armazenar informações relacionadas ao envio, como proprietário, e-mails de origem e destino, assunto, texto, data de envio e status do e-mail.

Funcionalidades principais:

Envio de e-mails: o microserviço permite o envio de e-mails com todas as informações necessárias.
Armazenamento de informações: os detalhes dos e-mails enviados são armazenados para posterior consulta e rastreamento.
Filas com RabbitMQ: o RabbitMQ é utilizado para gerenciar filas de envio de e-mails, garantindo um processamento assíncrono e eficiente.

Tecnologias

- Java 17
- Spring Boot
- RabbitMQ para gerenciamento de filas
- Banco de dados MySQL

Como executar o projeto:
                                                    
Clone este repositório: git clone https://github.com/mateuslgomes/microservice-email.git                                                                                        
Importe o projeto em sua IDE preferida.
Configure as informações de conexão com o RabbitMQ e o banco de dados no arquivo application.properties.                                                            
Execute o aplicativo a partir da classe principal: EmailMicroserviceApplication.java.

Contribuição:

Se você quiser contribuir com este projeto, fique à vontade para fazer um fork e enviar um pull request com suas melhorias.

Entre em contato:

Se tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato através dos canais listados abaixo:

E-mail: dev.mateuslgomes@gmail.com                                                                               
GitHub: https://github.com/mateuslgomes
