package algorithm

import java.text.DateFormat
import java.text.SimpleDateFormat


fun main(){
    var sample = "07:05:45PM"
    //sample = "12:00:00AM"
    print(TimeConversion.timeConversion(sample))

}
object TimeConversion {

    fun timeConversion(s: String): String {

        val regex = """([A-Z])\w+""".toRegex()
        val matchResult = regex.find(s)
        if(matchResult != null) {
            val newS = s.replace(matchResult.value, " ${matchResult.value}")
            val dateFormat: DateFormat = SimpleDateFormat("hh:mm:ss aa")

            val format: DateFormat = SimpleDateFormat("HH:mm:ss")
            val time = dateFormat.parse(newS)

            return format.format(time)
        }
        return s
    }

}