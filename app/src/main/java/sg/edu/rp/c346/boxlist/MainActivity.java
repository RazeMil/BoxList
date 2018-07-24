package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBoxList;
    ArrayList<BoxListItem> alBoxList;
    CustomAdapter caBoxList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBoxList = findViewById(R.id.listViewBox);
        alBoxList = new ArrayList<>();

        BoxListItem color1 = new BoxListItem(true,false,false);
        BoxListItem color2 = new BoxListItem(false,true,false);
        BoxListItem color3 = new BoxListItem(false,false,true);

        alBoxList.add(color1);
        alBoxList.add(color2);
        alBoxList.add(color3);

        caBoxList = new CustomAdapter(this,R.layout.boxlist_item,alBoxList);

        lvBoxList.setAdapter(caBoxList);
    }
}
