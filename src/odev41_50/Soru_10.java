package odev41_50;

public class Soru_10 {
    public static void main(String[] args) {

        /*50-----
    Youtube video sayfasının urlsinde yer alan video id'sini
    return eden bir method yazınız :

     ÖRNEKLER
    youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg")
    ID : XPEr1cArWRg

    youtubeId("https://youtu.be/BCDEDi5gDPo")
    ID : BCDEDi5gDPo

    youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4")
    ID : vxP3bY-XxY4
    */
        String id = "";

        String link = "https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4";
        for (int i = link.length()-11; i <= link.length()-1  ; i++) {
            id += link.charAt(i);

        }
        System.out.println(id);

    }
}
