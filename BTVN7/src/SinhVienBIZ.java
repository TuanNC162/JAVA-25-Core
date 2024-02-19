public class SinhVienBIZ extends SinhVienTechMaster {
    private double diemMarketing;
    private double diemSales;

    public SinhVienBIZ(String name, String majors, double diemMarketing, double diemSales) {
        super(name, majors);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public String getHocLuc() {
        return super.getHocLuc();
    }

    @Override
    public double getDiem() {
        return (2*diemMarketing + diemSales)/3;
    }

    @Override
    public String toString() {
        return "SinhVienBiz: " + "\n" +
                "Họ và Tên: " + getName() + "\n" +
                "Ngành Học: " + getMajors() + "\n" +
                "Điểm Marketing: " + diemMarketing + "\n" +
                "Điểm Sales: " + diemSales;
    }
}
