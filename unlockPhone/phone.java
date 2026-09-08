
public class phone {
     public static void main(String[] args) {
        
        Unlock u=new Unlock();
        u.unlockPhone(1234);
        u.unlockPhone("abc");

        Face f=new Face();
        u.unlockPhone(f);

        // or
        //u.unlockPhone(new Face());
     }
}
