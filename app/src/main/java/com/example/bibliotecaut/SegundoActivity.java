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
        titles.add("Hacking: The Art of Exploitation");
        titles.add("The Data Warehouse Toolkit: ");
        titles.add("Python Crash Course:");
        titles.add("The Lean Startup:");
        titles.add("Machine Learning Yearning");
        titles.add("The DevOps Handbook: " );
        titles.add("The Docker Book");
        titles.add("Computer Systems: A Programmer's Perspective");
        titles.add("Network Security Essentials");
        titles.add("Metasploit: The Penetration Tester's Guide");
        titles.add("Applied Cryptography");
        titles.add("Cryptography Engineering");
        titles.add("Security Engineering" );
        titles.add("Firewalls and Internet Security");
        titles.add("The Practice of Network Security Monitoring:");
        titles.add("Cascading Style Sheets:");
        titles.add("You Don't Know JS");
        titles.add("JavaScript: The Definitive Guide");
        titles.add("HTML and CSS: Design and Build Websites");

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
        images.add(R.drawable.doce);
        images.add(R.drawable.trece);
        images.add(R.drawable.catorce);
        images.add(R.drawable.quince);
        images.add(R.drawable.diesies);
        images.add(R.drawable.diecisiete);
        images.add(R.drawable.dieciocho);
        images.add(R.drawable.diecinueve);
        images.add(R.drawable.veinte);
        images.add(R.drawable.veintiuno);
        images.add(R.drawable.veintidos);
        images.add(R.drawable.veintitres);
        images.add(R.drawable.veinticuatro);
        images.add(R.drawable.veinticinco);
        images.add(R.drawable.veintiseis);
        images.add(R.drawable.veintisiete);
        images.add(R.drawable.veintiocho);
        images.add(R.drawable.veintinueve);
        images.add(R.drawable.treinta);

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
        urls.add("https://ia800807.us.archive.org/29/items/hacking-the-art-of-exploitation/hacking-the-art-of-exploitation.pdf");//12
        urls.add("http://artemisa.unicauca.edu.co/~ecaldon/docs/bd/the_dw_Toolkit.pdf");//13
        urls.add("https://bedford-computing.co.uk/learning/wp-content/uploads/2015/10/No.Starch.Python.Oct_.2015.ISBN_.1593276036.pdf");//14
        urls.add("https://ia800509.us.archive.org/7/items/TheLeanStartupErickRies/The%20Lean%20Startup%20-%20Erick%20Ries.pdf");//15
        urls.add("https://nessie.ilab.sztaki.hu/~kornai/2020/AdvancedMachineLearning/Ng_MachineLearningYearning.pdf");//16
        urls.add("http://images.itrevolution.com/documents/DevOps_Handbook_Intro_Part1_Part2.pdf");//17
        urls.add("http://lsi.vc.ehu.es/pablogn/docencia/manuales/The%20Docker%20Book.pdf");//18
        urls.add("https://www.cs.sfu.ca/~ashriram/Courses/CS295/assets/books/CSAPP_2016.pdf");//19
        urls.add("https://elhacker.info/manuales/Redes/3._Network-security-essentials-4th-edition-william-stallings.pdf");//20
        urls.add("https://olinux.net/wp-content/uploads/2019/01/Metasploit-The-Penetration-Tester-s-Guide.pdf");//21
        urls.add("https://mrajacse.files.wordpress.com/2012/01/applied-cryptography-2nd-ed-b-schneier.pdf");//22
        urls.add("Cryptography Engineering: Design Principles and Practical Applications");//23
        urls.add("https://terrorgum.com/tfox/books/security_engineering_a_guide_to_building_dependable_distributed_systems.pdf");//24
        urls.add("https://cdn.preterhuman.net/texts/underground/hacking/Firewalls%20and%20Internet%20Security%20-%20Repelling%20the%20Wily%20Hacker%202nd%20Ed%202003.pdf");//25
        urls.add("https://terrorgum.com/tfox/books/practiceofnetworksecuritymonitoring.pdf");//26
        urls.add("https://www.comune.marsala.tp.it/flex/files/D.9bed5103dd9a84864af8/css_guida.pdf");//27
        urls.add("https://xiaoguo.net/~books/Program/You_Dont_Know_JS_Up_and_Going.pdf");//28
        urls.add("https://pepa.holla.cz/wp-content/uploads/2016/08/JavaScript-The-Definitive-Guide-6th-Edition.pdf");//29
        urls.add("https://wtf.tw/ref/duckett.pdf");//30

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