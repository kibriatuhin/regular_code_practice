package anotation.processor;

import anotation.anotation.IntValue;
import anotation.anotation.StrValidate;
import anotation.anotation.StrValue;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class RuntimeProcessor {
    public static void process(Object object){

        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields){
            field.setAccessible(true);
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations){
                processAnnotation(annotation,field,object);
            }
        }

    }
    private static void processAnnotation(Annotation annotation, Field field, Object object){
        if (annotation instanceof IntValue){
            processIntValueAnnotation((IntValue) annotation,field,object);
        }else if (annotation instanceof StrValue){
            processStrValueAnnotation((StrValue) annotation,field,object);
        }else if (annotation instanceof StrValidate){
            processStrValidateAnnotation((StrValidate) annotation,field,object);
        }
    }
    private static void processIntValueAnnotation(IntValue intValue , Field field , Object object)
    {
        try {
            field.setInt(object,intValue.value());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void processStrValueAnnotation(StrValue strValue , Field field , Object object)
    {
        try {
            field.set(object,strValue.value());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void processStrValidateAnnotation(StrValidate strValue , Field field , Object object)
    {
        try {
            String address = (String) field.get(object);
            int min = strValue.min();
            int max = strValue.max();
            int len = address.length();
            if (len < min && len >max){
                throw new RuntimeException(strValue.message());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
