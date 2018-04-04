package space.vinopen.vinopen;


import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

public class MainActivity extends Activity {

    Button saveButton;
    TabHost tabHost;
    Fragment fragment_1;
    Fragment fragment_2;
    Fragment fragment_2w;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment_1 = new Fragment1();
        fragment_2 = new Fragment2();
        fragment_2w = new Fragment1();

        saveButton = (Button) findViewById(R.id.save);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Меняем текст в TextView (tvOut)
                Intent myIntent = new Intent(getApplicationContext(), MapsActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                startActivity(myIntent);
            }
        });

    }

}
