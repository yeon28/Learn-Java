package p05.class_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Reflection : class 정보
public class ReflectionEx {

   public static void main(String[] args) throws ClassNotFoundException {
      Class cls = Class.forName("p05.class_class.Circle");

      System.out.println("[클래스 이름]");
      System.out.println(cls.getName());
      System.out.println();
      
      System.out.println("[생성자 정보]");
      Constructor[] constructors = cls.getDeclaredConstructors();
      for (Constructor constructor : constructors) {
         System.out.print(constructor.getName() + "(");
         Class[] parameters = constructor.getParameterTypes();
         printParameters(parameters);
         System.out.println(")");
      }
      
      System.out.println();
      
      System.out.println("[필드 정보]");
      Field[] fields = cls.getDeclaredFields();
      for (Field field : fields) {
         System.out.println(field.getType().getSimpleName() + " " + field.getName());
      }
      
      System.out.println();
      
      System.out.println("[메소드 정보]");
      Method[] methods = cls.getDeclaredMethods();
      for (Method method : methods) {
         System.out.print(method.getName() + "(");
         Class[] paramters = method.getParameterTypes();
         printParameters(paramters);
         System.out.println(")");
      }
   }

   private static void printParameters(Class[] parameters) {
      for (int i=0; i<parameters.length; i++) {
         System.out.print(parameters[i].getName());
         if (i <parameters.length-1) {
            System.out.print(",");
         }
      }
   }
}