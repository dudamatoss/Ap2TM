package com.example.ap2tm.data

import com.example.ap2tm.data.model.Todo

class TodoRepository {
    val movieList = listOf(
        Todo(
            id = 1,
            title = "O Senhor dos Anéis: A Sociedade do Anel",
            synopsis = "Primeiro filme da trilogia baseada na obra de J.R.R. Tolkien",
            watched = true,
            releaseDate = "19/12/2001",
            director = "Peter Jackson"
        ),
        Todo(
            id = 2,
            title = "Interestelar",
            synopsis = "Um piloto viaja por um buraco de minhoca em busca de um novo lar para a humanidade",
            watched = true,
            releaseDate = "06/11/2014",
            director = "Christopher Nolan"
        ),
        Todo(
            id = 3,
            title = "Oppenheimer",
            synopsis = "A história de J. Robert Oppenheimer, o criador da bomba atômica",
            watched = false,
            releaseDate = "21/07/2023",
            director = "Christopher Nolan"
        ),
        Todo(
            id = 4,
            title = "A Origem",
            synopsis = "Um ladrão que invade sonhos tenta realizar o golpe final em sua carreira",
            watched = false,
            releaseDate = "16/07/2010",
            director = "Christopher Nolan"
        ),
        Todo(
            id = 5,
            title = "Gladiador",
            synopsis = "Um general romano busca vingança contra o imperador corrupto que matou sua família",
            watched = false,
            releaseDate = "05/05/2000",
            director = "Ridley Scott"
        ),
        Todo(
            id = 6,
            title = "O Poderoso Chefão",
            synopsis = "A saga da família Corleone e o império do crime nos Estados Unidos",
            watched = false,
            releaseDate = "24/03/1972",
            director = "Francis Ford Coppola"
        ),
        Todo(
            id = 7,
            title = "Forrest Gump",
            synopsis = "A incrível jornada de um homem simples através de momentos históricos dos EUA",
            watched = false,
            releaseDate = "06/07/1994",
            director = "Robert Zemeckis"
        ),
        Todo(
            id = 8,
            title = "Vingadores: Ultimato",
            synopsis = "Os heróis enfrentam Thanos em uma batalha para restaurar o universo",
            watched = false,
            releaseDate = "25/04/2019",
            director = "Anthony e Joe Russo"
        ),
        Todo(
            id = 9,
            title = "Clube da Luta",
            synopsis = "Um homem forma um clube secreto de luta com um vendedor de sabonetes",
            watched = false,
            releaseDate = "15/10/1999",
            director = "David Fincher"
        ),
        Todo(
            id = 10,
            title = "Matrix",
            synopsis = "Um programador descobre que o mundo real é uma simulação controlada por máquinas",
            watched = false,
            releaseDate = "31/03/1999",
            director = "Lana e Lilly Wachowski"
        ),
        Todo(
            id = 11,
            title = "Avatar: O Caminho da Água",
            synopsis = "Jake Sully e Neytiri enfrentam novos desafios no planeta Pandora",
            watched = false,
            releaseDate = "15/12/2022",
            director = "James Cameron"
        ),
        Todo(
            id = 12,
            title = "Parasita",
            synopsis = "Uma família pobre se infiltra na casa de uma família rica com consequências inesperadas",
            watched = false,
            releaseDate = "30/05/2019",
            director = "Bong Joon-ho"
        ),
        Todo(
            id = 13,
            title = "Coringa",
            synopsis = "A transformação de Arthur Fleck em um dos vilões mais icônicos de Gotham",
            watched = false,
            releaseDate = "04/10/2019",
            director = "Todd Phillips"
        ),
        Todo(
            id = 14,
            title = "Homem-Aranha: Sem Volta para Casa",
            synopsis = "Peter Parker enfrenta o multiverso após pedir ajuda ao Doutor Estranho",
            watched = false,
            releaseDate = "16/12/2021",
            director = "Jon Watts"
        ),
        Todo(
            id = 15,
            title = "A Lista de Schindler",
            synopsis = "Um empresário alemão salva judeus durante o Holocausto",
            watched = false,
            releaseDate = "15/12/1993",
            director = "Steven Spielberg"
        ),
        Todo(
            id = 16,
            title = "Top Gun: Maverick",
            synopsis = "O piloto veterano enfrenta o passado ao treinar uma nova geração de aviadores",
            watched = false,
            releaseDate = "27/05/2022",
            director = "Joseph Kosinski"
        ),
        Todo(
            id = 17,
            title = "Homem de Ferro",
            synopsis = "O início do Universo Cinematográfico Marvel com Tony Stark se tornando o Homem de Ferro",
            watched = false,
            releaseDate = "02/05/2008",
            director = "Jon Favreau"
        ),
        Todo(
            id = 18,
            title = "Pantera Negra",
            synopsis = "T’Challa retorna a Wakanda para assumir o trono como Pantera Negra",
            watched = false,
            releaseDate = "16/02/2018",
            director = "Ryan Coogler"
        ),
        Todo(
            id = 19,
            title = "Batman: O Cavaleiro das Trevas",
            synopsis = "Batman enfrenta o Coringa em uma guerra pelo controle de Gotham",
            watched = false,
            releaseDate = "18/07/2008",
            director = "Christopher Nolan"
        ),
        Todo(
            id = 20,
            title = "Titanic",
            synopsis = "Uma história de amor trágica a bordo do navio mais famoso da história",
            watched = false,
            releaseDate = "19/12/1997",
            director = "James Cameron"
        ),
        Todo(
            id = 21,
            title = "Harry Potter e a Pedra Filosofal",
            synopsis = "O início da jornada mágica de Harry Potter em Hogwarts",
            watched = false,
            releaseDate = "23/11/2001",
            director = "Chris Columbus"
        ),
        Todo(
            id = 22,
            title = "Homem-Formiga e a Vespa: Quantumania",
            synopsis = "Scott Lang e Hope exploram o Reino Quântico",
            watched = false,
            releaseDate = "17/02/2023",
            director = "Peyton Reed"
        ),
        Todo(
            id = 23,
            title = "Duna",
            synopsis = "Paul Atreides embarca em uma jornada no deserto do planeta Arrakis",
            watched = false,
            releaseDate = "22/10/2021",
            director = "Denis Villeneuve"
        ),
        Todo(
            id = 24,
            title = "Jurassic Park",
            synopsis = "Dinossauros clonados escapam de um parque temático e causam o caos",
            watched = false,
            releaseDate = "11/06/1993",
            director = "Steven Spielberg"
        ),
        Todo(
            id = 25,
            title = "O Lobo de Wall Street",
            synopsis = "A ascensão e queda de um corretor de ações ambicioso",
            watched = false,
            releaseDate = "25/12/2013",
            director = "Martin Scorsese"
        ),
        Todo(
            id = 26,
            title = "Star Wars: Uma Nova Esperança",
            synopsis = "Luke Skywalker embarca em uma jornada para derrotar o Império Galáctico",
            watched = false,
            releaseDate = "25/05/1977",
            director = "George Lucas"
        ),
        Todo(
            id = 27,
            title = "De Volta para o Futuro",
            synopsis = "Marty McFly viaja no tempo e precisa garantir que seus pais se conheçam",
            watched = false,
            releaseDate = "03/07/1985",
            director = "Robert Zemeckis"
        ),
        Todo(
            id = 28,
            title = "O Rei Leão",
            synopsis = "Simba precisa enfrentar o passado e assumir seu lugar como rei",
            watched = false,
            releaseDate = "24/06/1994",
            director = "Roger Allers e Rob Minkoff"
        ),
        Todo(
            id = 29,
            title = "Os Incríveis",
            synopsis = "Uma família de super-heróis tenta viver uma vida normal",
            watched = false,
            releaseDate = "05/11/2004",
            director = "Brad Bird"
        ),
        Todo(
            id = 30,
            title = "Toy Story",
            synopsis = "A história dos brinquedos que ganham vida quando ninguém está olhando",
            watched = false,
            releaseDate = "22/11/1995",
            director = "John Lasseter"
        )
    )

    fun getTodos() = movieList
}
