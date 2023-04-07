package br.com.arthurjf.caraoucoroa.model

import kotlin.random.Random

class Coin() {
    private var isFrontSided: Boolean? = null

    fun flip(): Boolean{
        val flipIsFrontSide = Random.nextBoolean()

        isFrontSided = flipIsFrontSide

        return isFrontSided!!
    }
}