#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * APIImpl.java
 */
package ${package}.impl;

import ${package}.common.API;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author generated-by-archetype
 *
 */
public class APIImpl implements API {

    private static Logger logger = Logger.getLogger(APIImpl.class.getName());

	// Return the implementation id
    public String getImplementationId() {
        return "Default";
    }
	
	/**
	 * Implementation of API Methods should be done here
	 * TODO Implement the API Methods
	 */
}
