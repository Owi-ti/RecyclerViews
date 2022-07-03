package dev.owiti.recyclerview2

import ...


class NumberRecyclerViewAdapter(var Numbers:List<Int>):RecyclerView.Adapter<NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var View = LayoutInflater.from(parent.context)
            .inflate(R.layout.number_list_item, parent, false)
        return  NumberViewHolder(View)

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNum.inputType=Numbers.get(position)
    }

    override fun getItemCount(): Int {
        return Numbers.size
    }
}
class NumberViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvNum=itemView.findViewById<TextView>(R.id.tvNum)

}