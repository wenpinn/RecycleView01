package tools.wpfang.recycleview01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
  RecyclerView mRecycleView;
  String animal_name[],animal_desc[];
  int animal_images[]={R.drawable.th,R.drawable.th,R.drawable.th,R.drawable.th,
          R.drawable.th,R.drawable.th,R.drawable.th,R.drawable.th,R.drawable.th,
          R.drawable.th,R.drawable.th,R.drawable.th};
  AnimalAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecycleView=findViewById(R.id.myrecycleview);
        animal_name=getResources().getStringArray(R.array.animal_name);
        animal_desc=getResources().getStringArray(R.array.animal_desc);
        mAdapter=new AnimalAdapter(this,animal_name,animal_desc,animal_images);
        mRecycleView.setAdapter(mAdapter);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
    }
}
