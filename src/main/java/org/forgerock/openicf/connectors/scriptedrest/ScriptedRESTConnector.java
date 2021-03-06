/*
 * DO NOT REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013 ForgeRock AS All rights reserved.
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://forgerock.org/license/CDDLv1.0.html
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at http://forgerock.org/license/CDDLv1.0.html
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 */
package org.forgerock.openicf.connectors.scriptedrest;

import org.forgerock.openicf.connectors.groovy.ScriptedConnector;
import org.identityconnectors.framework.spi.Configuration;
import org.identityconnectors.framework.spi.ConnectorClass;

/**
 * Main implementation of the ScriptedREST Connector.
 *
 * @author Gael Allioux <gael.allioux@forgerock.com>
 */
@ConnectorClass(displayNameKey = "ScriptedREST.connector.display", configurationClass = ScriptedRESTConfiguration.class)
public class ScriptedRESTConnector extends ScriptedConnector {

	private ScriptedRESTConnection connection;

	/**
	 * Callback method to receive the {@link Configuration}.
	 *
	 * @param configuration the new {@link Configuration}
	 */
	@Override
	public void init(final Configuration configuration) {
		this.connection = new ScriptedRESTConnection((ScriptedRESTConfiguration) configuration);
		super.init(configuration);
	}
}