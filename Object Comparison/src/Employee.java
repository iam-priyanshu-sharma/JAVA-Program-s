public class Employee {
    private int regno;
    private String name;

    public Employee (int regno, String name) {
        this.name = name;
        this.regno = regno;
    }

    public int getRegno () {
        return regno;
    }

    public void setRegno (int Regno) {
        this.regno = Regno;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        return this.getRegno() == ((Employee) obj). getRegno();
    }
}