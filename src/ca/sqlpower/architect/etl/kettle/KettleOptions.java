/*
 * Copyright (c) 2007, SQL Power Group Inc.
 * 
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in
 *       the documentation and/or other materials provided with the
 *       distribution.
 *     * Neither the name of SQL Power Group Inc. nor the names of its
 *       contributors may be used to endorse or promote products derived
 *       from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package ca.sqlpower.architect.etl.kettle;

import org.apache.log4j.Logger;

/**
 * A container for Kettle-related options.
 */
public class KettleOptions {

    private static final Logger logger = Logger.getLogger(KettleOptions.class);
    
    /**
     * The key to use in an ArchitectDataSource for the repository login
     * name.
     */
    public static final String KETTLE_REPOS_LOGIN_KEY = "ca.sqlpower.architect.etl.kettle.repos.login";

    /**
     * The key to use in an ArchitectDataSource for the repository password.
     */
    public static final String KETTLE_REPOS_PASSWORD_KEY = "ca.sqlpower.architect.etl.kettle.repos.password";
    
    /**
     * The key to use in an ArchitectDataSource for the connection type.
     */
    public static final String KETTLE_CONNECTION_TYPE_KEY = "ca.sqlpower.architect.etl.kettle.connectionType";
    
    /**
     * The string of the url parameter that defines the database name
     */
    public static final String KETTLE_DATABASE = "Database";
    
    /**
     * The key to use in an ArchitectDataSource for the database name.
     */
    public static final String KETTLE_DATABASE_KEY = "ca.sqlpower.architect.etl.kettle.database";

    /**
     * The string of the url parameter that defines the port
     */
    public static final String KETTLE_PORT = "Port";

    /**
     * The key to use in an ArchitectDataSource for the port value.
     */
    public static final String KETTLE_PORT_KEY = "ca.sqlpower.architect.etl.kettle.port";
    
    /**
     * The string of the url parameter that defines the host name
     */
    public static final String KETTLE_HOSTNAME = "Hostname";

    /**
     * The key to use in an ArchitectDataSource for the host name.
     */
    public static final String KETTLE_HOSTNAME_KEY = "ca.sqlpower.architect.etl.kettle.hostname";

}
