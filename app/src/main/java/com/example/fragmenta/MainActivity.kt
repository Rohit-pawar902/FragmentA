package com.example.fragmenta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),DataSend{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val frag1= FirstFragment()
        val frag2= SecondFragment()
        setFragments(frag1,frag2)
    }

    private fun setFragments( f1:FirstFragment, f2:SecondFragment) {
         val transaction=supportFragmentManager.beginTransaction()

        transaction.replace(R.id.layout1,f1).commit()

        val transaction1=supportFragmentManager.beginTransaction()
        transaction1.replace(R.id.layout2,f2).commit()
    }

    override fun SendData(data: String) {
        val bundle=Bundle()
        bundle.putString("Result_Data",data)
        val transaction =supportFragmentManager.beginTransaction()
        val secondFragment1= SecondFragment()
        secondFragment1.arguments=bundle
        transaction.replace(R.id.layout2,secondFragment1).commit()
    }

}