package com.example.ap2tm.data

import com.example.ap2tm.data.model.Movie

class MovieRepository {
    private val movieList = listOf(
        Movie(
            id = 1,
            title = "O Senhor dos Anéis: A Sociedade do Anel",
            director = "Peter Jackson",
            releaseYear = 2001,
            synopsis = "Frodo e a Sociedade do Anel iniciam a jornada épica para destruir o Um Anel."
        ),
        Movie(
            id = 2,
            title = "Interestelar",
            director = "Christopher Nolan",
            releaseYear = 2014,
            synopsis = "Um grupo de astronautas viaja através de um buraco de minhoca em busca de um novo lar para a humanidade."
        ),
        Movie(
            id = 3,
            title = "Oppenheimer",
            director = "Christopher Nolan",
            releaseYear = 2023,
            synopsis = "A vida e os dilemas de J. Robert Oppenheimer durante o desenvolvimento da bomba atômica."
        ),
        Movie(
            id = 4,
            title = "A Origem",
            director = "Christopher Nolan",
            releaseYear = 2010,
            synopsis = "Um time especializado invade sonhos para implantar uma ideia no subconsciente de um herdeiro."
        ),
        Movie(
            id = 5,
            title = "Gladiador",
            director = "Ridley Scott",
            releaseYear = 2000,
            synopsis = "O general Maximus busca vingança após ser traído e ter sua família assassinada pelo novo imperador."
        ),
        Movie(
            id = 6,
            title = "O Poderoso Chefão",
            director = "Francis Ford Coppola",
            releaseYear = 1972,
            synopsis = "A saga da família Corleone e a transição de poder no império do crime."
        ),
        Movie(
            id = 7,
            title = "Forrest Gump",
            director = "Robert Zemeckis",
            releaseYear = 1994,
            synopsis = "A improvável trajetória de Forrest Gump pelos momentos marcantes da história americana."
        ),
        Movie(
            id = 8,
            title = "Vingadores: Ultimato",
            director = "Anthony e Joe Russo",
            releaseYear = 2019,
            synopsis = "Os heróis da Marvel unem forças para desfazer o estalo de Thanos e restaurar o universo."
        ),
        Movie(
            id = 9,
            title = "Matrix",
            director = "Lana e Lilly Wachowski",
            releaseYear = 1999,
            synopsis = "Neo descobre que a realidade é uma simulação e lidera a resistência contra as máquinas."
        ),
        Movie(
            id = 10,
            title = "Parasita",
            director = "Bong Joon-ho",
            releaseYear = 2019,
            synopsis = "Uma família pobre se infiltra no lar de uma família rica com consequências dramáticas."
        ),
        Movie(
            id = 11,
            title = "Coringa",
            director = "Todd Phillips",
            releaseYear = 2019,
            synopsis = "Arthur Fleck enfrenta uma sociedade hostil enquanto se transforma no icônico vilão de Gotham."
        ),
        Movie(
            id = 12,
            title = "Duna",
            director = "Denis Villeneuve",
            releaseYear = 2021,
            synopsis = "Paul Atreides abraça seu destino no deserto de Arrakis em meio a disputas políticas e espirituais."
        )
    )

    fun getMovies() = movieList
}
