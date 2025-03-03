package org.example;

public class SinhVienNuocNgoai extends SinhVien{
    protected double DiemTiengViet;

    public double getDiemTiengViet() {
        return DiemTiengViet;
    }

    public void setDiemTiengViet(double diemTiengViet) {
        DiemTiengViet = diemTiengViet;
    }

    @Override
    public double TinhDiemTB() {
        return (this.DiemToan + this.DiemLy + this.DiemHoa + this.DiemTiengViet)/4;
    }
}
