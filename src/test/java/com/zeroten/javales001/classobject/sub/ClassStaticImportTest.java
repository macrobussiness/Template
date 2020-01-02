package com.zeroten.javales001.classobject.sub;

// import com.zeroten.javales001.classobject.ClassStaticImport;
import static com.zeroten.javales001.classobject.ClassStaticImport.name;
import static com.zeroten.javales001.classobject.ClassStaticImport.println;
import org.testng.annotations.Test;

public class ClassStaticImportTest {

//    @Test
//    public void testUse1() {
//        System.out.println(ClassStaticImport.name);
//        ClassStaticImport.println();
//    }

    @Test
    public void testUse2() {
        System.out.println(name);
        println();
    }
}
