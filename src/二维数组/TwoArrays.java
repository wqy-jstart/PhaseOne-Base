package 二维数组;

public class TwoArrays {
    public static void main(String[] args) {
        System.out.println("=================================================");
        //1）定义一个二维数组：---------静态初始化
        int [][] arrays = new int[2][2];//创建了一个二维数组arrays，里面包含两个一维数组,每个一维数组中各有两个int类型的元素，默认值为0
        int [][] arrays1 = {{1,2},{3,4}};//和arrays数组相同，只是元素确定了
        int [][] arrays2 = new int[][]{{5,6},{7,8}};//和前两个相同，只是元素改变了
        System.out.println(arrays[0]);//系统输出二维数组arrays中第1个一维数组对象[I@1b6d3586
        //System.out.println(arrays[1][2]);下标越界异常，第2个一维数组中只含有两个元素，最高到arrays[1].length-1(第2个一维数组中最后一个元素)
        System.out.println(arrays[1][1]);//系统输出arrays中第2个一维数组中的第2个int类型元素,因未修改元素,所以输出默认值0
        System.out.println(arrays1[1][1]);//系统输出arrays1中第2个一维数组中的第2个int类型元素，因已被赋值，故为4
        System.out.println(arrays2[1][0]);//系统输出arrays2中第2个一维数组中的第1个int类型元素，因已被赋值，故为7
        System.out.println("=================================================");

        System.out.println("=================================================");
        //2）给二维数组中的各个元素赋值：----------动态初始化
        //给二维数组中的第1个一维数组中整型元素赋初始值
        arrays[0] = new int[4];//创建二维数组arrays中的第一个一维数组中包含4个元素
        arrays[0][0]=1;//给二维数组arrays中第1个一维数组中的第1个元素赋值为1
        arrays[0][1]=2;//给二维数组arrays中第1个一维数组中的第2个元素赋值为2
        arrays[0][2]=3;//给二维数组arrays中第1个一维数组中的第3个元素赋值为3
        arrays[0][3]=4;//给二维数组arrays中第1个一维数组中的第4个元素赋值为4
        System.out.println(arrays[0][2]);//系统输出二维数组arrays中第1个一维数组中的第3个元素,3
        arrays[0][3]=400;//修改二维数组arrays中第一个数组中的第四个元素的值为400
        System.out.println(arrays[0][3]);//系统输出修改后的二维数组arrays中第1个一维数组中的第4个元素,400
        //给二维数组中的第2个一维数组中整型元素赋初始值
        arrays[1] = new int[3];//创建二维数组arrays中第2个一维数组中包含3个元素
        arrays[1][0]=11;//给二维数组arrays中的第2个一维数组中第1个整型元素赋值为11
        arrays[1][1]=22;//给二维数组arrays中的第2个一维数组中第2个整型元素赋值为22
        arrays[1][2]=33;//给二维数组arrays中的第2个一维数组中第3个整型元素赋值为33
        System.out.println(arrays[1][2]);//系统输出二维数组arrays中第2个一维数组中的第3个整型元素,33
        System.out.println("=================================================");

        System.out.println("=================================================");
        // 遍历array二维数组
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("=================================================");

        System.out.println("=================================================");
        //3）遍历并排列二维数组中的元素：----------利用嵌套for循环
        int[][] a=new int[3][3];//创建一个二维数组a，包含3个一位数组，每一个一维数组中含有3个整型元素，默认值为0
        for (int i = 0; i < a.length; i++) {//嵌套遍历二维数组中的每一个元素
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=(int)(Math.random()*100+1);
                System.out.print(a[i][j]+"\t");//输出每一个元素时隔开间距
            }
            System.out.println(" ");//每一个一维数组遍历结束都会换行
        }
        System.out.println("=================================================");
        int[][] b = new int[3][3];
        int i = 0;
        int j = 0;
        while (i<b.length){
            i++;
            while (j<b[i].length){
                j++;
                b[i][j]=(int)(Math.random()*100+1);
                System.out.println(b[i][j]);
            }
            System.out.println(" ");
        }
    }
}
