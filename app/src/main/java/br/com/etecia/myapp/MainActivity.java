package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<filmes> filmesList;

    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.idListaFilmes);

        filmesList = new ArrayList<>();

        filmesList.add(
                new filmes("Apocalipse", R.drawable.apocalipe,"Todo mundo morre", "Ação")
        );
        filmesList.add(
                new filmes("Rei da Montanha", R.drawable.rei_montanha,"Um rei na montanha", "Ação")
        );
        filmesList.add(
                new filmes("Apocalipse", R.drawable.doismilesessetnaesete,"Todo mundo morre", "Ação")
        );
        filmesList.add(
                new filmes("Apocalipse", R.drawable.apocalipe,"Todo mundo morre", "Ação")
        );

        MyAdapter adapter = new MyAdapter(getApplicationContext(), filmesList);

        idRecyclerView.setLayoutManager(new
                GridLayoutManager(getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);
    }
}