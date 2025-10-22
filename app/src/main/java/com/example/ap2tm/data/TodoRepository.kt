package com.example.ap2tm.data

import com.example.ap2tm.data.model.Todo

class TodoRepository {
    val movieList = listOf(
        Todo(
            1,
            "O Senhor dos Anéis: A Sociedade do Anel",
            "Primeiro filme da trilogia baseada na obra de J.R.R. Tolkien",
            true,
            "19/12/2001",
            "Peter Jackson"
        ),
        Todo(
            2,
            "Interestelar",
            "Um piloto viaja por um buraco de minhoca em busca de um novo lar para a humanidade",
            true,
            "06/11/2014",
            "Christopher Nolan"
        ),
        Todo(
            3,
            "Oppenheimer",
            "A história de J. Robert Oppenheimer, o criador da bomba atômica",
            false,
            "21/07/2023",
            "Christopher Nolan"
        ),
        Todo(
            4,
            "A Origem",
            "Um ladrão que invade sonhos tenta realizar o golpe final em sua carreira",
            false,
            "16/07/2010",
            "Christopher Nolan"
        ),
        Todo(
            5,
            "Gladiador",
            "Um general romano busca vingança contra o imperador corrupto que matou sua família",
            false,
            "05/05/2000",
            "Ridley Scott"
        ),
        Todo(
            6,
            "O Poderoso Chefão",
            "A saga da família Corleone e o império do crime nos Estados Unidos",
            false,
            "24/03/1972",
            "Francis Ford Coppola"
        ),
        Todo(
            7,
            "Forrest Gump",
            "A incrível jornada de um homem simples através de momentos históricos dos EUA",
            false,
            "06/07/1994",
            "Robert Zemeckis"
        ),
        Todo(
            8,
            "Vingadores: Ultimato",
            "Os heróis enfrentam Thanos em uma batalha para restaurar o universo",
            false,
            "25/04/2019",
            "Anthony e Joe Russo"
        ),
        Todo(
            9,
            "Clube da Luta",
            "Um homem forma um clube secreto de luta com um vendedor de sabonetes",
            false,
            "15/10/1999",
            "David Fincher"
        ),
        Todo(
            10,
            "Matrix",
            "Um programador descobre que o mundo real é uma simulação controlada por máquinas",
            false,
            "31/03/1999",
            "Lana e Lilly Wachowski"
        ),
        Todo(
            11,
            "Avatar: O Caminho da Água",
            "Jake Sully e Neytiri enfrentam novos desafios no planeta Pandora",
            false,
            "15/12/2022",
            "James Cameron"
        ),
        Todo(
            12,
            "Parasita",
            "Uma família pobre se infiltra na casa de uma família rica com consequências inesperadas",
            false,
            "30/05/2019",
            "Bong Joon-ho"
        ),
        Todo(
            13,
            "Coringa",
            "A transformação de Arthur Fleck em um dos vilões mais icônicos de Gotham",
            false,
            "04/10/2019",
            "Todd Phillips"
        ),
        Todo(
            14,
            "Homem-Aranha: Sem Volta para Casa",
            "Peter Parker enfrenta o multiverso após pedir ajuda ao Doutor Estranho",
            false,
            "16/12/2021",
            "Jon Watts"
        ),
        Todo(
            15,
            "A Lista de Schindler",
            "Um empresário alemão salva judeus durante o Holocausto",
            false,
            "15/12/1993",
            "Steven Spielberg"
        ),
        Todo(
            16,
            "Top Gun: Maverick",
            "O piloto veterano enfrenta o passado ao treinar uma nova geração de aviadores",
            false,
            "27/05/2022",
            "Joseph Kosinski"
        ),
        Todo(
            17,
            "Homem de Ferro",
            "O início do Universo Cinematográfico Marvel com Tony Stark se tornando o Homem de Ferro",
            false,
            "02/05/2008",
            "Jon Favreau"
        ),
        Todo(
            18,
            "Pantera Negra",
            "T’Challa retorna a Wakanda para assumir o trono como Pantera Negra",
            false,
            "16/02/2018",
            "Ryan Coogler"
        ),
        Todo(
            19,
            "Batman: O Cavaleiro das Trevas",
            "Batman enfrenta o Coringa em uma guerra pelo controle de Gotham",
            false,
            "18/07/2008",
            "Christopher Nolan"
        ),
        Todo(
            20,
            "Titanic",
            "Uma história de amor trágica a bordo do navio mais famoso da história",
            false,
            "19/12/1997",
            "James Cameron"
        ),
        Todo(
            21,
            "Harry Potter e a Pedra Filosofal",
            "O início da jornada mágica de Harry Potter em Hogwarts",
            false,
            "23/11/2001",
            "Chris Columbus"
        ),
        Todo(
            22,
            "Homem-Formiga e a Vespa: Quantumania",
            "Scott Lang e Hope exploram o Reino Quântico",
            false,
            "17/02/2023",
            "Peyton Reed"
        ),
        Todo(
            23,
            "Duna",
            "Paul Atreides embarca em uma jornada no deserto do planeta Arrakis",
            false,
            "22/10/2021",
            "Denis Villeneuve"
        ),
        Todo(
            24,
            "Jurassic Park",
            "Dinossauros clonados escapam de um parque temático e causam o caos",
            false,
            "11/06/1993",
            "Steven Spielberg"
        ),
        Todo(
            25,
            "O Lobo de Wall Street",
            "A ascensão e queda de um corretor de ações ambicioso",
            false,
            "25/12/2013",
            "Martin Scorsese"
        ),
        Todo(
            26,
            "Star Wars: Uma Nova Esperança",
            "Luke Skywalker embarca em uma jornada para derrotar o Império Galáctico",
            false,
            "25/05/1977",
            "George Lucas"
        ),
        Todo(
            27,
            "De Volta para o Futuro",
            "Marty McFly viaja no tempo e precisa garantir que seus pais se conheçam",
            false,
            "03/07/1985",
            "Robert Zemeckis"
        ),
        Todo(
            28,
            "O Rei Leão",
            "Simba precisa enfrentar o passado e assumir seu lugar como rei",
            false,
            "24/06/1994",
            "Roger Allers e Rob Minkoff"
        ),
        Todo(
            29,
            "Os Incríveis",
            "Uma família de super-heróis tenta viver uma vida normal",
            false,
            "05/11/2004",
            "Brad Bird"
        ),
        Todo(
            30,
            "Toy Story",
            "A história dos brinquedos que ganham vida quando ninguém está olhando",
            false,
            "22/11/1995",
            "John Lasseter"
        )
    )


    fun getTodos() = movieList
}