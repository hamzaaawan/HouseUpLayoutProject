package com.h.test

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btn_click_me = findViewById(R.id.dialog) as Button
        // set on-click listener
        btn_click_me.setOnClickListener {
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.activity_dialog, null)
            val exampleList = generateDummyList(100)
            val locList=mDialogView.findViewById<RecyclerView>(R.id.locList)
            locList.adapter = DialogAdapter(exampleList)
            locList.layoutManager = LinearLayoutManager(this)
            locList.setHasFixedSize(true)

            val mBuilder = AlertDialog.Builder(this)
            mBuilder.setView(mDialogView)
                .setTitle("Activity Dialog")
            val  mAlertDialog = mBuilder.show()
            val okBtn=mDialogView.findViewById<Button>(R.id.postButton)
            okBtn.setOnClickListener{
                //dismiss dialog
                val textMain=findViewById<TextView>(R.id.text)
                val dialogText=mDialogView.findViewById<TextView>(R.id.etCreatePost)
                val text=dialogText.text.toString()
                textMain.text=text

                mAlertDialog.dismiss()

            }
//            val cancelBtn=mDialogView.findViewById<Button>(R.id.dialogCancelBtn)
//            cancelBtn.setOnClickListener{
//                mAlertDialog.dismiss()
//                //dismiss dialog
//                Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
//
//                mAlertDialog.dismiss()
//
//            }



        }
    }
    private fun generateDummyList(size: Int): List<DialogItem> {
        val list = ArrayList<DialogItem>()
        for (i in 0 until size) {
//            val textLoc = when (i % 5) {
//                0 -> "7250 Keele St, Concord, ON L4K 1Z1, Canada"
//                1 -> "7250 Keele St, Concord, ON L4K 1Z2, Canada"
//                2 -> "7250 Keele St, Concord, ON L4K 1Z3, Canada"
//                3 -> "7250 Keele St, Concord, ON L4K 1Z4, Canada"
//                else -> "7250 Keele St, Concord, ON L4K 1Z5, Canada"
//            }
            val item = DialogItem("7250 Keele St, Concord, ON L4K 1Z1, Canada")
            list += item
        }
        return list
    }
}