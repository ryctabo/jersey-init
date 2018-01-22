package com.github.ryctabo.jersey;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * The <strong>MyApplication</strong> is responsible to configure
 * the {@link org.glassfish.jersey.servlet.ServletContainer} and register all
 * classes that will handle HTTP requests.
 *
 * @author Gustavo Pacheco (ryctabo at gmail.com)
 * @version 1.0-SNAPSHOT
 */
@ApplicationPath("api")
public class MyApplication extends ResourceConfig {

    /**
     * Create a new instance of {@link MyApplication}.
     * In this constructor the resource classes are loaded.
     */
    public MyApplication() {
        packages("com.github.ryctabo.jersey");
    }

}
