# Catálogo de Filmes AP2TM

Aplicativo Android simples que apresenta uma lista de filmes fictícios. O código segue a arquitetura Activity + Adapter + Model discutida em aula e mantém os pacotes `data` e `ui` para separar responsabilidades.

## Principais funcionalidades

- **Lista com RecyclerView** – A `MainActivity` carrega os filmes do `TodoRepository` e os exibe em cartões simples com título, sinopse e checkbox de "assistido".
- **Detalhes do filme** – Ao tocar no cartão ou no texto “Ver detalhes”, a aplicação abre a `DetailsActivity`, que mostra informações completas sobre diretor, data de lançamento e status de visualização.
- **Remoção por pressão longa** – Um toque prolongado sobre o cartão remove o filme da lista e dispara um Snackbar informando qual título foi excluído.

## Implementação resumida

- **Model**: `Todo` representa cada filme com id, título, sinopse, flag de assistido, data e diretor. A classe implementa `Serializable` para permitir o envio via `Intent`.
- **Repository**: `TodoRepository` fornece uma lista fixa de filmes. A `MainActivity` copia os itens para uma lista mutável para permitir remoções sem alterar a fonte original.
- **Adapter/ViewHolder**: `TodoAdapter` utiliza `ListAdapter` e `DiffUtil` para atualizar a RecyclerView. O `TodoViewHolder` gerencia cliques, aplica tachado quando o filme é marcado como assistido e delega a remoção ao toque longo.
- **UI**: Layouts em XML reutilizam o que foi entregue inicialmente, com ajustes sutis de espaçamento e cores. O feedback de remoção usa um Snackbar padrão com mensagem em português.

## Executando

1. Abra o projeto no Android Studio Giraffe (ou superior).
2. Sincronize o Gradle e execute o app em um dispositivo ou emulador com Android 8.0 (API 26) ou superior.
