package intern.codingchallenge.brijenshah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(firstNonRepeated("hello"))


    }

    private fun firstNonRepeated(str : String) : String
    {
        val counter = HashMap<Char,Int>()

        for(char in str)
        {
            counter[char] = counter.getOrDefault(char,0) + 1
        }
        for(char in str){
            if(counter[char]==1){
                return char.toString()

            }
        }
        return " "
    }
}