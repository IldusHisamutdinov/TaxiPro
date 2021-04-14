package ru.ildus.taksipro.registration

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import ru.ildus.taksipro.databinding.RegistrFragmentBinding


class RegistrFragment : Fragment() {
    private var binding: RegistrFragmentBinding? = null
    private lateinit var editText: EditText
    private lateinit var button: Button
    companion object {
        fun newInstance() = RegistrFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = RegistrFragmentBinding.inflate(inflater).let {
        binding = it
        it.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText = binding!!.editTextPhone
        button = binding!!.buttonCod
        button.setOnClickListener{onButtonClickListener()}
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    fun onButtonClickListener() {
//      FragmentManager.beginTransaction()
//            .add(R.id.container, RegistrFragmentEnterCode())
//            .commit()
      Intent().setClassName(context!!, "ru.ildus.taksipro.registration.RegistrFragmentEnterCode")
        val currentFragment: RegistrFragmentEnterCode =
            RegistrFragmentEnterCode.newInstance()

    }
}