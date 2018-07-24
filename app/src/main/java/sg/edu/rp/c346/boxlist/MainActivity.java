package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvcolor;
    ArrayList<ColorItem> alColorItem;
    CustomAdapter cacolor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvcolor=findViewById(R.id.ListViewColor);

        alColorItem=new ArrayList<>();
        ColorItem item1 =new ColorItem("blue");
        ColorItem item2 =new ColorItem("orange");
        ColorItem item3 =new ColorItem("Brown");
        alColorItem.add(item1);
        alColorItem.add(item2);
        alColorItem.add(item3);
        cacolor = new CustomAdapter(this, R.layout.color_item, alColorItem);

        lvcolor.setAdapter(cacolor);
    }
}