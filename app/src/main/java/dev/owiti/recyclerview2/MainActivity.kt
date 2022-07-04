package dev.owiti.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fibonacciNums()


    }
    fun fibonacciNums(){
        var numberList=fabonacciNumbers(100)
        var numberAdapter = NumberRecyclerViewAdapter(numberList)
        binding.rvNum.layoutManager = LinearLayoutManager(this)
        binding.rvNum.adapter = numberAdapter



    }
    fun fabonacciNumbers(size:Int):List<Int>{
        var numberList=ArrayList<Int>()
        var no1 = 0
        var no2 = 1
        var number=0
        while (number<=size){
            print(no1)
            var sum=no1+no2
            no1=no2
            no2=sum
            number++
            numberList+=sum

        }
        return numberList



    }
}
