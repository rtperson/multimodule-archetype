#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * Web.java
 */
package ${package}.ws;

import ${package}.Engine;
import ${package}.common.API;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author generated-by-archetype
 *
 */
@WebService
public class Web {

    /**
     * TODO Replace with Methods to be exposed as WS-* compliant Web Service Methods
     */
    @WebMethod(operationName = "getAvailableImplemenationIds")
    public
    @WebResult(name = "availableImplementationIds", partName = "availableImplementationIds")
    List<String> getAvailableImplemenationIds () {
        List<String> ids = new ArrayList<String>();
        ids.add("");
        return ids;
    }

}
