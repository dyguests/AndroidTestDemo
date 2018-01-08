package com.fanhl.androidtestdemo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    /**
     * 金额最多保留一位小数
     */
    fun priceFormat(price: String?): String? {
        if (price == null) {
            return null
        }
        return try {
            DecimalFormat("#.#").format(price.toFloat())
        } catch (e: Exception) {
            price
        }
    }

    /**
     * 返回1
     */
    fun getX() = 1

    /**
     * 转换成字符串
     */
    private fun parseString(i: Int) = "$i"
}
