public class PrePost {
    public static void main(String[] args)
    {
        int preInc,postInc, preDec, postDec;
        preInc=postInc=preDec=postDec=10;
        System.out.println(++preInc);
        System.out.println(postInc++);
        System.out.println(--preDec);
        System.out.println(postDec--);
    }
}
