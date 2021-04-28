package com.example.livedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciaViws()
        setItensLista()
    }

    private fun iniciaViws() {
        rvList = findViewById(R.id.re_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }

    private fun setItensLista() {
        adapter.setItensList(
                arrayListOf(
                        MenuItemModel(
                                "Cartões"
                        ),
                        MenuItemModel(
                                "Meus comprovantes"
                        ),
                        MenuItemModel(
                                "Investimentos"
                        ),
                        MenuItemModel(
                                "Portabilidade de salario"
                        ),
                        MenuItemModel(
                                "Cartões"
                        ),
                        MenuItemModel(
                                "Meus comprovantes"
                        ),
                        MenuItemModel(
                                "Investimentos"
                        ),
                        MenuItemModel(
                                "Portabilidade de salario"
                        )
                )
        )
    }
}