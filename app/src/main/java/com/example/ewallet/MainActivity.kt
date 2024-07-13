package com.example.ewallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ewallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvRecycler.layoutManager=LinearLayoutManager(this)
        getResult()

    }
    fun getResult(){
        val spend1=Spend("SALARY","Ksh 40,000","1st July 2024")
        val spend2=Spend("Rent","Ksh16,000","2nd July 2024")
        val spend3=Spend("Rent","Ksh 2,400","4th July 2024")
        val spend4=Spend("Electricity","Ksh800","5th July")
        val spend5=Spend("Internet","Ksh 2,500","5th July 2024")
        val spend6=Spend("Shopping","Ksh3,500","5th July 2024")
        val spend7=Spend("Bus Fare","Ksh 500","11th July 2024")

        val spend=listOf(spend1,spend2,spend3,spend4,spend5,spend6,spend7)
        val overallAdapter=OverallSpendingAdapter(spend)
        binding.tvRecycler.adapter=overallAdapter
    }
}