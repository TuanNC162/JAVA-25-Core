public abstract class SinhVienTechMaster {
    private String name;
    private String majors;

    public SinhVienTechMaster(String name, String majors) {
        this.name = name;
        this.majors = majors;
    }

    public SinhVienTechMaster() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public abstract double getDiem();

    public String getHocLuc () {
        double diem = getDiem();
        String hocLuc = null;
        if (diem <5) {
            hocLuc = "Học Lực Yếu";
        } else if (diem < 6.5){
            hocLuc = "Học Lực Trung Bình";
        } else if (diem < 7.5) {
            hocLuc = "Học Lực Khá";
        } else {
            hocLuc = "Học Lực Giỏi";
        }
        return hocLuc;
    }

    public void print () {
        System.out.println("Họ và tên: " +name);
        System.out.println("Ngành học: " +majors);
        System.out.println("Điểm: " +getDiem());
        System.out.println("Học lực: " +getHocLuc());
    }
}
