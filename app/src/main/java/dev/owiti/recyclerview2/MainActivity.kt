package dev.owiti.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fibonacciNums()
    }
    fun fibonacciNums(){
        val k = 100
        var no1 = 0
        var no2 = 1
        var x = mutableListOf<Int>()

        println(x)

        for (i in 1..100) {
            x.add(no1)
            var sum = no1 + no2
            no1 = no2
            no2 = sum
        }

        var numberAdapter = NumberRecyclerViewAdapter(x)
        binding.rvNum.layoutManager= LinearLayoutManager(this)
        binding.rvNum.adapter=numberAdapter


    }

}
