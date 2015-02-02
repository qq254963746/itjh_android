package cn.com.itjh.itjh_android.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import cn.com.itjh.itjh_android.R;
import cn.com.itjh.itjh_android.adapter.base.AdapterBase;
import cn.com.itjh.itjh_android.model.Article;

import java.util.List;

/**
 * Created by Hu on 2015/2/2 0002.
 */
public class TestAdapter extends AdapterBase<Article>{
    @Override
    protected View getExView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView==null){
            viewHolder= new ViewHolder();
            convertView = View.inflate(context, R.layout.item_list_item,null);
            viewHolder.name =(TextView) convertView.findViewById(R.id.tv_item_name);
            viewHolder.date =(TextView) convertView.findViewById(R.id.tv_item_date);
            viewHolder.imgs =(TextView) convertView.findViewById(R.id.tv_item_imgs);
            viewHolder.author =(TextView) convertView.findViewById(R.id.tv_item_author);
            convertView.setTag(viewHolder);
        }else{
            viewHolder =  (ViewHolder) convertView.getTag();
        }

        Article article = getItem(position);

        if(article!=null){
            viewHolder.name.setText(article.getTitle());
            viewHolder.date.setText(article.getDate());
            viewHolder.imgs.setText(article.getImg());
            viewHolder.author.setText(article.getAuthor());

        }

        return convertView;
    }

    @Override
    protected void onReachBottom() {

    }

    private Context context;

    public TestAdapter(android.content.Context context) {
        this.context = context;
    }


    class ViewHolder{
        TextView name;
        TextView date;
        TextView imgs;
        TextView author;
    }
}
