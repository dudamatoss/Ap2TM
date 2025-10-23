# Catálogo de Filmes AP2TM

Aplicativo Android simples que apresenta uma lista de filmes fictícios com detalhes e interação básica. O projeto segue a arquitetura Activity + Adapter + Model apresentada em aula, mantendo os pacotes `data` e `ui` para separar responsabilidades.

## Principais funcionalidades

- **Lista com RecyclerView** – A `MainActivity` exibe os filmes usando um `RecyclerView` configurado com `TodoAdapter`. A fonte de dados é o `TodoRepository`, que disponibiliza uma coleção estática de filmes.
- **Cartões com visual moderno** – Cada item usa um `MaterialCardView` com título, diretor, data de lançamento e sinopse resumida. O checkbox permite marcar o filme como assistido, aplicando tachado no texto e ocultando o botão de detalhes quando marcado.
- **Detalhes do filme** – Ao tocar no cartão ou no botão “Ver detalhes”, a aplicação abre a `DetailsActivity`, que mostra informações completas, incluindo uma mensagem contextual sobre o status de visualização.
- **Remoção por pressão longa** – Um toque prolongado sobre o cartão remove o filme da lista. A tela exibe um estado vazio estilizado quando não há itens e mostra um Snackbar destacando qual título foi excluído.

## Implementação resumida

- **Model**: `Todo` representa um filme com id, título, sinopse, flag de assistido, data de lançamento e diretor. A classe implementa `Serializable` para facilitar o envio via `Intent`.
- **Repository**: `TodoRepository` provê os filmes fictícios. Na `MainActivity`, os dados são copiados para uma lista mutável para permitir remoções dinâmicas.
- **Adapter/ViewHolder**: `TodoAdapter` utiliza `ListAdapter` e `DiffUtil` para atualizações eficientes. O `TodoViewHolder` aplica o estilo de assistido, abre detalhes no clique e aciona a remoção no toque longo.
- **UI/Feedback**: Layouts em XML atualizados com componentes Material 3, mensagens localizadas em português e Snackbar personalizado usando `MaterialColors`.

## Executando

1. Abra o projeto no Android Studio Giraffe (ou superior).
2. Sincronize o Gradle e execute o app em um dispositivo ou emulador com Android 8.0 (API 26) ou superior.
