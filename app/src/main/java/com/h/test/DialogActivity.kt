package com.h.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

//        val exampleList = generateDummyList(100)
//        val locList=findViewById<RecyclerView>(R.id.locList)
//        locList.adapter = DialogAdapter(exampleList)
//        locList.layoutManager = LinearLayoutManager(this)
//        locList.setHasFixedSize(true)

    }
//    private fun generateDummyList(size: Int): List<DialogItem> {
//        val list = ArrayList<DialogItem>()
//        for (i in 0 until size) {
////            val textLoc = when (i % 5) {
////                0 -> "7250 Keele St, Concord, ON L4K 1Z1, Canada"
////                1 -> "7250 Keele St, Concord, ON L4K 1Z2, Canada"
////                2 -> "7250 Keele St, Concord, ON L4K 1Z3, Canada"
////                3 -> "7250 Keele St, Concord, ON L4K 1Z4, Canada"
////                else -> "7250 Keele St, Concord, ON L4K 1Z5, Canada"
////            }
//            val item = DialogItem("7250 Keele St, Concord, ON L4K 1Z1, Canada")
//            list += item
//        }
//        return list
//    }
}