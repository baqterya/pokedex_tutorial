package com.example.pokedex_tutorial.data.remote.responses

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)