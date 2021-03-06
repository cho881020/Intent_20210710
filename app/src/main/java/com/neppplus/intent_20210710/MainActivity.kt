package com.neppplus.intent_20210710

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_CODE_NICKNAME = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener {

//            다른 화면으로 넘어가기.

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

        sendMessageBtn.setOnClickListener {

//            입력된 문구 변수에 저장.
            val inputMessage = messageEdt.text.toString()

//            메세지 조회 화면으로 넘어가기.

            val myIntent = Intent(this, ViewMessageActivity::class.java)

//            출발 하기 전에 짐을 첨부하고나서
            myIntent.putExtra("message", inputMessage)

//            비행기 출발
            startActivity(myIntent)

        }


        sendContentBtn.setOnClickListener {

            val input = messageEdt.text.toString()

            val myIntent = Intent(this, ViewContentActivity::class.java)
            myIntent.putExtra("content", input)
            startActivity(myIntent)

        }

        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_CODE_NICKNAME)

        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_CODE_NICKNAME) {

            if (resultCode == Activity.RESULT_OK) {

                val newNickname = data?.getStringExtra("nick")
                nicknameTxt.text = newNickname

            }

        }

    }

}