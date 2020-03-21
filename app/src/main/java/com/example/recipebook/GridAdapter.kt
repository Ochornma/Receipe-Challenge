package com.example.recipebook

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.*
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter(val context: Context, val image: Array<Int>, val tile: Array<String> ): BaseAdapter() {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val image = image[position]
        val title = tile[position]
        //var view:View = inflate(context, R.layout.grid_view_layout, parent)
        var view = convertView

       if (view == null){
           /* LayoutInflater.from(context).apply {
                view = this.inflate(R.layout.grid_view_layout, null)
            }*/

            val layoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.grid_view_layout, null)
        }
        val imageview = view?.findViewById<ImageView>(R.id.image)
        val gridTitle = view?.findViewById<TextView>(R.id.title)

        imageview!!.setImageResource(image)
        gridTitle!!.text = title

        return view!!
    }

    override fun getItem(position: Int): Any {
       return image.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
     return tile.size;
    }
}