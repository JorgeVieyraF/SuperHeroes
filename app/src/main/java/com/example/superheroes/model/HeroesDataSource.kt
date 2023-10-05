package com.example.superheroes.model

import com.example.superheroes.R

object HeroesRepository {
    val heroes = listOf(
        Hero(
            nameRes = R.string.chester,
            descriptionRes = R.string.description1,
            imageRes = R.drawable.chester
        ),
        Hero(
            nameRes = R.string.vargas,
            descriptionRes = R.string.description2,
            imageRes = R.drawable.rokas
        ),
        Hero(
            nameRes = R.string.jonni,
            descriptionRes = R.string.description3,
            imageRes = R.drawable.jonny
        ),
        Hero(
            nameRes = R.string.ivan,
            descriptionRes = R.string.description4,
            imageRes = R.drawable.ivan
        ),
        Hero(
            nameRes = R.string.bori,
            descriptionRes = R.string.description5,
            imageRes = R.drawable.bori
        ),
        Hero(
            nameRes = R.string.juanjo,
            descriptionRes = R.string.description6,
            imageRes = R.drawable.juanjo
        ),
        Hero(
            nameRes = R.string.dani,
            descriptionRes = R.string.description7,
            imageRes = R.drawable.dani
        ),
        Hero(
            nameRes = R.string.charly,
            descriptionRes = R.string.description8,
            imageRes = R.drawable.charly
        ),
        Hero(
            nameRes = R.string.cynthia,
            descriptionRes = R.string.description9,
            imageRes = R.drawable.cynthia
        ),
        Hero(
            nameRes = R.string.elena,
            descriptionRes = R.string.description10,
            imageRes = R.drawable.elena
        )
    )
}