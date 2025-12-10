package Banking;

class Details{
    private String name;
    private String password;
    private int accountNo;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    // public void info(){
    //     System.out.println(name+" \n" +accountNo+" \n "+password);
    // }
    // @Override
    public String info() {
        return "Details [name=" + name + ", password=" + password + ", accountNo=" + accountNo + "]";
    }

    

}
public class Info {
    public static void main(String[] args) {
        Details d=new Details();
        d.setAccountNo(123456);
        d.setName("Ayan Ajmeri");
        d.setPassword("Kafukato@2025");
        // d.info();
        System.out.println(d.info());
    }
}
