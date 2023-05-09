
class DataTypes {

    public void array(){

        int arr1[] = new int[10]; //work with C++ and java alike
        int arr2[] = {1,2,3,4,5,6,7,8,9,10};

        int mat1[][] = new int[3][4];
        int mat2[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //column do no need to be of same size (think like c++ dynamic 2d array)
    }


    public void string(){
        //c-style array
        char s1[] = "Hello".toCharArray();

        //immutable string (cannot be edited)
        String s2 = "A Immutable" + "string";
        String s3 = new String("A Immutable " + "string");

        //mutable string
        StringBuffer s4 = new StringBuffer("A Mutable StringBuffer");
        StringBuilder s5 = new StringBuilder("A Mutable StringBuilder (not thread safe)");

        System.out.printf("s1 = %s, s2 = %s, s3 = %s, s4 = %s, s5 = %s\n",new String(s1), s2,s3,s4,s5);

        //updating string
        s1[1] = 'E';
        s4.setCharAt(3,'U');
        s4.setCharAt(4,'T');

        System.out.printf("s1 = %s, s2 = %s, s3 = %s, s4 = %s, s5 = %s\n",new String(s1), s2,s3,s4,s5);


        //char
        char ch = 'A';
        ch = '\ua432'; //updated to unicode escape sequence
        System.out.printf("ch = %c\n",ch);

    }
    public void integers(){
        System.out.printf("Java Integers\n");

        //4 types of primitive integers
        byte b_max = Byte.MAX_VALUE;
        short s_max = Short.MAX_VALUE;
        int i_max = Integer.MAX_VALUE;
        long l_max = Long.MAX_VALUE;

        System.out.printf("MAXIMUM for integer type :: b_max = %d, s_max = %d, i_max = %d, l_max = %d\n",b_max,s_max,i_max,l_max);

        //2 types of float
        double d_max = Double.MAX_VALUE;
        float f_max = Float.MAX_VALUE;
        System.out.printf("MAXIMUM :: f_max = %4.2f, d_max = %f\n",f_max,d_max);
        //print in scientific notation
        System.out.printf("Scientific Notation f_max = %e\n",f_max);

        //Seperator in integer,float
        int account_balance = 193_34_34;
        System.out.printf("account_balance = %d\n",account_balance);

        //other base notation integers
        int hex_num = 0x2F; //base 16
        int oct_num = 031; //base 8
        long hex_num_long = 0x345FAL;

        //initilize with scientific notation
        double  c = 3.0e8; //3.0 * 10^8
        c = 3.0e+8; //3.0 * 10^100
        c = 3.0e-8; //3.0 * 10^-8






    }
    public void variableTypes(){
        //(1) Integers

        //byte,short,int,long
        //double,float
        //char

        //boolean, Boolean

        byte b1 = 4;
        byte b_max = Byte.MAX_VALUE;

        short s_max = Short.MAX_VALUE;
        int a = 10;
        int max_a = Integer.MAX_VALUE;

        System.out.printf("MAX of each b_max = %d, s_max = %d\n",b_max,s_max);

        System.out.printf("b1= %d, b_max = %d,a = %d, max_a = %d\n",b1, b_max,a,max_a);


        //String
        String str = "Hello World";
        System.out.printf("str = %s\n",str);

        StringBuffer s1 = new StringBuffer("Example of Editable String");

//         s1[1] = 'Y';
        s1.setCharAt(1,'Y');


        StringBuilder s2 = new StringBuilder("Example of Editable String");
        s2.setCharAt(1,'A');

        System.out.printf("s1: %s, s2=%s\n",s1,s2);

        char s3[] = "Hello".toCharArray();
        s3[1] = 'E';
        System.out.printf("s3 = %s\n",new String(s3));

        for(int i=0;i<s3.length;i++){
            System.out.printf("s3[%d]:%c, ",i,s3[i]);
        }
        System.out.println();

        System.out.printf("\n\t::Testing Boolean now\n");
        boolean bb1 = true;
        Boolean bb2 = Boolean.TRUE; //True, False, null
        System.out.printf("bb1 = %b, bb2 = %b\n",bb1,bb2);

    }
}


class Entry{

    public static void main(String[] args){
        System.out.printf("Hello from Entry\n");

        DataTypes t= new DataTypes();

//        t.variableTypes();
//        t.integers();
            t.string();
    }

}
