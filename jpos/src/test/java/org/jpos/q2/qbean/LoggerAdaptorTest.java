/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2017 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.q2.qbean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LoggerAdaptorTest {

    @Test
    public void testConstructor() throws Throwable {
        LoggerAdaptor loggerAdaptor = new LoggerAdaptor();
        assertEquals("loggerAdaptor.getLog().getRealm()", "org.jpos.q2.qbean.LoggerAdaptor", loggerAdaptor.getLog().getRealm());
        assertEquals("loggerAdaptor.getState()", -1, loggerAdaptor.getState());
        assertTrue("loggerAdaptor.isModified()", loggerAdaptor.isModified());
    }

    @Test
    public void testDestroyService() throws Throwable {
        LoggerAdaptor loggerAdaptor = new LoggerAdaptor();
        loggerAdaptor.destroyService();
        assertTrue("Test completed without Exception", true);
    }

}
