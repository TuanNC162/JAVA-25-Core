public class SinhVienIT extends SinhVienTechMaster{
    private double diemJava;
    private  double diemHtml;
    private  double diemCss;

    public SinhVienIT(String name, String majors, double diemJava, double diemHtml, double diemCss) {
        super(name, majors);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    @Override
    public String getHocLuc() {
        return super.getHocLuc();
    }

    @Override
    public double getDiem() {
        return (2*diemJava + diemHtml + diemCss)/4;
    }

    @Override
    public String toString() {
        return "SinhVienIT :" + "\n" +
                "Họ và Tên: " + getName() + "\n" +
                "Ngành Học: " + getMajors() + "\n" +
                "Điểm Java: " + diemJava + "\n" +
                "Điểm HTML: " + diemHtml + "\n" +
                "Điểm CSS: " + diemCss;
    }
}
