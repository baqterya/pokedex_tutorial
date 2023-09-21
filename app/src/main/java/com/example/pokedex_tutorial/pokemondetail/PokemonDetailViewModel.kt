package com.example.pokedex_tutorial.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.pokedex_tutorial.data.remote.responses.Pokemon
import com.example.pokedex_tutorial.repository.PokemonRepository
import com.example.pokedex_tutorial.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {
    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}