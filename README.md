# Feature

Avaliar senha conforme critérios didáticos.

# Objetivo 

Como usuário do programa, quero informar uma senha fictícia e receber uma orientação, para corrigir a primeira regra não atendida e tentar novamente.

Escopo: aplicação de console, avaliação em memória e repetição de tentativas. Não implementar cadastro de usuários, login, banco de dados, acesso à internet, criptografia ou armazenamento de senhas. O nome sugerido para o projeto é ValidaSenhaForte; quem já tiver o projeto poderá continuar nele.

# Requisitos

1. Receber a entrada : Solicitar uma senha fictícia no console e ler a linha inteira como String. Não remover espaços ou alterar letras antes da avaliação. Uma entrada vazia deve seguir a regra de tamanho mínimo.

2. Validar o comprimento : Rejeitar senhas com menos de 8 caracteres. Uma senha com exatamente 8 caracteres atende a esta regra. Retornar uma dica sobre o tamanho mínimo.

3. Verificar a presença de número : Se o tamanho for suficiente, verificar se existe pelo menos um dígito no texto. Se não existir, retornar uma dica solicitando um número.

4. Bloquear senhas óbvias : Após as duas verificações anteriores, comparar a entrada com os itens do vetor String[] senhasObvias: "12345678", "senha123" e "admin123". Rejeitar a entrada que for exatamente igual a um desses itens. A comparação considera maiúsculas e minúsculas diferentes; não buscar trechos ou variações.

5. Acrescentar a regra de maiúscula : Na versão final de amanhã, exigir pelo menos uma letra maiúscula. Verificar esta regra depois da lista de senhas óbvias e antes da aprovação. Se não houver maiúscula, retornar uma dica específica.

6. Retornar um único resultado : Devolver somente a mensagem da primeira falha encontrada, respeitando a ordem: comprimento, número, senha óbvia e maiúscula. Retornar sucesso apenas se todas as regras da versão em execução forem atendidas.

7. Permitir nova tentativa : Após uma reprovação, exibir a mensagem e solicitar outra senha. Ao receber uma senha aprovada, exibir a mensagem de sucesso e encerrar normalmente. Não há limite de tentativas nesta atividade, pois não se trata de autenticação.
