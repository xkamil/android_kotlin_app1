package pl.canx.app1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener { toastMe() }
        btn_count.setOnClickListener { countMe() }
        btn_random.setOnClickListener { showRandom() }
    }

    private fun toastMe(){
        val toast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT)
        toast.show()
    }

    private fun countMe(){
        var count = tv_count.text.toString().toInt()
        count++
        tv_count.text = count.toString()
    }

    private fun showRandom(){
        val totalCount = tv_count.text.toString().toInt()
        val rndIntent = Intent(this, SecondActivity::class.java)
        rndIntent.putExtra(SecondActivity.TOTAL_COUNT, totalCount)
        startActivity(rndIntent)
    }

}

