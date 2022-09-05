package 案例;

public class Chicken {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){
                for(int k=0;k<=100;k++){
                    if((i+j+k==100)&&(i*3+j*4+k*0.5==100)){
                        System.out.println("母鸡数量:"+i+" 公鸡数量:"+j+" 小鸡数量:"+k);
                    }
                }
            }
        }
    }
}
