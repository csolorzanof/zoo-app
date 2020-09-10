package net.csolorzano.zooapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var animalAdapter : AnimalRecyclerAdapter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val animals = mutableListOf<Animal>(
            Animal("Baboon","A dumb baboon", R.drawable.baboon),
            Animal("Bulldog","A nice bulldog", R.drawable.bulldog),
            Animal("Panda","A Fat Panda", R.drawable.panda),
            Animal("Swallow","A singing Swallow", R.drawable.swallow_bird),
            Animal("Tiger","A fierce white Tiger", R.drawable.white_tiger),
            Animal("Zebra","A black and white Zebra", R.drawable.zebra),
            Animal("Baboon","A dumb baboon", R.drawable.baboon),
            Animal("Bulldog","A nice bulldog", R.drawable.bulldog),
            Animal("Panda","A Fat Panda", R.drawable.panda),
            Animal("Swallow","A singing Swallow", R.drawable.swallow_bird),
            Animal("Tiger","A fierce white Tiger", R.drawable.white_tiger),
            Animal("Zebra","A black and white Zebra", R.drawable.zebra)
        )

        animalAdapter = AnimalRecyclerAdapter(animals)
        rcvAnimals.apply {
            layoutManager= LinearLayoutManager(this@MainActivity)
            adapter = animalAdapter
        }
    }

}