package AccessModifiers;

public class Password
{
    private static final int key = 748576362;
    private static final int sib;
    private final int encryptedPassword;

    static{
        sib=200;
        System.out.println("SB initialised");
    }

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }
    static{
        System.out.println("SB initialised again");
    }
    private int encryptDecrypt(int password) {

        return password ^ key;
    }

    public void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }


    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
