package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<SinhVien> lstSinhVien = new ArrayList<SinhVien>();

        //Sinhvien
        SinhVien sv = new SinhVien();
        sv.setMaSV("SV1");
        sv.setDiemToan(9d);
        sv.setDiemLy(7d);
        sv.setDiemHoa(6d);

        lstSinhVien.add(sv);


        //Sinhvien nuoc ngoai
        SinhVienNuocNgoai svnn = new SinhVienNuocNgoai();
        svnn.setMaSV("SVNN1");
        svnn.setDiemToan(5d);
        svnn.setDiemLy(5d);
        svnn.setDiemHoa(5d);
        svnn.setDiemTiengViet(5d);

        lstSinhVien.add(svnn);

        for (SinhVien svn : lstSinhVien) {
            if(svn.TinhDiemTB()>=5)
            {
                System.out.println(svn.getMaSV());
            }
        }
    }
}
