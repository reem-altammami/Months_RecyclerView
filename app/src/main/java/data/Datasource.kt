package data

import com.example.month_recyclerview.R
import model.Months
import java.time.Month

class Datasource {
    fun loadMonths():List<Months>{
        var listMonths = mutableListOf<Months>()
        listMonths.add(Months(R.string.jan))
        listMonths.add(Months(R.string.feb))
        listMonths.add(Months(R.string.mar))
        listMonths.add(Months(R.string.apr))
        listMonths.add(Months(R.string.may))
        listMonths.add(Months(R.string.june))
        listMonths.add(Months(R.string.july))
        listMonths.add(Months(R.string.sept))
        listMonths.add((Months(R.string.oct)))
        listMonths.add(Months(R.string.nov))
        listMonths.add((Months(R.string.dec)))
        return listMonths

    }
}