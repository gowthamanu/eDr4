package edr.bhanuinfosystems.com.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

import edr.bhanuinfosystems.com.R;
import edr.bhanuinfosystems.com.model.Doctor;

/**
 * Created by Belal on 10/18/2017.
 */

public class Doctor_list_Adapter extends RecyclerView.Adapter<Doctor_list_Adapter.ProductViewHolder> {


    private Context mCtx;
    private List<Doctor> productList;

    public Doctor_list_Adapter(Context mCtx, List<Doctor> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.doc_list_reg, parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

        Doctor product = productList.get(position);


        holder.textViewTitle.setText(product.getId());
        holder.textViewShortDesc.setText(product.getDname());
        holder.textViewRating.setText(String.valueOf(product.getDgen()));
        holder.textViewPrice.setText(String.valueOf(product.getDmob()));
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        public RelativeLayout relativeLayout;

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;


        public ProductViewHolder(View itemView) {

            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relative);

        }
    }
}