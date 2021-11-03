package adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.month_recyclerview.R
import model.Months

class ItemAdapter(val context: Context, val dataset: List<Months>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder (val view: View):RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
    return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
holder.textView.text = context.resources.getString(item.monthStringId)
    }

    override fun getItemCount(): Int = dataset.size
}