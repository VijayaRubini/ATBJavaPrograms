package May2024.ex_18052024.Encapsulation;

public class lab191 {

    public static void main(String[] args) {
        vwoLogin v1 = new vwoLogin("Admin", "Admin123");
        // v1.username="Admin";
        //v1.password="Admin123";
        System.out.println(v1.username);
       // System.out.println(v1.password);

    }
}
    class vwoLogin {

        public String username;
        private  String password;

        public vwoLogin(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

