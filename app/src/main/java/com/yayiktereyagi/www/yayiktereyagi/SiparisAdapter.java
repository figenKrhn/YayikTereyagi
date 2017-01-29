package com.yayiktereyagi.www.yayiktereyagi;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yayiktereyagi.www.yayiktereyagi.model.Siparis;

import java.util.List;

/**
 * Created by WİN8.1 on 12/20/2016.
 */

public class SiparisAdapter extends RecyclerView.Adapter<SiparisAdapter.FirmaViewHolder> {
    List<Siparis> siparisList;
    final static int SIPARIS_ALINDI = 100;
    final static int SIPARIS_ILETILDI = 101;
    final static int SIPARIS_ODENDI = 102;
    int mSiparisDurum=SIPARIS_ALINDI;

    public class FirmaViewHolder extends RecyclerView.ViewHolder {
        CardView cv;

        TextView tvMiktar;
        TextView tvTarih;
        ImageView imgDurum;
        public FirmaViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.card_view);

            tvMiktar= (TextView) itemView.findViewById(R.id.miktar_text_view);
            tvTarih= (TextView) itemView.findViewById(R.id.tarih_text_view);
            imgDurum = (ImageView) itemView.findViewById(R.id.durum_imageview);
        }
    }
    SiparisAdapter(List<Siparis> siparisList){
        this.siparisList = siparisList ;
    }

    @Override
    public SiparisAdapter.FirmaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.satir_recycler, parent, false);
        FirmaViewHolder pvh = new FirmaViewHolder(v);
        return pvh;

    }

    @Override
    public void onBindViewHolder(FirmaViewHolder holder, int position) {

        holder.tvMiktar.setText(siparisList.get(position).getMiktar());
        holder.tvTarih.setText( siparisList.get(position).getTarih());
       //switch ile
        switch(mSiparisDurum) {
            case SIPARIS_ODENDI:
                holder.imgDurum.setImageResource(siparisList.get(position).getSiparisDurum());
                break;
            case SIPARIS_ILETILDI:
                holder.imgDurum.setImageResource(siparisList.get(position).getSiparisDurum());
                break;
            default:
                holder.imgDurum.setImageResource(siparisList.get(position).getSiparisDurum());
                break;
        }
        //holder.imgDurum.setImageResource(siparisList.get(position).getSiparisDurum());
    }

   @Override
    public int getItemCount() {
        return siparisList.size();
    }


}

