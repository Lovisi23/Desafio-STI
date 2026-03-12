# Desafio STI
Módulo em Java projetado para gerenciar a criação de contas @id.uff.br. O sistema valida a elegibilidade do discente e processa aliases baseados no nome civil.
## Lógica de Implementação 
### Busca Otimizada: 
Utilização de HashMap<String, Aluno> para indexação por matrícula, permitindo recuperação de dados com complexidade $O(1)$. 
### Pipeline de Validação
Verificação de Status == "Ativo".Verificação de UFFmail == null ou vazio.
### Parsing de Nome
Algoritmo que separa First Name, Middle Initial e Last Name, ignorando preposições para gerar as 5 opções de login padrão.Persistência: Manipulação de arquivo CSV para carga inicial do banco de dados em memória.
### Persistência
Manipulação de arquivo CSV para carga inicial do banco de dados em memória.
