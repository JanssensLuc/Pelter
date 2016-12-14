package com.pelter.data.model.functions;

public @interface Activity {
   
    String description() default "";
    
    /**
     * Getter for property date.
     *
     * @return Value of property date.
     */
    String lastModifiedDate() default "";


    /**
     * Getter for property date.
    *
    * @return Value of property date.
    */
    String createDate() default "";
}