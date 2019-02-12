package pl.canx.app1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showRandomNumber()
    }

    fun showRandomNumber(){
        val max = intent.getIntExtra(TOTAL_COUNT,0)
        var rnd = 0

        if(max > 0){
            rnd = Random().nextInt(max + 1)
        }

        tv_random.text = rnd.toString()
        tv_label.text = getString(R.string.random_string, max)

    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }
}
