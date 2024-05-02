package com.example.trenirovka3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)



        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()
            /*
        items.add(Item(1, "przemyslav", "пшемыслав", "местный долбоёб",
            "однажды он умрёт мучительной смертью",499))
        items.add(Item(2, "bogdanchik", "богданчик", "школьник ёбанный",
            "как же он устал в шкалку поганую ходить",500))
        items.add(Item(3, "pngwing", "камень", "камень",
            "камень",10000))

             */
        items.add(Item(1, "autism", "Аутизм", "существо с аутизмом",
            "Чудовищное существо обладающее неукротимым разрастающимся аутизмом." +
                    "При нахождении рядом с этим существом у всех окружаюших также активируется аутизм",
            499))
        items.add(Item(2, "repost", "Православие", "🙏🙏🙏",
            "Репост если ненавидишь антихриста. Лайк если любишь маму. " +
                    "Коммент если каждый божий день по воскресеньям ходишь в церковь." +
                    "Репост в телеграм канал если постоянно думаешь о том как убить себя",500))
        items.add(Item(3, "moguch", "Могущество", "власть, сила..... существо с могуществом",
            "Однажды ты проснёшься и поймёшь, что весь мир у твоих ног, ибо ты его господин. " +
                    "Однажды все, кого ты когда-то знал преклонятся перед тобой, ибо ты самый могучий среди них. " +
                    "Ты будешь на самой верщине мира. Тебе не будет равных. Но и не будет никого, кому ты будешь хоть как-то дорог",10000))
        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items,this)

    }
}