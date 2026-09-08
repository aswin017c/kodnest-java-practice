
public class Unlock {

    void unlockPhone(int pin) {
        if (pin == 1234) {
            System.out.println("Phone is unlocked");
        } else {
            System.out.println("Phone is locked");
        }
    }

    void unlockPhone(String password) {
        if (password == "abc") {
            System.out.println("Phone is unlocked");
        } else {
            System.out.println("Phone is locked");
        }
    }

    void unlockPhone(Face face) {
        if (face != null) {
            System.out.println("Phone is unlocked");
        } else {
            System.out.println("Phone is locked");
        }
    }
}

class Face {

}
