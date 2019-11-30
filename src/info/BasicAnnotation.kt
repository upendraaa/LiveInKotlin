package info

/**
 * this is simple example of Annotation, Annotation is called as a Metadata
 */

@Target(AnnotationTarget.FUNCTION) //This will be apply only for functions
@Retention(AnnotationRetention.RUNTIME)// Available for reflection in runtime
annotation class BasicAnnotation(val name:String = "DUMMY",val age:Int = 100){


}