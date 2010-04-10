/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hibu.atek.tordf.communication;

/**
 *
 * @author Tord
 */
public class Protocol
{
    /**
     * Reserve resource
     */
    public final static String REQUEST_RESOURCE = "REQUEST_RESOURCE";

    /**
     * Give resource,
     */
    public final static String RESOURCE_AQUIRED = "RESOURCE_AQUIRED";

    /**
     * Denied
     */
    public final static String RESOURCE_DENIED = "RESOURCE_DENIED";


    public final static String REQUEST_SOURCE = "REQUEST_SOURCE";
    public final static String REQUEST_SOURCE_FAIL = "REQUEST_SOURCE_FAIL";
    public final static String REQUEST_SOURCE_SUCESS = "REQUEST_SOURCE_SUCESS";



    /**
     * Request build of resource
     */
    public final static String BUILD_RESOURCE = "BUILD_RESOURCE";

    /**
     * Result of build, failed[error message], or success
     */
    public final static String BUILD_SUCESS = "BUILD_SUCESS";

    public final static String BUILD_FAILED = "BUILD_FAILED";

    /**
     * Send deploy command
     */
    public final static String DEPLOY_RESOURCE = "DEPLOY_RESOURCE";

    /**
     *
     */
    public final static String DEPLOY_SUCESS = "DEPLOY_SUCESS";

    public final static String DEPLOY_FAILED = "DEPLOY_FAILED";



    /**
     *
     */
    public final static String RUN_RESOURCE = "RUN_RESOURCE";
    public final static String RUN_SUCESS = "RUN_RESULT";
    public final static String RUN_FAIL = "RUN_FAIL";
    public final static String SAVE_RESOURCE = "SAVE_RESOURCE";
    public final static String SAVE_SUCESS = "SAVE_SUCESS";
    public final static String SAVE_FAIL = "SAVE_FAIL";
    public final static String RELEASE_RESOURCE = "RELEASE_RESOURCE";
    public final static String RELEASE_FAIL = "RELEASE_FAIL";
    public final static String RELEASE_SUCESS  = "RELEASE_SUCESS";

    public final static int PORT = 12;

}
