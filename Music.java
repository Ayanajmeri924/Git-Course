class Music{
    public static void her() throws InterruptedException{
        Thread t=new Thread();

        // String[] lyrics={"Mein ab kyun hosh may aata nahi?",
        //     "Sukoon yeh dil kyun paata nahi?",
        //     "Kyun torrun khud se jo thay waaday",
        //     "Ke ab yeh ishq nibhaana nahi?",
        //     "Mein morrun tum se jo yeh chehra",
        //     "Dobara nazar milana nahi",
        //     "Yeh duniya jaanay mera dard",
        //     "Tujhe yeh nazar kyun aata nahi?"
                        
        // };
        String[] lyrics={"Sambhaal ke rakha wo phool mera tu",
                            "Meri shayari mein zaroor raha tu",
                            "Jo aankhon mein pyaari si duniya basaayi",
                            "Wo duniya bhi tha tu, wo lamha bhi tha tu",
                            "Haan, lagte hain mujhko ye kisse sataane",
                            "Deta na dil mera tujhko bhulaane",
                            "Adhoore se vaade, adhoori si raatein",
                            "Ab hisse mein daakhil mere bas wo yaadeid"
                        
                        };
        // int []delay={300,300,400,300,300,300,800};
        int []delay={700,700,370,250,100,350,300,50};


        // System.out.println("Pal Pal :\n ");
        System.out.println("Finding Her :\n ");
        Thread.sleep(1200);
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
            Thread.sleep(1000);
            System.out.println("\n--------edited by Ayan---------");
        } catch (Exception e) {
            e.getMessage();
        }
        // return lyrics;
    }
    public static void main(String[] args) throws InterruptedException {
        her();
    }
}