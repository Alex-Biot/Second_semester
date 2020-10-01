import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlgebraTest {
    @Test
    public void test() {
        Account acc1 = new Account("1", true,1000l );
        Account acc2 = new Account("2", true,2000l );
        Account acc3 = new Account("3", true,3000l );
        Account acc4 = new Account("4", true,4000l );
        Account acc5 = new Account("5", true,5000l );

        List<Account> accounts = Arrays.asList(acc1, acc2, acc3, acc4, acc5);
        Algebra algebra = new Algebra();
        algebra.blockAccount(accounts,3000l);
        System.out.println(accounts);

    }
    @Test
            public void testInt(){
        int[] f = {16,21,30};
        int[] s = {35,40,50};

         int [] c= Algebra.concatAndTransform(f,s);
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }

    }



}