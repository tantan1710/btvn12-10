public class StudentIT extends TechmasterStudent {
    private double java;
    private double html;
    private double css;

    public StudentIT(String name, String branch, double java, double html, double css) {
        super(name, branch);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    public double getDiem() {
        return  (2*java + html + css)/4;
    }
}
