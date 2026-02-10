import Strings.*;
import Arrays.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(Methods.Method01.test(340, 473));
        String01 test = new String01();
        String result = test.fuseString("bruh ","for real");
        System.out.println(result);
    
        for(int i = 0; i < array2d.twoD.length; i++){
            for(int l = 0;l < array2d.twoD[i].length; l++){
                System.out.print(i);
                System.out.print(l+" ");
                System.out.println(array2d.twoD[i][l]);
            }
        }
    }

}
