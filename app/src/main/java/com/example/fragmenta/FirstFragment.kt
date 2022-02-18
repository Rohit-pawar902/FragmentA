package com.example.fragmenta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment() {
    private lateinit var dataSend:DataSend

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_first, container, false)




        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataSend= activity as DataSend

        calculate?.setOnClickListener {
            val op1=Integer.parseInt( op1.text.toString())
            val op2=Integer.parseInt( op2.text.toString())
            val operation1=operation.text.toString()
            var ans=""
            if(operation1.equals("add")){
                val prefix="Addition is :"
                val sum=op1+op2
                ans=prefix +sum.toString()
            }
            else if(operation1.equals("sub")){
                val prefix="Substraction is :"

                val sum=op1-op2
                ans=prefix+sum.toString()
            }
            else if(operation1.equals("div")){
                val prefix="Divition is :"

                val sum=op1/op2
                ans=prefix+sum.toString()
            }
            else if(operation1.equals("mul")){
                val prefix="Multiplication is :"

                val sum=op1*op2
                ans=prefix+sum.toString()
            }
            else {
                ans = "'invalid operation'"
            }
            button.setText(ans);
            dataSend.SendData(ans)

        }
    }

}