class Music{
    public static void palpal() throws InterruptedException{
        Thread t=new Thread();

        String[] lyrics={"Mein ab kyun hosh may aata nahi?",
            "Sukoon yeh dil kyun paata nahi?",
            "Kyun torrun khud se jo thay waaday",
            "Ke ab yeh ishq nibhaana nahi?",
            "Mein morrun tum se jo yeh chehra",
            "Dobara nazar milana nahi",
            "Yeh duniya jaanay mera dard",
            "Tujhe yeh nazar kyun aata nahi?"
                        
        };
        int []delay={300,300,400,300,300,300,800};

        System.out.println("Pal Pal :\n ");
        Thread.sleep(1200);
        for(int i=0;i<lyrics.length;i++){
            String line=lyrics[i];
            for (char c : line.toCharArray()) {
                System.out.print(c);
                System.out.flush();
                Thread.sleep(60);
            }

            System.out.println();

            if (i < delay.length) {
                Thread.sleep((long)(delay[i]));
            } else {
                Thread.sleep(800);
            }
            
        }
        // return lyrics;
    }
    public static void main(String[] args) throws InterruptedException {
        palpal();
    }
}