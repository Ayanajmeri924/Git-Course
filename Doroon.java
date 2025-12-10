public class Doroon {
    public static void dooron() throws InterruptedException{
        // Thread t=new Thread();

    
        String[] lyrics={"Sochu ke milni te bolaanga ki",
                        "Teri taan gallaan'ch..shaayari",
                        "Vekhegi mainu te sochegi kya tu",
                        "Mitti da banda main, tu taan pari...",
                        "Ishqe di galiyach, khoya e dil ve",
                        "Aas lagaaye ik jaaye tu mil ve",
                        "Kol tere mainu",
                        "aan de soni",
                        "karaan main kitne jatan o soni",
                        "Dooron dooron main"
                        
                        };
       
        int []delay={200, 180, 210, 24, 170, 200, 200, 170, 230,250};


        System.out.println("Dooron Doroon :\n ");
        Thread.sleep(1500);
        for(int i=0;i<lyrics.length;i++){
            String line=lyrics[i];
            for (char c : line.toCharArray()) {
                System.out.print(c);
                System.out.flush();
                Thread.sleep(100);
            }

            System.out.println();

            if (i < delay.length) {
                Thread.sleep((long)(delay[i]));
            } else {
                Thread.sleep(800);
            }
            
        }
        try {
            Thread.sleep(2000);
            System.out.println("\n--------edited by Ayan---------");
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        dooron();
    }
}

