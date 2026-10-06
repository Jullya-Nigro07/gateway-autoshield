# API Gateway🔀 | AutoShield

![Status](https://img.shields.io/badge/Status-Concluído-green)
![Serviço](https://img.shields.io/badge/Serviço-Eureka-darkgreen)

---
API Gateway do AutoShield, responsável por receber as requisições e encaminhá-las para os microsserviços da aplicação.

## Dependência

O Gateway utiliza o Eureka Server para descobrir os microsserviços registrados.

Eureka Server: https://github.com/Jullya-Nigro07/auto-shield.git

## Como executar
- Rode primeiro o Eureka Server.


- Acesse http://localhost:8761 e verifique se o servidor está funcionando.


- Inicie os microsserviços que serão utilizados pelo Gateway.
  - CLIENTE: https://github.com/Jullya-Nigro07/microservice-cliente-autoshield.git
  - VEÍCULO: https://github.com/Jullya-Nigro07/microservice-veiculo-autoshield.git
  - SEGURO: https://github.com/Jullya-Nigro07/microservice-seguro-autoshield.git


- Execute esta aplicação.


---

O Gateway utiliza o Service Discovery do Eureka para localizar os microsserviços e encaminhar as requisições para eles.