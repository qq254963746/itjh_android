package cn.com.itjh.itjh_android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import cn.com.itjh.itjh_android.adapter.TestAdapter;
import cn.com.itjh.itjh_android.model.Article;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends Activity {


    private ListView articlesListView;


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        articlesListView =(ListView) findViewById(R.id.articles);

        TestAdapter testAdapter = new TestAdapter(this);

        articlesListView.setAdapter(testAdapter);

        testAdapter.appendToList(loadData());

    }


    /**
     * 获取文章列表
     * @return
     */
    private List<Article> loadData(){

        List<Article> articles = new ArrayList<Article>();
        articles.add(new Article(1,"IT江湖1","222","2222","222","2222"));
        articles.add(new Article(2,"IT江湖2","222","2222","222","2222"));
        articles.add(new Article(3,"IT江湖3","222","2222","222","2222"));

        return articles;
    }

}
