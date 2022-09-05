package 案例;
//7.7
public class Love {
    public static void main(String[] args) {
        for(float y=1.5f;y>-1.5f;y-=0.1f){
            for (float x=-1.5f;x<1.5f;x+=0.03f){
                float a=x*x+y*y-1.1f;
                if((a*a*a-x*x*y*y*y)<0.0f){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
