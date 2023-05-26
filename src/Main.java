import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        String userName,password;

        Scanner inp =new Scanner(System.in);

        System.out.print("kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("şifreniz : ");
        password = inp.nextLine();

        if(userName.equals("patika")&& password.equals("java123")){
            System.out.println("Giriş Yaptınız ! ");
        }else {
            System.out.println("Bilgileriniz yanlış ! ");
            int n;


            System.out.println("Bilgilerinizi sıfırlamak isterseniz 1 ' seçiniz ");
            n = inp.nextInt();
            if(n==1){
                String userName2,password2;

                System.out.print("yeni kullanıcı Adınız : ");
                userName2 = inp.nextLine();

                System.out.print("yeni şifreniz : ");
                password2 = inp.nextLine();

                if(userName2.equals("patika") && password2.equals("java123")) {
                    System.out.println("Giriş Yaptınız ! ");
                }else {
                    System.out.println("Bilgileriniz yanlış ! ");}
            }



        }

    }
}
