# Ap2TM

## Sobre o aplicativo
O Ap2TM é um app Android simples que mostra uma lista de filmes populares com título, diretor, ano de lançamento e sinopse. Ele foi pensado como um catálogo offline: todos os dados já vêm embutidos no aplicativo e podem ser consultados mesmo sem conexão com a internet. A partir da tela principal é possível tocar em um filme para abrir a tela de detalhes ou manter o toque pressionado para remover o item da lista temporariamente.

## Principais componentes e funcionalidades
A seguir estão os arquivos mais importantes do projeto e uma explicação breve e descomplicada sobre o que cada um faz.

### `MovieRepository`
* Localizado em `app/src/main/java/com/example/ap2tm/data/MovieRepository.kt`.
* Guarda uma lista fixa de filmes (`movieList`).
* Oferece a função `getMovies()` para entregar essa lista para o restante do app.

### `Movie`
* Localizado em `app/src/main/java/com/example/ap2tm/data/model/Movie.kt`.
* É uma _data class_ simples com os campos `id`, `title`, `director`, `releaseYear` e `synopsis`.
* Implementa `Serializable` para que possamos enviar o objeto completo entre telas usando `Intent`.

### `MainActivity`
* Localizado em `app/src/main/java/com/example/ap2tm/ui/main/MainActivity.kt`.
* Configura a `Toolbar`, o `RecyclerView` e uma mensagem de lista vazia.
* Busca os filmes no `MovieRepository` e envia os dados para o adaptador.
* Abre a `DetailsActivity` quando o usuário toca em um filme (`navigateToDetails`).
* Remove o filme da lista quando o toque é prolongado, exibindo um `Toast` de confirmação (`removeMovie`).

### `MovieAdapter`, `MovieViewHolder` e `MovieDiffCallback`
* Localizados em `app/src/main/java/com/example/ap2tm/ui/adapter/`.
* `MovieAdapter` é um `ListAdapter` que controla o `RecyclerView`.
* `MovieDiffCallback` diz ao adaptador como identificar itens iguais ou diferentes, otimizando as atualizações da lista.
* `MovieViewHolder` liga cada item da interface (`item_movie.xml`) aos dados do filme e trata os eventos de clique e clique longo.

### `DetailsActivity`
* Localizado em `app/src/main/java/com/example/ap2tm/ui/details/DetailsActivity.kt`.
* Recebe o objeto `Movie` via `Intent` e preenche a tela de detalhes (`activity_details.xml`).
* Ajusta a `Toolbar` para mostrar o botão de voltar e o título do filme.

## Tecnologias utilizadas
* **Kotlin** para toda a lógica do aplicativo.
* **AndroidX** (`AppCompatActivity`, `RecyclerView`, `Toolbar`) para os componentes de interface.
* **ListAdapter** e **DiffUtil** para lidar com listas de forma performática.
* **Layouts XML** (`activity_main.xml`, `activity_details.xml`, `item_movie.xml`) para definir a interface das telas.

## Como executar
1. Abra o projeto no Android Studio (Giraffe ou superior recomendado).
2. Aguarde o _sync_ do Gradle terminar.
3. Conecte um dispositivo Android ou inicie um emulador.
4. Clique em **Run** (▶️) para instalar e testar o aplicativo.

Pronto! O app será iniciado mostrando a lista de filmes e você poderá explorar os detalhes de cada um deles.
