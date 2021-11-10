package com.example.projetoestudo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var reciclerView: RecyclerView
lateinit var listaLivro: ArrayList<Livro>
lateinit var adapter: RecyclerView.Adapter<AdapterItem.itemViewHolder>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findById()


        listaLivro = ArrayList()
        var livro1 = Livro("Do Mil ao Milhão. Sem Cortar o Cafezinho.", "10/11/2018", "Thiago Nigro ")
        var livro2 = Livro("Pai rico, pai pobre", "26/07/2017", "Robert T. Kiyosaki ")

        listaLivro.add(livro1)
        listaLivro.add(livro2)

        val layout = LinearLayoutManager(this)
        reciclerView.layoutManager = layout

        adapter = AdapterItem(listaLivro,this)
        reciclerView.adapter = adapter

    }

    fun findById() {
        reciclerView = findViewById(R.id.rvLista)
    }
}