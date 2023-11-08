# Autenticação e autorização de *endpoints* utilizando Spring Boot Security e token JWT em aplicações *stateless*

🔐 Conteúdo desenvolvido com base no tutorial "Autenticação e Autorização com Spring Security e JWT Tokens", de Fernanda Kipper. Disponível em https://www.youtube.com/watch?v=5w-YCcOjPD0&t=2961s.

* GET /product - listagem de produtos cadastrados, acessível a perfis com *role* USER
* POST /product - insert de produto, acessível a perfis com *role* ADMIN
* POST /auth/login - endpoint liberado para realização de autenticação/autorização. Recebe um token JWT em caso de sucesso
* POST /auth/register - registro de um novo usuário
