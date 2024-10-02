public class Main {
    public static void main(String[] args){
        for (int i =1; i<=226; i++){
            if (i% 15==0){
                int roots = 2;
                double x = i;
                String fbf = "fizzbuzz";
                if(Math.pow(x, 1.0/roots)==15){
                    System.out.println(fbf.repeat(roots));
                    roots++;
                } else{
                    System.out.println(fbf);
                }
            }else if (i % 3 == 0){
                String f = "fizz";
                double ff = i;
                int fsf = 0;
                String fizzfizz = "fizz";
                do{
                    ff=ff/3;
                    fsf++;
                } while(ff>1);
                 if (ff == 1){
                     int count=fsf;
                     System.out.println(fizzfizz.repeat(count));
                } else{
                    System.out.println(f);
                }
                } else if (i % 5 == 0){
                    String b = "buzz";
                    double bb = i;
                    int bsf = 0;
                    do{
                        bb=bb/5;
                        bsf++;
                    } while (bb>1);
                    if (bb ==1){
                        System.out.println(b.repeat(bsf));
                    } else{
                        System.out.println(b);
                    }
                }else {
                    System.out.println(i);
                    
                }
                  
            }
        }
    }


