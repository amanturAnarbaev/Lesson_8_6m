package com.example.lesson_8_6m

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

//open-closed principle

class MainActivity : AppCompatActivity() {
    private lateinit var animals: ArrayList<Animal>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animals = arrayListOf(Lion(), Mouse())
        makeSound()
        legCount()
    }

    private fun makeSound() {
        for (i in animals) {
            Log.e("ololo", "makeVoice  " + i.makeVoice())
        }
    }
   private fun legCount(){
       for (i in animals){
           Log.e("ololo", "leg Count: "+i.legCount())
       }
   }

}

