/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2024 jPOS Software SRL
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

package org.jpos.q2.cli.builtin;

import org.jpos.q2.CLICommand;
import org.jpos.q2.CLIContext;

/**
 * Prints the contents of the CLIContext user data.
 *
 * @author Alwyn Schoeman - alwyn.schoeman@gmail.com
 */
public class USERDATA implements CLICommand {
    @Override
    public void exec(CLIContext cli, String[] strings) throws Exception {
        cli.printUserData();
    }
}
