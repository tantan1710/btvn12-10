public abstract class TechmasterStudent {
    private String name;
    private String branch;

    public TechmasterStudent(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    public abstract double getDiem();
        public String getRank() {
            if (getDiem() < 5) {
                return "Yếu";
            } else if (getDiem() >= 5 && getDiem() < 6.5) {
                return "TB";
            } else if (getDiem() >= 6.5 && getDiem() < 8.5) {
                return "Khá";
            } else {
                return "Giỏi";

            }
        }
        public void getInfo() {
            System.out.println("Tên Sinh Viên: "+name+ " Chuyên ngành: "+branch+ " Điểm số: "+getDiem() + " Học lực: "+getRank());
        }


    }

