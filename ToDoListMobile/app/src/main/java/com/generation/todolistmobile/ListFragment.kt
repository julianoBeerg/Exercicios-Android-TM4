package com.generation.todolistmobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.todolistmobile.adapter.TarefaAdapter
import com.generation.todolistmobile.adapter.TaskClickListener
import com.generation.todolistmobile.databinding.FragmentListBinding
import com.generation.todolistmobile.model.Tarefa

class ListFragment : Fragment(),TaskClickListener {

    private lateinit var binding: FragmentListBinding
    private  val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        mainViewModel.listTarefa()

        val adapter = TarefaAdapter(this, mainViewModel, requireContext())
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        binding.floatingAdd.setOnClickListener{
            mainViewModel.tarefaSeleciona = null
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        mainViewModel.myTarefaResponse.observe(viewLifecycleOwner){
            response -> if(response.body() != null){
                adapter.setList(response.body()!!)
            }
        }

        return binding.root
    }

    override fun onTaskClickListener(tarefa: Tarefa) {
        mainViewModel.tarefaSeleciona = tarefa
        findNavController().navigate(R.id.action_listFragment_to_formFragment)
    }
}