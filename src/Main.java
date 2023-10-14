public class Main {
    public static void main(String[] args) {
        int sttsvIt = 0;
        int sttsvBz = 0;

        TechmasterStudent[] svIt = new StudentIT[10];
        svIt[0] = new StudentIT("Nguyễn Văn A", "IT", 9, 6, 4);
        svIt[1] = new StudentIT("Nguyễn Văn B", "DEV", 6, 5, 7);
        svIt[2] = new StudentIT("Nguyễn Văn C", "SEVER", 2, 3, 5);
        svIt[3] = new StudentIT("Nguyễn Văn D", "DEV", 10, 5, 7);
        svIt[4] = new StudentIT("Nguyễn Văn E", "IT", 5, 6, 3);
        svIt[5] = new StudentIT("Nguyễn Văn F", "DEV", 7, 8, 7);
        svIt[6] = new StudentIT("Nguyễn Văn G", "SEVER", 6, 5, 8);
        svIt[7] = new StudentIT("Nguyễn Văn H", "DEV", 4, 7, 8);
        svIt[8] = new StudentIT("Nguyễn Văn J", "SEVER", 9, 10, 8);
        svIt[9] = new StudentIT("Nguyễn Văn I", "IT", 10, 5, 7);

        TechmasterStudent[] svBz = new StudentBiz[10];
        svBz[0] = new StudentBiz("Nguyễn Văn A", "Marketing", 9, 10);
        svBz[1] = new StudentBiz("Nguyễn Văn B", "Sales", 8, 7);
        svBz[2] = new StudentBiz("Nguyễn Văn C", "Marketing", 7, 10);
        svBz[3] = new StudentBiz("Nguyễn Văn F", "Sales", 6, 6);
        svBz[4] = new StudentBiz("Nguyễn Văn E", "Marketing", 5, 10);
        svBz[5] = new StudentBiz("Nguyễn Văn W", "Sales", 4, 9);
        svBz[6] = new StudentBiz("Nguyễn Văn Q", "Marketing", 3, 8);
        svBz[7] = new StudentBiz("Nguyễn Văn Y", "Sales", 2, 10);
        svBz[8] = new StudentBiz("Nguyễn Văn R", "Marketing", 10, 1);
        svBz[9] = new StudentBiz("Nguyễn Văn B", "Sales", 5, 10);

        System.out.println("Danh sách sinh viên IT là: ");
        for (TechmasterStudent sv : svIt) {
            System.out.println((sttsvIt++)+1+".");
            sv.getInfo();
        }
        System.out.println();
        System.out.println("Danh sách sinh viên Biz là: ");
        for (TechmasterStudent svbz : svBz) {
            System.out.println((sttsvBz++)+1+".");
            svbz.getInfo();
        }
    }
}
