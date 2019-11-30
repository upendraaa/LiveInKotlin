package info

import kotlin.reflect.full.functions


class AnnotationUsage{

    @BasicAnnotation("BRU",30)
    fun A(){

    }

    @BasicAnnotation("BRU",40)
    fun B(){}

    //this will return default value of annotation
    @BasicAnnotation
    fun c(){}


}


fun main(){

    var annotationClass = AnnotationUsage::class;

    //Fuctions "equalsTo","hashcode","toString" will default present in the annotation class, so total function will be 3+2 five
    for( function in annotationClass.functions){
        val annotations: List<Annotation> = function.annotations
        if(annotations!=null && annotations.size>0)
        {
            //AS we are using only one annotation here so we can get it from Index 0
            val basicAnnotation:BasicAnnotation = annotations.get(0) as BasicAnnotation;
            if(basicAnnotation!=null) {
                println("${basicAnnotation.name}")
                println("${basicAnnotation.age}")
            }
        }


    }

}