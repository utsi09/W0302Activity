package kr.ac.kumoh.s20190703.prof.w0302activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() { //AppCompatActivity에서 상속을 받는다.
    override fun onCreate(savedInstanceState: Bundle?) {
        //savedInstanceState : 활동 이전의 상태가 포함된 Bundle 객체이다.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Lifecycle","onCreate()")

    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle","onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Lifecycle","onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Lifecycle","onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Lifecycle","onStop()")
    }
}