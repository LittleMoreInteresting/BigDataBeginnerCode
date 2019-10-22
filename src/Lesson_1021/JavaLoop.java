package Lesson_1021;

public class JavaLoop {

    public static void main(String[] args) {
        JavaLoop loops = new JavaLoop();
        loops.mulTable();
    }
    /**
     * 使用循环打印九九乘法表：
     */
    public void mulTable(){
        System.out.println("九九乘法表--标准版");
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                int mulNum = i*j;
                System.out.print(j+"×"+i+"="+(mulNum>=10?mulNum:" "+mulNum)+"\t");
            }
            System.out.println("");
        }
        System.out.println("九九乘法表--标准版上下对称");
        for (int i=9 ; i>0 ; i-- ){
            for (int j=1;j<=i;j++){
                int mulNum = i*j;
                System.out.printf("%6s",j+"×"+i+"="+(mulNum>=10?mulNum:" "+mulNum)+"\t");
            }
            System.out.println("");
        }
        System.out.println("九九乘法表--金字塔");
        this.spaces();
        System.out.printf("%3s"," |\\\n");
        this.spaces();
        System.out.printf("%3s"," | \\\n");
        this.spaces();
        System.out.printf("%3s"," |__\\\n");
        this.spaces();
        System.out.printf("%3s"," |\n");
        for (int i=1 ; i<10 ; i++ ){
            for (int j=0;j<(9-i);j++){
                System.out.printf("%3s","\t");
            }
            for (int j=1;j<=i;j++){
                int mulNum = i*j;
                System.out.printf("%6s",j+"×"+i+"="+(mulNum>=10?mulNum:" "+mulNum)+"\t");
            }
            System.out.println("");
        }

    }

    private void spaces(){
        for (int j=0;j<(8);j++){
            System.out.printf("%3s","\t");
        }
    }

    /**
     * 用for循环求2+22+222+2222+22222的和。
     */
}
