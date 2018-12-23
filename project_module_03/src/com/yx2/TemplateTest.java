package com.yx2;

import com.yx.ProjectModule;

import java.util.ArrayList;

/**
 * @author yx
 * @create 2018/12/23  ,16:24
 *常用的模板
 */
public class TemplateTest {

    private static ArrayList li2;

    private static final ProjectModule pr = new ProjectModule();
 // psf
    public static final String STR = "123";
    // psfi
    public static final int numa= 2;
    public static final String str="";
    // 模板1
 public static void main(string[] args) {

     System.out.println();
     System.out.println("args = [" + args + "]");
     System.out.println("TemplateTest.main");
     System.out.println("args = " + args);
     int num = 0 ;
     System.out.println("num = " + num);
//     fori
String[] strarry =  ["a","b","c"] ;
     for (int i = 0; i <strarry.length ; i++) {
         System.out.println(i);
     }
//     iter
     for (String s : strarry) {
         System.out.println(strarry[s]);
     }
     // itar
     for (int i = 0; i < strarry.length; i++) {
         String s = strarry[i];

     }

     // 模板四 list.for
     li2 = new ArrayList();
     li2.add("1");
     li2.add("2");
     li2.add("3");
      // li2.for
     for (Object o : li2) {
         
     }
     // li2.fori
     for (int i = 0; i < li2.size(); i++) {
         
     }
     // li2.forr
     for (int i = li2.size() - 1; i >= 0; i--) {
         
     }
//     if null
 // ifn
     if (strarry == null) {

     }
//     inn
     if (strarry != null) {

     }

     // 模板6








 }

}
