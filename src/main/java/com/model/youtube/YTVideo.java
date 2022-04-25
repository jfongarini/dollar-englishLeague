package com.model.youtube;

public class YTVideo {
    private final String PART = "id";
    private final String CHANNELID ="UCkzCjdRMrW2vXLx8mvPVLdQ";
    private String q;
    private final String MAXRESULTS ="1";
    private final String KEY = "AIzaSyB1H6hzeZaPuwQLb_ToWbr3PMVAff_hc-M";

    public YTVideo(String q) {
        this.q = q;
    }

    public String getPART() {
        return PART;
    }

    public String getCHANNELID() {
        return CHANNELID;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getMAXRESULTS() {
        return MAXRESULTS;
    }

    public String getKEY() {
        return KEY;
    }
}
