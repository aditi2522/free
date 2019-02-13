public class D {
    public static void main(String[] args) {
        int[][] a=new int[20][20];
        for(int i=0;i<20;i++)
        {
            for(int j=0;j<20;j++)
                a[i][j]=(int)(Math.random()*100);

        }
        int max=0;
        int index=0;
        int max1=0;
        int index1=0;

        for (int i = 0; i < 20; i++)
        {
            int sum=0;
            int sum1=0;
            for (int i1 = 0; i1 < a.length; i1++) {
                sum = sum + a[i][i1];
                sum1=sum1+a[i1][i];
            }
            System.out.println("sum of row"+(i+1)+"="+sum);
            System.out.println("sum of column"+(i+1)+"="+sum1);


                    if(sum>max)
                    {
                        max=sum;
                        index=i;
                    }
            if(sum1>max1)
            {
                max1=sum1;
                index1=i;
            }



        }
        System.out.println("row with maximum row is="+(index+1));
        System.out.println("column with maximum sum is="+(index1+1));
        }

    }

