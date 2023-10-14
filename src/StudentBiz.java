public class StudentBiz extends TechmasterStudent{
    public double marketing;
    public double sales;

    public StudentBiz(String name, String branch, double marketing, double sales) {
        super(name, branch);
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    public double getDiem() {
        return (2*marketing + sales)/3;
    }
}
