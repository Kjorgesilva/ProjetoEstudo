package com.example.projetoestudo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var reciclerView: RecyclerView
        lateinit var listaLivro: ArrayList<Livro>
        lateinit var adapter: RecyclerView.Adapter<AdapterItem.ItemViewHolder>

        reciclerView = findViewById(R.id.rvLista)

        listaLivro = ArrayList()
        val livro1 = Livro("Do Mil ao Milhão. Sem Cortar o Cafezinho.", "10/11/2018", "Thiago Nigro ")
        val livro2 = Livro("Pai rico, pai pobre", "26/07/2017", "Robert T. Kiyosaki ")

        listaLivro.add(livro1)
        listaLivro.add(livro2)

        val layout = LinearLayoutManager(this)
        reciclerView.layoutManager = layout

        adapter = AdapterItem(listaLivro,this)
        reciclerView.adapter = adapter

    }
}