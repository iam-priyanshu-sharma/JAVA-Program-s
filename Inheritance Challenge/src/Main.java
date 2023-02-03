public class Main {

    public static void main (String[] args) {

        Employee priyanshu = new Employee ("Priyanshu", "23/01/2001", "01/01/2020");
        System.out.println (priyanshu);
        System.out.println ("Age = " + priyanshu.getAge ());
        System.out.println ("Pay = " + priyanshu.collectPay ());

        SalariedEmployee yash = new SalariedEmployee ("Yash", "02/09/2001", "03/03/2020", 35000);
        System.out.println (yash);
        System.out.println ("Yash's Paycheck = $" + yash.collectPay ());

        yash.retire ();
        System.out.println ("Yash's Pension check = $" + yash.collectPay ());

        HourlyEmployee swati = new HourlyEmployee ("Swati", "24/02/2000", "03/03/2021", 15);
        System.out.println (swati);
        System.out.println ("Swati's Paycheck = $" + swati.collectPay ());
        System.out.println ("Swati's Holiday Pay = $" + swati.getDoublePay ());
    }
}
