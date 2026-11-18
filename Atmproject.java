
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author PC
 */
public class Atmproject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bakiye = 10000;
        int cekilenpara;
        int yatirilanpara;
        int islemsayisi = 0;
        System.out.println("Hos geldiniz bakiyeniz " + bakiye + " liradir");
        System.out.println("hangi islemi yapmak istersiniz para cekmek mi para yatirmak mi (eger ki para cekmek isterseniz 2 yazin yatirmak isterseniz 1 yazin ikisi de degilse 0 yazin ikisini de yapmak isterseniz 3 yazin)");
        int islem = input.nextInt();
        if (islem < 0 || islem > 3) {
            System.out.println("hatali islem girisi");
        } else {
            if (islem == 0) {
                System.out.println("isleminiz sonlandiriliyor");
            }
            if (islem == 1) {
                System.out.println("para yatirma islemi baslatiliyor. Ne kadar para yatirmak isterseniz");
                yatirilanpara = input.nextInt();
                if (yatirilanpara <= 0) {
                    System.out.println("gecersiz yatirilan para miktari islem sonlaniyor");
                } else {
                    bakiye = bakiye + yatirilanpara;
                    islemsayisi++;
                    System.out.println("islem miktari " + yatirilanpara);
                }
            }
            if (islem == 3) {
                System.out.println("para yatirma islemi baslatiliyor. Ne kadar para yatirmak isterseniz");
                yatirilanpara = input.nextInt();
                if (yatirilanpara <= 0) {
                    System.out.println("gecersiz yatirilan para miktari islem sonlaniyor");
                } else {
                    bakiye += yatirilanpara;
                    System.out.println("islem miktari " + yatirilanpara);
                    System.out.println("para cekme islemi baslatiliyor. Ne kadar para cekmek istersiniz");
                    cekilenpara = input.nextInt();
                    if (cekilenpara > bakiye) {
                        System.out.println("yetersiz bakiye");
                    } else {
                        bakiye = bakiye - cekilenpara;
                        islemsayisi = islemsayisi + 2;
                        System.out.println("islem miktari " + cekilenpara);
                    }
                }
            } else {
                if (islem == 2) {
                    System.out.println("para cekme islemi baslatiliyor. Ne kadar para cekmek istersiniz");
                    cekilenpara = input.nextInt();
                    if (cekilenpara > bakiye) {
                        System.out.println("yetersiz bakiye");
                    } else {
                        bakiye = bakiye - cekilenpara;
                        islemsayisi++;
                        System.out.println("islem miktari " + cekilenpara);

                    }
                }
            }
            System.out.println("yaptiginiz islem sayisi= " + islemsayisi);
            System.out.println("son bakiyeniz= " + bakiye);
        }
    }
}
