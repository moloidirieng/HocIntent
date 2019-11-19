package a.mt.hocintent;

import java.io.Serializable;

public class HocSinh implements Serializable {
    private String HoTen;
    private int namsinh;

    public HocSinh(String hoTen, int namsinh) {
        HoTen = hoTen;
        this.namsinh = namsinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
}
