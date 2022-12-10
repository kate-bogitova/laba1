public class Main {
    public static void main(String[] args)
    {
        Array<Integer> intArrList = new Array<> ();

        for(int i=0;i<20;i+=2)
        {
            intArrList.add(i);
        }

        System.out.println (intArrList.get ( 0 ) );
        System.out.println (intArrList.get ( 1 ) );
        System.out.println (intArrList.get ( 2 ) );

        intArrList.remove(1);

        System.out.println (intArrList.get ( 0 ) );
        System.out.println (intArrList.get ( 1 ) );
        System.out.println (intArrList.get ( 2 ) );

    }
}
