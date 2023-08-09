package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    private Context mContexto;

    private List<filmes> lstFilmes;

    public MyAdapter(Context applicationContext, List<filmes> filmesList) {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_filmes, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.idTituloFilmes.setText(lstFilmes.get(position).getTitulo());
        holder.idImagemFilme.setImageResource(lstFilmes.get(position).getImagem());


    }

    @Override
    public int getItemCount() {
        return lstFilmes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView idTituloFilmes;

        ImageView idImagemFilme;

        CardView idCardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            idTituloFilmes = itemView.findViewById(R.id.idTituloFilmes);
            idImagemFilme = itemView.findViewById(R.id.idImgFilmes);
            idCardView = itemView.findViewById(R.id.idCardFilmes);
        }
    }

}
