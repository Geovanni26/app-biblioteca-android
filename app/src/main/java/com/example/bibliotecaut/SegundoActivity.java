package com.example.bibliotecaut;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    // Agrega esta lista como campo en tu clase
    List<String> urls;

    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        dataList=findViewById(R.id.dataList);
        titles = new ArrayList<>();
        images = new ArrayList<>();
        urls = new ArrayList<>();


        titles.add("MANUAL INFORMÁTICO I");
        titles.add("CLEAN CODE" );
        titles.add("the pragmatic programmer");
        titles.add("Introduction to algorithms");
        titles.add("Code: The Hidden Language of Computer Hardware and Software");
        titles.add("Sapiens: A Brief History of Humankind");
        titles.add("The Art of Computer Programming");
        titles.add("Improving the Design of Existing Code");
        titles.add("The Web Application Hacker's Handbook:");
        titles.add("Artificial Intelligence" );
        titles.add("Head First Design Patterns");
        titles.add("Libro 12");
        titles.add("Libro 13 ");
        titles.add("Libro 14 ");
        titles.add("Libro 15");
        titles.add("Libro 16");
        titles.add("Libro 17" );
        titles.add("Libro 18");
        titles.add("Libro 19");
        titles.add("Libro 20 ");
        titles.add("Libro 21 ");
        titles.add("Libro 22");
        titles.add("Libro 23");
        titles.add("Libro 24" );
        titles.add("Libro 25");
        titles.add("Libro 26");
        titles.add("Libro 27 ");
        titles.add("Libro 28 ");
        titles.add("Libro 29");
        titles.add("Libro 30");

        images.add(R.drawable.uno);
        images.add(R.drawable.dos);
        images.add(R.drawable.tres);
        images.add(R.drawable.cuatro);
        images.add(R.drawable.cinco);
        images.add(R.drawable.seis);
        images.add(R.drawable.siete);
        images.add(R.drawable.ocho);
        images.add(R.drawable.nueve);
        images.add(R.drawable.diez);
        images.add(R.drawable.once);
        images.add(R.drawable.seis);
        images.add(R.drawable.uno);
        images.add(R.drawable.tres);
        images.add(R.drawable.cuatro);
        images.add(R.drawable.diez);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);
        images.add(R.drawable.baseline_access_time_filled_24);

        urls.add("https://www.upg.mx/wp-content/uploads/2015/10/LIBRO-31-Manual-de-Informatica.pdf");
        urls.add("https://thixalongmy.haugiang.gov.vn/media/1175/clean_code.pdf");
        urls.add("https://www.cin.ufpe.br/~cavmj/104The%20Pragmatic%20Programmer,%20From%20Journeyman%20To%20Master%20-%20Andrew%20Hunt,%20David%20Thomas%20-%20Addison%20Wesley%20-%201999.pdf");
        urls.add("https://dahlan.unimal.ac.id/files/ebooks/2009%20Introduction%20to%20Algorithms%20Third%20Ed.pdf");
        urls.add("https://bobcarp.files.wordpress.com/2014/07/code-charles-petzold.pdf");
        urls.add("https://www.1pezeshk.com/wp-content/uploads/2019/07/Sapiens-A-Brief-History-of-Humankind.pdf");
        urls.add("https://doc.lagout.org/science/0_Computer%20Science/2_Algorithms/The%20Art%20of%20Computer%20Programming%20(vol.%201_%20Fundamental%20Algorithms)%20(3rd%20ed.)%20%5BKnuth%201997-07-17%5D.pdf");
        urls.add("https://silab.fon.bg.ac.rs/wp-content/uploads/2016/10/Refactoring-Improving-the-Design-of-Existing-Code-Addison-Wesley-Professional-1999.pdf");
        urls.add("https://edu.anarcho-copy.org/Against%20Security%20-%20Self%20Security/Dafydd%20Stuttard,%20Marcus%20Pinto%20-%20The%20web%20application%20hacker's%20handbook_%20finding%20and%20exploiting%20security%20flaws-Wiley%20(2011).pdf");//9
        urls.add("https://people.engr.tamu.edu/guni/csce421/files/AI_Russell_Norvig.pdf");//10
        urls.add("https://legacy.cs.indiana.edu/classes/c212-dgerman/spr2015/griffin/a.pdf");//11
        urls.add("");//12
        urls.add("");//13
        urls.add("");//14
        urls.add("");//15


        adapter = new Adapter(this,titles,images,urls);

        int orientation = getResources().getConfiguration().orientation;

        int spanCount;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Landscape mode
            spanCount = 3; // Cambiar a 3 columnas en modo horizontal
        } else {
            // Portrait mode
            spanCount = 2; // Mantener 2 columnas en modo vertical
        }

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, spanCount, GridLayoutManager.VERTICAL, false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);


    }
    //método para botón anterior:
    public void Anterior(View view){
        Intent anterior=new Intent(this, MainActivity.class);
        startActivity(anterior);
    }


}