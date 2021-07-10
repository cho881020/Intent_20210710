package com.neppplus.intent_20210710

import android.app.Activity
import android.content.Intent
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
            val resultIntent = Intent()  // 돌아가는 길은 왕복티켓이므로 따로 출발/도착지 명시할 필요가 없다.
            resultIntent.putExtra("nick", newNickname)

//            완료버튼을 누른게 맞다 세팅 + resultIntent를 결과로 쓰이도록
            setResult(Activity.RESULT_OK, resultIntent)

//            이전화면으로 복귀.
            finish()

        }

    }
}