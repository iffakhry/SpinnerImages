package net.crevion.fakhry.spinnerimages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.jaredrummler.materialspinner.MaterialSpinner;

public class MainActivity extends AppCompatActivity {

    ImageView imgTarget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgTarget = (ImageView) findViewById(R.id.imgTarget);

        MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.spinner);
        spinner.setItems("Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow");
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                if (item.equals("Ice Cream Sandwich")){
                    imgTarget.setImageResource(R.drawable.ics);
                    Log.v("itemklik", "berhasil ics");
                }else if(item.equals("Jelly Bean")){
                    imgTarget.setImageResource(R.drawable.jellybean);
                    Log.v("itemklik", "berhasil jelly bean");
                }else if(item.equals("KitKat")){
                    imgTarget.setImageResource(R.drawable.kitkat);
                    Log.v("itemklik", "berhasil kitkat");
                }else if(item.equals("Lollipop")){
                    imgTarget.setImageResource(R.drawable.lollipop);
                    Log.v("itemklik", "berhasil lollipop");
                }else if(item.equals("Marshmallow")){
                    imgTarget.setImageResource(R.drawable.marshmallow);
                    Log.v("itemklik", "berhasil marshmallow");
                }

//                Toast.makeText(getApplicationContext(), "Selected " +item, Toast.LENGTH_LONG);
                Log.v("itemklik", item);
//                Snackbar.make(view, "Clicked " + item, Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
