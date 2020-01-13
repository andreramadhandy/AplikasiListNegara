package id.ac.poliban.mi.andre.aplikasilistview3;

import androidx.annotation.NonNull;

public class Country {
    private String flag;
    private String countryName;
    private String countryDetail;

    public Country(String flag, String countryName, String countryDetail) {
        this.flag = flag;
        this.countryName = countryName;
        this.countryDetail = countryDetail;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryDetail() {
        return countryDetail;
    }

    public void setCountryDetail(String countryDetail) {
        this.countryDetail = countryDetail;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%30s", getCountryName());
    }


}
