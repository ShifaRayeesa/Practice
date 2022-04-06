public class IntegerToRoman {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] integerNumerals={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanNumerals={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result="";
        //StringBuilder romanNum=new StringBuilder();
        int num= sc.nextInt();
        for(int i=0;i<integerNumerals.length;i++)  {
            while(num >= integerNumerals[i])
            {
                result=result+romanNumerals[i];
                num=num-integerNumerals[i];
               // romanNum.append(romanNumerals[i]);
            }
        }
       // System.out.println(romanNum.toString());
        System.out.println(result);
    }
}
