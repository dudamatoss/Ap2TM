package com.example.ap2tm.data

import com.example.ap2tm.data.model.Todo

class TodoRepository {
    val movieList = listOf(
        Todo(
            id = 1,
            title = "O Senhor dos Anéis: A Sociedade do Anel",
            movieDescription = "Primeiro filme da trilogia baseada na obra de J.R.R. Tolkien",
            check = true,
            createdAt = "19/12/2001",
            openedBy = "Peter Jackson"
        ),
        Todo(
            id = 2,
            title = "Interestelar",
            movieDescription = "Um piloto viaja por um buraco de minhoca em busca de um novo lar para a humanidade",
            check = true,
            createdAt = "06/11/2014",
            openedBy = "Christopher Nolan"
        ),
        Todo(
            id = 3,
            title = "Oppenheimer",
            movieDescription = "A história de J. Robert Oppenheimer, o criador da bomba atômica",
            check = false,
            createdAt = "21/07/2023",
            openedBy = "Christopher Nolan"
        ),
        Todo(
            id = 4,
            title = "A Origem",
            movieDescription = "Um ladrão que invade sonhos tenta realizar o golpe final em sua carreira",
            check = false,
            createdAt = "16/07/2010",
            openedBy = "Christopher Nolan"
        ),
        Todo(
            id = 5,
            title = "Gladiador",
            movieDescription = "Um general romano busca vingança contra o imperador corrupto que matou sua família",
            check = false,
            createdAt = "05/05/2000",
            openedBy = "Ridley Scott"
        ),
        Todo(
            id = 6,
            title = "O Poderoso Chefão",
            movieDescription = "A saga da família Corleone e o império do crime nos Estados Unidos",
            check = false,
            createdAt = "24/03/1972",
            openedBy = "Francis Ford Coppola"
        ),
        Todo(
            id = 7,
            title = "Forrest Gump",
            movieDescription = "A incrível jornada de um homem simples através de momentos históricos dos EUA",
            check = false,
            createdAt = "06/07/1994",
            openedBy = "Robert Zemeckis"
        ),
        Todo(
            id = 8,
            title = "Vingadores: Ultimato",
            movieDescription = "Os heróis enfrentam Thanos em uma batalha para restaurar o universo",
            check = false,
            createdAt = "25/04/2019",
            openedBy = "Anthony e Joe Russo"
        ),
        Todo(
            id = 9,
            title = "Clube da Luta",
            movieDescription = "Um homem forma um clube secreto de luta com um vendedor de sabonetes",
            check = false,
            createdAt = "15/10/1999",
            openedBy = "David Fincher"
        ),
        Todo(
            id = 10,
            title = "Matrix",
            movieDescription = "Um programador descobre que o mundo real é uma simulação controlada por máquinas",
            check = false,
            createdAt = "31/03/1999",
            openedBy = "Lana e Lilly Wachowski"
        ),
        Todo(
            id = 11,
            title = "Avatar: O Caminho da Água",
            movieDescription = "Jake Sully e Neytiri enfrentam novos desafios no planeta Pandora",
            check = false,
            createdAt = "15/12/2022",
            openedBy = "James Cameron"
        ),
        Todo(
            id = 12,
            title = "Parasita",
            movieDescription = "Uma família pobre se infiltra na casa de uma família rica com consequências inesperadas",
            check = false,
            createdAt = "30/05/2019",
            openedBy = "Bong Joon-ho"
        ),
        Todo(
            id = 13,
            title = "Coringa",
            movieDescription = "A transformação de Arthur Fleck em um dos vilões mais icônicos de Gotham",
            check = false,
            createdAt = "04/10/2019",
            openedBy = "Todd Phillips"
        ),
        Todo(
            id = 14,
            title = "Homem-Aranha: Sem Volta para Casa",
            movieDescription = "Peter Parker enfrenta o multiverso após pedir ajuda ao Doutor Estranho",
            check = false,
            createdAt = "16/12/2021",
            openedBy = "Jon Watts"
        ),
        Todo(
            id = 15,
            title = "A Lista de Schindler",
            movieDescription = "Um empresário alemão salva judeus durante o Holocausto",
            check = false,
            createdAt = "15/12/1993",
            openedBy = "Steven Spielberg"
        ),
        Todo(
            id = 16,
            title = "Top Gun: Maverick",
            movieDescription = "O piloto veterano enfrenta o passado ao treinar uma nova geração de aviadores",
            check = false,
            createdAt = "27/05/2022",
            openedBy = "Joseph Kosinski"
        ),
        Todo(
            id = 17,
            title = "Homem de Ferro",
            movieDescription = "O início do Universo Cinematográfico Marvel com Tony Stark se tornando o Homem de Ferro",
            check = false,
            createdAt = "02/05/2008",
            openedBy = "Jon Favreau"
        ),
        Todo(
            id = 18,
            title = "Pantera Negra",
            movieDescription = "T’Challa retorna a Wakanda para assumir o trono como Pantera Negra",
            check = false,
            createdAt = "16/02/2018",
            openedBy = "Ryan Coogler"
        ),
        Todo(
            id = 19,
            title = "Batman: O Cavaleiro das Trevas",
            movieDescription = "Batman enfrenta o Coringa em uma guerra pelo controle de Gotham",
            check = false,
            createdAt = "18/07/2008",
            openedBy = "Christopher Nolan"
        ),
        Todo(
            id = 20,
            title = "Titanic",
            movieDescription = "Uma história de amor trágica a bordo do navio mais famoso da história",
            check = false,
            createdAt = "19/12/1997",
            openedBy = "James Cameron"
        ),
        Todo(
            id = 21,
            title = "Harry Potter e a Pedra Filosofal",
            movieDescription = "O início da jornada mágica de Harry Potter em Hogwarts",
            check = false,
            createdAt = "23/11/2001",
            openedBy = "Chris Columbus"
        ),
        Todo(
            id = 22,
            title = "Homem-Formiga e a Vespa: Quantumania",
            movieDescription = "Scott Lang e Hope exploram o Reino Quântico",
            check = false,
            createdAt = "17/02/2023",
            openedBy = "Peyton Reed"
        ),
        Todo(
            id = 23,
            title = "Duna",
            movieDescription = "Paul Atreides embarca em uma jornada no deserto do planeta Arrakis",
            check = false,
            createdAt = "22/10/2021",
            openedBy = "Denis Villeneuve"
        ),
        Todo(
            id = 24,
            title = "Jurassic Park",
            movieDescription = "Dinossauros clonados escapam de um parque temático e causam o caos",
            check = false,
            createdAt = "11/06/1993",
            openedBy = "Steven Spielberg"
        ),
        Todo(
            id = 25,
            title = "O Lobo de Wall Street",
            movieDescription = "A ascensão e queda de um corretor de ações ambicioso",
            check = false,
            createdAt = "25/12/2013",
            openedBy = "Martin Scorsese"
        ),
        Todo(
            id = 26,
            title = "Star Wars: Uma Nova Esperança",
            movieDescription = "Luke Skywalker embarca em uma jornada para derrotar o Império Galáctico",
            check = false,
            createdAt = "25/05/1977",
            openedBy = "George Lucas"
        ),
        Todo(
            id = 27,
            title = "De Volta para o Futuro",
            movieDescription = "Marty McFly viaja no tempo e precisa garantir que seus pais se conheçam",
            check = false,
            createdAt = "03/07/1985",
            openedBy = "Robert Zemeckis"
        ),
        Todo(
            id = 28,
            title = "O Rei Leão",
            movieDescription = "Simba precisa enfrentar o passado e assumir seu lugar como rei",
            check = false,
            createdAt = "24/06/1994",
            openedBy = "Roger Allers e Rob Minkoff"
        ),
        Todo(
            id = 29,
            title = "Os Incríveis",
            movieDescription = "Uma família de super-heróis tenta viver uma vida normal",
            check = false,
            createdAt = "05/11/2004",
            openedBy = "Brad Bird"
        ),
        Todo(
            id = 30,
            title = "Toy Story",
            movieDescription = "A história dos brinquedos que ganham vida quando ninguém está olhando",
            check = false,
            createdAt = "22/11/1995",
            openedBy = "John Lasseter"
        )
    )

    fun getTodos() = movieList
}
