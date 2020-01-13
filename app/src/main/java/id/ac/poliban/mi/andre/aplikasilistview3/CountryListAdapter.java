package id.ac.poliban.mi.andre.aplikasilistview3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class CountryListAdapter extends BaseAdapter {
    private List<Country> countries;

    public CountryListAdapter(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_country_list, viewGroup, false);

        ImageView imgCountryListName = view.findViewById(R.id.img_country_flag_list);
        TextView tvCountryName = view.findViewById(R.id.tv_country_name);
        TextView tvCountryDetail = view.findViewById(R.id.tv_country_detail);

        //isi data
        Glide.with(viewGroup.getContext())
                .load(countries.get(position).getFlag())
                .apply(new RequestOptions().override(90, 55))
                .into(imgCountryListName);
        tvCountryName.setText(countries.get(position).getCountryName());
        tvCountryDetail.setText(countries.get(position).getCountryDetail());

        return view;
    }

}
