package org.example;

public class SinhVien {
    protected String MaSV;
    protected Double DiemToan;
    protected  Double DiemLy;
    protected Double DiemHoa;

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public Double getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(Double diemToan) {
        DiemToan = diemToan;
    }

    public Double getDiemLy() {
        return DiemLy;
    }

    public void setDiemLy(Double diemLy) {
        DiemLy = diemLy;
    }

    public Double getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemHoa(Double diemHoa) {
        DiemHoa = diemHoa;
    }

    public double TinhDiemTB()
    {
        return (this.DiemToan + this.DiemLy + this.DiemHoa)/3;
    }
}
