package sg.edu.rp.c346.project03_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ThemeList extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_list);

        list = (ListView)findViewById(R.id.list);

        ArrayList<Theme> themeList;
        CustomAdapterTheme caThemeList;
        themeList = new ArrayList<Theme>();
        caThemeList = new CustomAdapterTheme(this, R.layout.activity_custom_adapter_theme, themeList);
        list.setAdapter(caThemeList);

        Theme item1 = new Theme("League of Legends");

        caThemeList.add(item1);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent play = new Intent(getBaseContext(), Play.class);
                startActivity(play);
            }
        });

    }
}
