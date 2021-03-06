package chengxiang9004.com.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chengxiang on 2017/9/13.
 */

public class Forecast {
    @SerializedName("astro")
    public Astro astro;
    @SerializedName("cond")
    public Cond cond;
    @SerializedName("date")
    public String date;
    @SerializedName("hum")
    public String hum;
    @SerializedName("pcpn")
    public String pcpn;
    @SerializedName("pop")
    public String pop;
    @SerializedName("pres")
    public String pres;
    public Tmp tmp;
    public class Tmp{
        @SerializedName("max")
        public String max;
        @SerializedName("min")
        public String min;
    }
    @SerializedName("uv")
    public String uv;
    @SerializedName("vis")
    public String vis;
    public Wind wind;
    public class Wind{
        @SerializedName("deg")
        public String deg;
        @SerializedName("dir")
        public String dir;
        @SerializedName("sc")
        public String sc;
        @SerializedName("spd")
        public String spd;
    }
    public class Astro{
        @SerializedName("mr")
        public String mr;
        @SerializedName("ms")
        public String ms;
        @SerializedName("sr")
        public String sr;
        @SerializedName("ss")
        public String ss;
    }
    public class Cond{
        @SerializedName("code_d")
        public String code_d;
        @SerializedName("code_n")
        public String code_n;
        @SerializedName("txt_d")
        public String txt_d;
        @SerializedName("txt_n")
        public String txt_n;
    }
}
