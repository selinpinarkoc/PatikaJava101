import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String username, password, reset;
        boolean again= true, newpw = true;

        while (again) {
            Scanner inp = new Scanner(System.in);

            System.out.print("Username: ");
            username = inp.nextLine();

            System.out.print("Password: ");
            password = inp.nextLine();

            if (username.equals("patika") && password.equals("java123")) {
                System.out.print("You are logged in.");
                again = false;
            } else if (username.equals("patika")) {
                System.out.print("Your password is wrong. Do you want to reset your password? yes/no: ");
                reset = inp.nextLine();

                switch (reset) {
                    case "yes":
                        while (newpw) {
                            System.out.print("Enter new password: ");
                            password = inp.nextLine();
                            newpw = false;
                            again = false;
                            if (password.equals("java123")) {
                                System.out.println("Could not create the password, please enter an another password.");
                                newpw = true;
                            } else {
                                System.out.println("Password is created.");
                            }
                        }
                        break;
                        default:
                        again = true;
                        break;
                }
            } else {
                System.out.println("User not found");
                again = true;
            }
        }
    }
}

