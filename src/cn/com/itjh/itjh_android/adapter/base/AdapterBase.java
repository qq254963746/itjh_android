package cn.com.itjh.itjh_android.adapter.base;

import java.util.LinkedList;
import java.util.List;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * 基础适配器
 * 
 * @param <T> 实体泛型
 * @author Axl.Jacobs
 */
public abstract class AdapterBase<T> extends BaseAdapter {

    protected final List<T> mList = new LinkedList<T>();

    /**
     * 获取列表数据
     * 
     * @param list
     */
    public List<T> getList() {
        return mList;
    }

    public void appendToTop(T t) {
        if (t == null) {
            return;
        }
        mList.add(0, t);
        notifyDataSetChanged();
    }

    public void append(T t) {
        if (t == null) {
            return;
        }
        mList.add(t);
        notifyDataSetChanged();
    }

    public void removieBottom() {
        mList.remove(mList.size() - 1);
        notifyDataSetChanged();
    }

    public void removieByIndex(int index) {
        mList.remove(index);
        notifyDataSetChanged();
    }

    /**
     * 追加数据
     * 
     * @param list
     */
    public void appendToList(List<T> list) {
        if (list == null) {
            return;
        }
        mList.addAll(list);
        notifyDataSetChanged();
    }

    /**
     * 追加数据
     * 
     * @param list
     */
    public void appendToTopList(List<T> list) {
        if (list == null) {
            return;
        }
        mList.addAll(0, list);
        notifyDataSetChanged();
    }

    /**
     * 清空数据
     */
    public void clear() {
        mList.clear();
        notifyDataSetChanged();
    }

    /**
     * 获取数量
     */
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mList.size();
    }

    /**
     * 根据position 获取单个对象
     */
    @Override
    public T getItem(int position) {
        // TODO Auto-generated method stub
        if (position > mList.size() - 1) {
            return null;
        }
        return mList.get(position);
    }

    /**
     * 获取position
     */
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        if (position == getCount() - 1) {
            onReachBottom();
        }
        System.err.println("getCount:"+getCount());
        return getExView(position, convertView, parent);
    }

    protected abstract View getExView(int position, View convertView,
            ViewGroup parent);

    /**
     * 滚动到底
     */
    protected abstract void onReachBottom();

}
