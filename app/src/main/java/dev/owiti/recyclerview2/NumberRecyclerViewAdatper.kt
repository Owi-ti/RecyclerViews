package dev.owiti.recyclerview2

import ...



class NumberRecyclerViewAdapter(var numberList: List<Int>):RecyclerView.Adapter<NumberRecyclerViewAdapter.NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.number_list_item, parent, false)
        return NumberViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {

        holder.tvNum.text = numberList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numberList.size
    }

    class NumberViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNum= itemView.findViewById<TextView>(R.id.tvNum)

    }

}


