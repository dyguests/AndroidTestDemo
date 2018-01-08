package com.fanhl.androidtestdemo.maker

/**
 * desc:
 * date: 2018/1/8
 *
 * @author fanhl
 */
class CoffeeMaker private constructor() {
    fun make() = "Coffee"

    companion object {
        fun newInstance() = CoffeeMaker()
    }
}