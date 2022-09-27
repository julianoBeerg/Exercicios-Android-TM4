package com.generation.todolistmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.todolistmobile.adapter.TarefaAdapter
import com.generation.todolistmobile.databinding.FragmentListBinding
import com.generation.todolistmobile.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        val listTarefas = listOf(
            Tarefa(
                "Lavar a louça",
                "Lavar a louça do dia todo",
                "Juliano",
                "2022-05-15",
                true,
                "Dia a Dia"

            ),
            Tarefa(
                "Lavar o banheiro",
                "Lavar o banheiro do quarto",
                "Juliano",
                "2022-05-16",
                false,
                "Dia a Dia"

            ),
            Tarefa(
                "Ir ao cinema",
                "Assistir um filme",
                "Juliano",
                "2022-05-17",
                false,
                "Lazer"

            )
        )

        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setList(listTarefas)

        binding.floatingAdd.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        return binding.root
    }

}