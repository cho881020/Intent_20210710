package com.neppplus.intent_20210710

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {

//            입력한 새 닉네임이 뭔지
            val newNickname = nicknameEdt.text.toString()

//            그걸 돌아가는 길에 첨부하고 (결과로 설정한다)


//            이전화면으로 복귀.
            finish()

        }

    }
}